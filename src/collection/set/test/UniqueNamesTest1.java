package collection.set.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueNamesTest1 {

    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};

        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(inputArr));

        System.out.println(set);
    }
}
