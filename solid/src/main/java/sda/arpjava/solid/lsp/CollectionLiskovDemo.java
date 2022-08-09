package sda.arpjava.solid.lsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionLiskovDemo {
    public static void main(String[] args) {
        // Wydaje się ze naruszona zasada Liskov ale w dokumentacji List jes zgłaszannie wyjatku prze add!!
        // Naruszona jest takze zasada ISP bo metody add, remove, i ser nie są implementowane
        List<String> names = Collections.unmodifiableList(List.of("Ewa"));

        names.add("Adam");
        names.add("Karol");
        names.forEach(System.out::println);

    }
}
