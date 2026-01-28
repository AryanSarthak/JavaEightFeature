package org.gevernova.methodreference;

import java.util.*;

class OptionalUpperCase {

    // Reads input, converts it to uppercase using Optional and method reference, and prints it
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        Optional.ofNullable(input)
                .map(String::toUpperCase)
                .ifPresent(System.out::println);
    }
}


