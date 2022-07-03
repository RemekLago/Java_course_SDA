package part6.List;

import java.util.ArrayList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();

        list1.add("Home");
        list1.add("Car");
        list1.add("Shoe");
        list1.add("Lamp");
        list1.add("Door");
        list1.add("Lamp");
        printList(list1);

        List1.showDuplicates(list1);
        List1.remove2Duplicates(list1);
//
//        list1.set(2, "Rocket");
//        printList(list1);
//        System.out.println(list1.indexOf("Lamp"));
//        printList(list1);
//        System.out.println(list1.lastIndexOf("Lamp"));
//        list1.remove("Home");
//        printList(list1);
//        list1.remove(1);
//        printList(list1);

    }

    private static void printList(List list1){
        System.out.println(list1);
    }


}
