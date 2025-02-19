package shapes;

// Rectangle mengimplementasikan interface Shape
public class Rectangle implements Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }

    // Method untuk menampilkan informasi persegi panjang
    public void displayInfo() {
        System.out.println("🟦 Rectangle:");
        System.out.println("  - Length   : " + length);
        System.out.println("  - Width    : " + width);
        System.out.println("  - Area     : " + area());
        System.out.println("  - Perimeter: " + perimeter());
    }
}
