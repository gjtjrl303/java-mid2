package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest2 {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";

        String[] split = text.split(" ");

        Map<String, Integer> map = new HashMap<>();
        for (String string : split) {
            map.put(string, map.getOrDefault(string, 0) +1);
        }

        System.out.println(map);
    }
}
