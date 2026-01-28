package org.gevernova.methodreference;

import java.util.*;

public class SortString {

    // Sorts a list of strings ignoring case using method reference and prints the result
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Banana", "apple", "Orange");
        list.sort(String::compareToIgnoreCase);
        System.out.println(list);
    }
}

