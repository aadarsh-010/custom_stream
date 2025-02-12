//package org.example;
//
//import java.util.*;
//import java.util.function.Predicate;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//public class CustomStreamUtils {
//
//
//    public static <T> Stream<T> myFilter(Stream<T> stream, Predicate<T> predicate) {
//        return stream.flatMap(element -> predicate.test(element) ? Stream.of(element) : Stream.empty());
//    }
//
//
//
//    public static void main(String[] args) {
//
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//
////        CustomStreamUtils.myFilter(numbers.stream(), num -> num % 2 == 0)
////                .forEach(System.out::println);
//
//        Stream<Integer> st =  CustomStreamUtils.myFilter(numbers.stream(), num -> num % 2 == 0);
//
//       st.forEach(System.out::println);
//
//    }
//}
