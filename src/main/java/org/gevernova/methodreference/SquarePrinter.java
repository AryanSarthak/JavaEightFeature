package org.gevernova.methodreference;

import java.util.*;

class SquarePrinter {

    // Prints the square of the given number
    static void printSquare(int n) {
        System.out.println(n * n);
    }

    // Iterates over a list and prints squares using method reference
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 3, 4, 5);
        list.forEach(SquarePrinter::printSquare);
    }
}
