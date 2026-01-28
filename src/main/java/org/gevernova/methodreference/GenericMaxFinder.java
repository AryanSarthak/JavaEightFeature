package org.gevernova.methodreference;

import java.util.*;

class GenericMaxFinder {

    // Returns the maximum element from a list using Comparable and method reference
    public static <T extends Comparable<T>> Optional<T> findMax(List<T> list) {
        return list.stream().max(Comparable::compareTo);
    }

    // Executes the program to find and print the maximum value from a list
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 40, 20);
        Optional<Integer> max = findMax(list);

        System.out.println(max.orElse(-1));
    }
}
