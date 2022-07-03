package part6.List;

import java.util.ArrayList;
import java.util.List;

public class List1 {

    public static void showDuplicates(List<String> list) {
        List<String> duplicates = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.indexOf(list.get(i)) != list.lastIndexOf(list.get(i))) {
                duplicates.add(list.get(i));
            }
        }
        for (int j=0; j < duplicates.size(); j++){
            duplicates.remove(duplicates.lastIndexOf((duplicates.get(j))));
        }

        System.out.println("Duplicates: " + duplicates);
    }

    public static void remove2Duplicates(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.indexOf(list.get(i)) != list.lastIndexOf(list.get(i))) {
                list.remove(list.get(i));
                // dodac while az usunie wszytskie duplikaty
            }
        }
        System.out.println("List without duplicates: " + list);
    }
}
