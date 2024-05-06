package ecommerce.application;

import ecommerce.data.Animal;
import ecommerce.data.Cat;

public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.name = "neko";
        animal.run();
    }
}
