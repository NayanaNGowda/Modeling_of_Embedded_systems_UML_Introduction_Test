package HousePet;

import java.util.ArrayList;
import java.util.List;

public class House {
    private String address;
    private List<Pet> pets;

    public House(String address) {
        this.address = address;
        this.pets = new ArrayList<>();
    }

    public void addPet(Pet pet) {
        pets.add(pet);
    }

    public void listPets() {
        System.out.println("Pets living in " + address + ":");
        for (Pet p : pets) {
            System.out.println("- " + p.getName());
        }
    }

    public void makeAllNoises() {
        for (Pet p : pets) {
            p.makeNoise();
        }
    }
}
