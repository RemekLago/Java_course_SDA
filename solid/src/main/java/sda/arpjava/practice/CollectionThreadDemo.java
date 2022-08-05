package sda.arpjava.practice;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CollectionThreadDemo {
    public static void main(String[] args) {
        Random random = new Random();

        //dzielony między wątkami zasób musi być synchronizowany!!!
        Queue<String> queue = new ArrayBlockingQueue<>(100);
        ExecutorService serviceProducer = Executors.newSingleThreadExecutor();
        ExecutorService serviceConsumer = Executors.newSingleThreadExecutor();
        serviceProducer.execute(() -> {
            while(true) {
                //ta lista może być używana wewnątrz wątku, jeśli jej nie udostępnimy innemu wątkowi
                List<String> list = new ArrayList<>();
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                String str = "" + ((char)('A' + random.nextInt(27)));
                queue.offer(str);
                System.out.println("Producer: " + str);
            }
        });

        serviceConsumer.execute(() -> {
            while(true) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if (!queue.isEmpty()) {
                    final String item = queue.poll();
                    System.out.println("Consumer: " + item);
                }
            }
        });

    }
}
