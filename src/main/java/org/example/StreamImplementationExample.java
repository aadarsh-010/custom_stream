//package org.example;
//
//import java.util.*;
//import java.util.stream.Collectors;
//
//public class StreamImplementationExample {
//    public static void main(String[] args) {
//        // Sample Employee List
//        List<Employee> employees = Arrays.asList(
//                new Employee("Aadarsh", 24, 75000),
//                new Employee("Ankit", 30, 50000),
//                new Employee("Priya", 28, 90000),
//                new Employee("Raj", 22, 45000),
//                new Employee("Maya", 26, 85000)
//        );
//
//        // 1️⃣ Filter employees with salary > 60,000
//        List<Employee> highEarners = employees.stream()
//                .filter(emp -> emp.getSalary() > 60000)
//                .collect(Collectors.toList());
//
//        System.out.println("Employees with Salary > 60,000:");
//        highEarners.forEach(System.out::println);
//
//        // 2️⃣ Sort employees by age in ascending order
//        List<Employee> sortedByAge = employees.stream()
//                .sorted(Comparator.comparingInt(Employee::getAge))
//                .collect(Collectors.toList());
//
//        System.out.println("\nEmployees Sorted by Age:");
//        sortedByAge.forEach(System.out::println);
//
//        // 3️⃣ Get Names of Employees older than 25
//        List<String> namesAbove25 = employees.stream()
//                .filter(emp -> emp.getAge() > 25)
//                .map(Employee::getName)
//                .collect(Collectors.toList());
//
//        System.out.println("\nEmployees Older Than 25:");
//        namesAbove25.forEach(System.out::println);
//
//        // 4️⃣ Calculate the Average Salary
//        double averageSalary = employees.stream()
//                .mapToDouble(Employee::getSalary)
//                .average()
//                .orElse(0.0);
//
//        System.out.println("\nAverage Salary: " + averageSalary);
//    }
//}
