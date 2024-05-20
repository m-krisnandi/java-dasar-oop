package ecommerce.application;

import ecommerce.annotation.Fancy;
import ecommerce.data.Animal;
import ecommerce.data.Cat;

@Fancy(name = "AnimalApp", tags = {"application", "java"})
public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.name = "neko";
        animal.run();
    }
}
