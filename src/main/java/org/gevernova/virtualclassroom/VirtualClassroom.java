package org.gevernova.virtualclassroom;

import java.util.*;

public class VirtualClassroom{

    static Map<Integer, Course> courses = new HashMap<>();
    static Map<Integer, Student> students = new HashMap<>();

    public static void main(String[] args) {

        Instructor instructor = new Instructor(1, "Karthik");

        Course java = new Course(101, "Java", instructor);
        courses.put(java.id, java);

        Student s1 = new Student(1, "Aryan");
        Student s2 = new Student(2, "Rahul");

        students.put(s1.id, s1);
        students.put(s2.id, s2);

        enrollStudent(101, 1);
        enrollStudent(101, 2);

        startLiveSession(101);

        submitAssignment(101, 1, "Assignment 1");
        submitAssignment(101, 2, "Assignment 1");

        gradeStudent(101, 1, 85);
        gradeStudent(101, 2, 90);

        showGrades(101);
    }

    static void enrollStudent(int courseId, int studentId) {
        Course course = courses.get(courseId);
        Student student = students.get(studentId);
        course.enrolledStudents.add(student);
        System.out.println(student.name + " enrolled in " + course.name);
    }

    static void startLiveSession(int courseId) {
        System.out.println("Live session started for " + courses.get(courseId).name);
    }

    static void submitAssignment(int courseId, int studentId, String submission) {
        Course course = courses.get(courseId);
        Student student = students.get(studentId);
        course.assignments.put(student, submission);
        System.out.println(student.name + " submitted assignment");
    }

    static void gradeStudent(int courseId, int studentId, int grade) {
        Course course = courses.get(courseId);
        Student student = students.get(studentId);
        course.grades.put(student, grade);
    }

    static void showGrades(int courseId) {
        Course course = courses.get(courseId);
        System.out.println("Grades for " + course.name);
        for (Map.Entry<Student, Integer> e : course.grades.entrySet()) {
            System.out.println(e.getKey().name + " : " + e.getValue());
        }
    }
}

