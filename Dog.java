package HousePet;

public class Dog extends Pet {
    public Dog(String name, House home) {
        super(name, home);
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " says: Woof! Woof!");
    }
}
