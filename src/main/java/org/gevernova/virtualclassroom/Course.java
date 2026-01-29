package org.gevernova.virtualclassroom;

import java.util.*;

public class Course {
    int id;
    String name;
    Instructor instructor;
    Set<Student> enrolledStudents = new HashSet<>();
    Map<Student, String> assignments = new HashMap<>();
    Map<Student, Integer> grades = new HashMap<>();

    public Course(int id, String name, Instructor instructor) {
        this.id = id;
        this.name = name;
        this.instructor = instructor;
    }
}

