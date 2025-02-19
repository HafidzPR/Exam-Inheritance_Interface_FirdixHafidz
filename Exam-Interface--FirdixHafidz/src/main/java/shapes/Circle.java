package shapes;

// Circle mengimplementasikan interface Shape
public class Circle implements Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    // Method untuk menampilkan informasi lingkaran
    public void displayInfo() {
        System.out.println("🟢 Circle:");
        System.out.println("  - Radius   : " + radius);
        System.out.println("  - Area     : " + area());
        System.out.println("  - Perimeter: " + perimeter());
    }
}
