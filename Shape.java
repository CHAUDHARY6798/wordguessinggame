public class Shape {
    public double getPerimeter() {
        return 0.0;
    }

    public double getArea() {
        return 0.0;
    }
}

// Circle.java
// Child class Circle
 class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
// Main.java
// Main class
 class Main {
    public static void main(String[] args) {
    double r = 8.0;
    Circle c1 = new Circle(r);
    System.out.println("Radius of the circle="+r);
    System.out.println("Perimeter: " + c1.getPerimeter());
    System.out.println("Area: " + c1.getArea());
    r = 3.2;
    Circle c2 = new Circle(r);
    System.out.println("\nRadius of the circle="+r);
    System.out.println("Perimeter: " + c2.getPerimeter());
    System.out.println("Area: " + c2.getArea());
    }
}
