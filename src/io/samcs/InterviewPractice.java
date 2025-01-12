package io.samcs;

import java.util.*;

public class InterviewPractice {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
            map.put("A", 1);
            map.put("B", 2);
            map.put("C", 3);
            map.put("D", 4);

//        map.entrySet()
//                .stream()
//                .peek(entry -> System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue()))
//                .filter(entry -> entry.getValue() > 2)
//                .forEach(System.out::println);

        List<String> names = new ArrayList<>();
        names.add("Bob");
        names.add("David");
        names.add("Alice");
        names.add("Charlie");

//        names.sort(String::compareToIgnoreCase);
//        names.sort(Comparator.comparing(String::length));
//        names.sort(Comparator.comparingInt(String::length).reversed());
//        names.sort(Comparator.comparingInt(String::length).thenComparing(String::compareToIgnoreCase));
        names.sort(Comparator.naturalOrder());
        names.forEach(System.out::println);
    }
}
