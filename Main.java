package HousePet;

public class Main {
    public static void main(String[] args) {
        House myHouse = new House("123 Pet Street");

        Dog dog1 = new Dog("Buddy", myHouse);
        Cat cat1 = new Cat("Whiskers", myHouse);

        myHouse.addPet(dog1);
        myHouse.addPet(cat1);

        myHouse.listPets();
        myHouse.makeAllNoises();
    }
}
