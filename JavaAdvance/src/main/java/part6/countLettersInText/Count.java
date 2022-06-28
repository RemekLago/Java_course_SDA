package part6.countLettersInText;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Count {

    public static Void countingLetters(String text){
        String tmpText = text.replace(".", "");
        tmpText = tmpText.replace(",", "");
        tmpText = tmpText.replace(" ", "");
        tmpText = tmpText.toLowerCase();

        String[] tmpTable = tmpText.split("");

        Map<String, Set<Integer>> words = new HashMap<>();

        for (int i = 0; i < tmpTable.length; i++) {
            Set<Integer> index = new LinkedHashSet<>();
            if (words.containsKey(tmpTable[i])){
                index = words.get(tmpTable[i]);
                index.add(i);
                words.put(tmpTable[i], index);
            } else {
                index.add(i);
                words.put(tmpTable[i], index);
            }
        }

        for (String key : words.keySet()) {
            System.out.println(key + " -> " + words.get(key));
        }
        return null;
    }

}
