package org.gevernova.methodreference;

import java.util.*;
import java.util.stream.*;

class Human {

    // Initializes a Human object with the given age
    Human(int age) {
        this.age = age;
    }

    int age;
}

class RandomPersonGenerator {

    // Generates random Human objects using constructor reference and prints their ages
    public static void main(String[] args) {
        List<Human> list = new Random()
                .ints(5, 1, 50)
                .mapToObj(Human::new)
                .toList();

        list.forEach(p -> System.out.println(p.age));
    }
}
