package org.gevernova.problemstatement.employeeprocessor;


import java.util.*;
import java.util.stream.*;

class EmployeeService {

    // Processes employees: filters, sorts, groups, and calculates average salaries
    static void process(List<Employee> list) {

        // Filter Engineering employees with salary > 80000 and sort by salary descending
        List<Employee> filtered =
                list.stream()
                        .filter(e -> e.getDepartment().equalsIgnoreCase("Engineering"))
                        .filter(e -> e.getSalary() > 80000)
                        .sorted(Comparator.comparing(Employee::getSalary).reversed())
                        .toList();

        // Group filtered employees by department
        Map<String, List<Employee>> grouped =
                filtered.stream()
                        .collect(Collectors.groupingBy(Employee::getDepartment));

        // Calculate average salary per department
        Map<String, Double> avgSalary =
                list.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.averagingDouble(Employee::getSalary)));

        // Print filtered list, grouped map, and average salaries
        System.out.println(filtered);
        System.out.println(grouped);
        System.out.println(avgSalary);
    }
}

