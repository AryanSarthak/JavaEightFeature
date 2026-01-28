package org.gevernova.problemstatement.employeeprocessor;


import java.util.List;

public class Main {
    public static void main(String[] args){

        List<Employee> list = List.of(
                new Employee(1,"Aryan","Engineering",90000),
                new Employee(2,"Rahul","HR",60000),
                new Employee(3,"Amit","Engineering",120000)
        );

        EmployeeService.process(list);
    }
}
