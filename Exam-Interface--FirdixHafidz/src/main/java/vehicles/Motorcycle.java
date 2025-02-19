package vehicles;

// Motorcycle mengimplementasikan interface Vehicle
public class Motorcycle implements Vehicle {
    private String engineType;

    public Motorcycle(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public void startEngine() {
        System.out.println("🏍️ Mesin motor (" + engineType + ") dinyalakan.");
    }

    @Override
    public void stopEngine() {
        System.out.println("🛑 Mesin motor dimatikan.");
    }
}
