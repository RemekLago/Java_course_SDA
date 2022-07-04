package part6.MapTest;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {

        Map<String, Integer> people = new HashMap<>();
        people.put("Ola", 24);
        people.put("Kasia", 45);
        people.put("Pawel", 30);
        people.put("Janek", 28);

        System.out.println(people);

        people.put("Ola", 50);
        System.out.println(people);

        for (String key : people.keySet()){
            System.out.println(key + " " + people.get(key));
        }

        Map<String, Integer> people1 = new LinkedHashMap<>(people);
        Map<String, Integer> people2 = new TreeMap<>(people);
    }
}
