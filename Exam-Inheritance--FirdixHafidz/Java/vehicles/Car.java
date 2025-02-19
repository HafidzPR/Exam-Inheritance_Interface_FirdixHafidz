package vehicles;

// Kelas Car yang merupakan turunan dari Vehicle
public class Car extends Vehicle {
    private int doorCount; // Jumlah pintu mobil

    // Konstruktor untuk inisialisasi atribut mobil
    public Car(String brand, int year, int doorCount) {
        super(brand, year);
        this.doorCount = doorCount;
    }

    // Metode untuk membuka pintu mobil
    public void openDoor() {
        System.out.println("\n🚪 The car door is now open!\n");
    }

    // Override metode displayInfo untuk menampilkan info tambahan tentang mobil
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("🔹 Doors  : " + doorCount);
        System.out.println("=====================================\n");
    }
}
