package org.gevernova.methodreference;

interface Calculator {

    // Performs a calculation using two integer values
    int calculate(int a, int b);
}

class Operations {

    // Returns the sum of two numbers
    static int add(int a, int b) { return a + b; }

    // Returns the difference of two numbers
    static int sub(int a, int b) { return a - b; }

    // Returns the product of two numbers
    static int mul(int a, int b) { return a * b; }

    // Returns the quotient of two numbers
    static int div(int a, int b) { return a / b; }
}

class CalculatorApp {

    // Executes calculator operations using method references
    public static void main(String[] args) {

        Calculator c1 = Operations::add;
        Calculator c2 = Operations::sub;
        Calculator c3 = Operations::mul;
        Calculator c4 = Operations::div;

        System.out.println(c1.calculate(10, 5));
        System.out.println(c2.calculate(10, 5));
        System.out.println(c3.calculate(10, 5));
        System.out.println(c4.calculate(10, 5));
    }
}
