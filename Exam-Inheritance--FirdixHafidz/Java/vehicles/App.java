package vehicles;

// Kelas utama untuk menjalankan program
public class App {
    public static void main(String[] args) {
        // Membuat objek Car
        Car car = new Car("Toyota", 2020, 4);
        car.displayInfo(); // Menampilkan informasi mobil
        car.drive();       // Memanggil metode drive()
        car.openDoor();    // Memanggil metode openDoor()

        // Baris kosong untuk keterbacaan output
        System.out.println("\n-------------------------------------\n");

        // Membuat objek Motorcycle
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", 2019, true);
        motorcycle.displayInfo(); // Menampilkan informasi motor
        motorcycle.drive();       // Memanggil metode drive()
        motorcycle.popWheelie();  // Memanggil metode popWheelie()

        System.out.println("Emojis for the win🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥");
        // Credit
        System.out.println("\uD835\uDC6A\uD835\uDC93\uD835\uDC86\uD835\uDC82\uD835\uDC95\uD835\uDC86\uD835\uDC85 \uD835\uDC8A\uD835\uDC8F \uD835\uDC84\uD835\uDC90\uD835\uDC8D\uD835\uDC8D\uD835\uDC82\uD835\uDC83\uD835\uDC90\uD835\uDC93\uD835\uDC82\uD835\uDC95\uD835\uDC8A\uD835\uDC90\uD835\uDC8F \uD835\uDC83\uD835\uDC86\uD835\uDC95\uD835\uDC98\uD835\uDC86\uD835\uDC86\uD835\uDC8F \uD835\uDC6F\uD835\uDC82\uD835\uDC87\uD835\uDC8A\uD835\uDC85\uD835\uDC9B \uD835\uDC77\uD835\uDC96\uD835\uDC95\uD835\uDC93\uD835\uDC82 \uD835\uDC79\uD835\uDC82\uD835\uDC84\uD835\uDC89\uD835\uDC8E\uD835\uDC82\uD835\uDC8F & \uD835\uDC74\uD835\uDC96\uD835\uDC89\uD835\uDC82\uD835\uDC8E\uD835\uDC8E\uD835\uDC82\uD835\uDC85 \uD835\uDC68\uD835\uDC8D\uD835\uDC82\uD835\uDC8E \uD835\uDC6D\uD835\uDC8A\uD835\uDC93\uD835\uDC85\uD835\uDC82\uD835\uDC96\uD835\uDC94");

    }
}
