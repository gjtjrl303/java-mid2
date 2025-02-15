package collection.map.test;

import java.util.*;

public class ItemPriceTest {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("사과", 500);
        map.put("바나나", 500);
        map.put("망고", 1000);
        map.put("딸기", 1000);

/*        System.out.print("[");
        int key = 0;
        for (String string : map.keySet()) {
            if(map.get(string) == 1000){
                if(key != 0){
                    System.out.print(",");
                }
                key =1;
                System.out.print(string);
            }
        }
        System.out.println("]");*/

        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(1000)) {
                list.add(entry.getKey());
            }
        }

        System.out.println(list);
    }
}
