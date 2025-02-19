package vehicles;

// Kelas dasar Vehicle
public class Vehicle {
    protected String brand; // Merek kendaraan
    protected int year;     // Tahun pembuatan

    // Konstruktor untuk menginisialisasi merek dan tahun
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Metode untuk mengemudikan kendaraan
    public void drive() {
        System.out.println("\n🚗💨 The vehicle is driving...\n");
    }

    // Metode untuk menampilkan informasi kendaraan
    public void displayInfo() {
        System.out.println("=====================================");
        System.out.println("🚘 Vehicle Information:");
        System.out.println("🔹 Brand  : " + brand);
        System.out.println("🔹 Year   : " + year);
    }
}
