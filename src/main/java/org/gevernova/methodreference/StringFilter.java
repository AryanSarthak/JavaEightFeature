package org.gevernova.methodreference;

import java.util.*;

class StringFilter {

    // Returns true if the string contains the character 'a'
    static boolean hasA(String s) {
        return s.contains("a");
    }

    // Filters a list of strings to only those containing 'a' and prints them
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "python", "cpp");
        list.stream()
                .filter(StringFilter::hasA)
                .forEach(System.out::println);
    }
}
