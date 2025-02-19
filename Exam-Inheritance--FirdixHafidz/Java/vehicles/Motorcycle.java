package vehicles;

// Kelas Motorcycle yang merupakan turunan dari Vehicle
public class Motorcycle extends Vehicle {
    private boolean hasSidecar; // Apakah motor memiliki sidecar atau tidak

    // Konstruktor untuk inisialisasi atribut motor
    public Motorcycle(String brand, int year, boolean hasSidecar) {
        super(brand, year);
        this.hasSidecar = hasSidecar;
    }

    // Metode untuk melakukan wheelie
    public void popWheelie() {
        System.out.println("\n🏍️🔥 The motorcycle is doing a wheelie!\n");
    }

    // Override metode displayInfo untuk menampilkan info tambahan tentang motor
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("🔹 Sidecar: " + (hasSidecar ? "✅ Yes" : "❌ No"));
        System.out.println("=====================================\n");
    }
}
