package org.gevernova.problemstatement.employeeprocessor;


class Employee {
    int id;
    String name;
    String department;
    double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() { return department; }
    public double getSalary() { return salary; }

    public String toString() {
        return id+" "+name+" "+department+" "+salary;
    }
}
