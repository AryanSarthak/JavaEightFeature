package org.gevernova.methodreference;

import java.util.*;

class UpperCaseConverter {

    // Converts all strings in the list to uppercase and prints them
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "spring", "react");

        list.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
