package vehicles;

// Car mengimplementasikan interface Vehicle
public class Car implements Vehicle {
    private double fuelLevel;

    public Car(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    @Override
    public void startEngine() {
        if (fuelLevel > 0) {
            System.out.println("🚗 Mesin mobil (L539 6.5L V12) dinyalakan. Level bahan bakar: " + fuelLevel + " liter.");
        } else {
            System.out.println("⛽ Bahan bakar tidak cukup untuk menyalakan mobil.");
        }
    }

    @Override
    public void stopEngine() {
        System.out.println("🛑 Mesin mobil dimatikan.");
    }
}
