package part6.WordsInText;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CountWordsInText {

    public static void countingWordsInText(String text) {
        // find and replace '.' and ',' in text and remove, create table with words
        String tmpText = text.replace(",", "");
        tmpText = tmpText.replace(".", "");
        String[] tableWithWords = tmpText.split(" ");

        Map<String, Integer> Words = new HashMap<>();
        for (int i = 0; i < tableWithWords.length; i++) {
            int counter;
            if (Words.containsKey(tableWithWords[i])) {
                counter = Words.get(tableWithWords[i]) + 1;
                Words.put(tableWithWords[i], counter);
            } else {
                counter = 1;
                Words.put(tableWithWords[i], counter);
            }
        }

        for (String key : Words.keySet()) {
            System.out.println(key + " " + Words.get(key));
        }
        System.out.println("----------------------");

        Map<String, Integer> Words2 = new TreeMap<>(Words);
        for (String key : Words2.keySet()) {
            System.out.println(key + " " + Words2.get(key));
        }
    }
}

