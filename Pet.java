package HousePet;

public abstract class Pet {
    protected String name;
    protected House home;

    public Pet(String name, House home) {
        this.name = name;
        this.home = home;
    }

    public String getName() {
        return name;
    }

    public House getHome() {
        return home;
    }

    public abstract void makeNoise();
}
