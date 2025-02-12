package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(32, 22, 22 ,22, 31, 14, 15, 16);

        MyStream.of(numbers)
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .map(n->n+2)
                .sorted((a, b) -> a - b)
                .distinct()
                .forEach(System.out::println);
    }
}
