package animals;

public class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println("Chirp!");
    }

    public void fly() {
        System.out.println(name + " is flying!");
    }
}