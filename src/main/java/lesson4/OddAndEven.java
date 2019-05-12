package lesson4;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class OddAndEven {
    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3};
        System.out.println(getOddAndEven(integers));
    }

    private static String getOddAndEven(Integer [] ints) {
        List<Integer> integers = Arrays.asList(ints);

        return  integers.
                stream().
                map(e -> e%2==0 ? "e" + e : "o" + e).
                collect(Collectors.joining(",", "{", "}"));
    }
}
