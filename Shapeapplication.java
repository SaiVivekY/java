class Shape {

    void display() {
        System.out.println("Calculating Area of Shape");
    }
}

class Circle extends Shape {

    double radius = 5;

    void area() {
        System.out.println("Area of Circle: " + (3.14 * radius * radius));
    }
}

class Rectangle extends Shape {

    int length = 10;
    int breadth = 5;

    void area() {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }
}


public class Shapeapplication{

    public static void main(String[] args) {

        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.display();
        c.area();

        r.display();
        r.area();
    }
}