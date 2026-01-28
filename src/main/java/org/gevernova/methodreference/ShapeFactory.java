package org.gevernova.methodreference;

interface ShapeCreator {

    // Creates and returns a Rectangle object with given length and breadth
    Rectangle create(int l, int b);
}

class Rectangle {

    int l;
    int b;

    // Initializes a Rectangle with given length and breadth
    Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }
}

class ShapeFactory {

    // Creates a Rectangle using constructor reference and prints its area
    public static void main(String[] args) {
        ShapeCreator sc = Rectangle::new;
        Rectangle r = sc.create(10, 5);
        System.out.println(r.l * r.b);
    }
}
