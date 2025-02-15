package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1 {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";

        String[] split = text.split(" ");

        Map<String, Integer> map = new HashMap<>();
        for (String string : split) {
            if(map.containsKey(string)){
                map.put(string, map.get(string) + 1);
            }
            else{
                map.put(string,1);
            }
        }

        System.out.println(map);
    }
}
