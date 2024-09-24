package br.com.challenges.curso2.tests;

import br.com.challenges.curso2.model.Cat;
import br.com.challenges.curso2.model.Dog;

public class AnimalTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeNoise();
        dog.wagTail();

        Cat cat = new Cat();
        cat.makeNoise();
        cat.sratchFurniture();
    }
}
