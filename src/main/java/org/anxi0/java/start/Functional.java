package org.anxi0.java.start;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.BinaryOperator;

public class Functional {

    public static void main() {
//        Calculator cal = (a, b) -> a + b;
//        BiFunction<Integer,Integer,Integer> cal = (a,b)-> Integer.sum(a,b);
        BinaryOperator<Integer> cal = Integer::sum;

//        int result = cal.sum(3, 4);
        int result = cal.apply(3, 4);
//        System.out.println(result);

//        stream();
        Q4();
        Q5();
    }

    private static void Q4() {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] result = Arrays.stream(numbers).boxed().filter(a -> a % 2 == 0).map(a -> a * 2)
            .mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(result));
    }

    private static void Q5() {
        int[] numbers = {1, -2, 3, -5, 8, -3};
        int[] result = Arrays.stream(numbers).boxed().filter(a -> a > 0).mapToInt(Integer::intValue)
            .toArray();
        System.out.println(Arrays.toString(result));
    }

    @FunctionalInterface // For using line 6. Lambda interface can't have methods more than 1.
    private interface Calculator {

        int sum(int a, int b);
    }

    private static void stream() {

        int[] data = {5, 6, 4, 2, 3, 1, 1, 2, 2, 4, 8};
        // If I'm trying to manufacture this array to
        //  int[] result = {8, 6, 4, 2}; this, process would be like
        // 1. Remove duplicated numbers
        // 2. Remove odds
        // 3. sort decreasingly
        // The best code using "Stream" would be like
        int[] result = Arrays.stream(data).boxed().distinct().filter(a -> a % 2 == 0)
            .sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(result));
    }
}

