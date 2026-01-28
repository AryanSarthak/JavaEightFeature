package org.gevernova.methodreference;

import java.util.*;

class Person {

    // Initializes a Person object with the given name
    Person(String name) {
        this.name = name;
    }

    // Returns the name of the person
    String getName() {
        return name;
    }

    String name;
}

class Main {

    // Creates a list of Person objects and prints their names using method references
    public static void main(String[] args) {
        List<Person> list = Arrays.asList(
                new Person("Aryan"),
                new Person("Shiva"),
                new Person("Kaur")
        );

        list.stream()
                .map(Person::getName)
                .forEach(System.out::println);
    }
}
