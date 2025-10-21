package HousePet;

public class Cat extends Pet {
    public Cat(String name, House home) {
        super(name, home);
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " says: Meow!");
    }
}
