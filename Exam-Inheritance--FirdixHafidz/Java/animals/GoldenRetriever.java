package animals;

public class GoldenRetriever extends Dog {
    public GoldenRetriever(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println("Golden Woof!");
    }

    public void fetch() {
        System.out.println(name + " is fetching the ball!");
    }
}