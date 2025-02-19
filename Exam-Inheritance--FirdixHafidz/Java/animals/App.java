package animals;

public class App {
    public static void main(String[] args) {
        // Basic Inheritance
        Dog dog = new Dog("Buddy", 3);
        Cat cat = new Cat("Whiskers", 2);
        dog.speak();
        cat.speak();

        // Extending Inheritance
        Bird bird = new Bird("Tweety", 1);
        bird.speak(); // Output: Chirp!
        bird.fly();   // Output: Tweety is flying!

        // Polymorphism
        Animal[] animals = {dog, cat, bird};
        for (Animal animal : animals) {
            animal.speak();
        }


        GoldenRetriever goldenRetriever = new GoldenRetriever("Goldie", 4);
        goldenRetriever.speak();
        goldenRetriever.fetch();

        // Credit
        System.out.println("\uD835\uDC6A\uD835\uDC93\uD835\uDC86\uD835\uDC82\uD835\uDC95\uD835\uDC86\uD835\uDC85 \uD835\uDC8A\uD835\uDC8F \uD835\uDC84\uD835\uDC90\uD835\uDC8D\uD835\uDC8D\uD835\uDC82\uD835\uDC83\uD835\uDC90\uD835\uDC93\uD835\uDC82\uD835\uDC95\uD835\uDC8A\uD835\uDC90\uD835\uDC8F \uD835\uDC83\uD835\uDC86\uD835\uDC95\uD835\uDC98\uD835\uDC86\uD835\uDC86\uD835\uDC8F \uD835\uDC6F\uD835\uDC82\uD835\uDC87\uD835\uDC8A\uD835\uDC85\uD835\uDC9B \uD835\uDC77\uD835\uDC96\uD835\uDC95\uD835\uDC93\uD835\uDC82 \uD835\uDC79\uD835\uDC82\uD835\uDC84\uD835\uDC89\uD835\uDC8E\uD835\uDC82\uD835\uDC8F & \uD835\uDC74\uD835\uDC96\uD835\uDC89\uD835\uDC82\uD835\uDC8E\uD835\uDC8E\uD835\uDC82\uD835\uDC85 \uD835\uDC68\uD835\uDC8D\uD835\uDC82\uD835\uDC8E \uD835\uDC6D\uD835\uDC8A\uD835\uDC93\uD835\uDC85\uD835\uDC82\uD835\uDC96\uD835\uDC94");

    }
}