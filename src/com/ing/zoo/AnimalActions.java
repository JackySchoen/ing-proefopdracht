package com.ing.zoo;

import com.ing.zoo.animals.*;
import com.ing.zoo.animals.interfaces.Performer;
import com.ing.zoo.animals.superclasses.*;

/**
 * I created this class for encapsulation and readability of the animals and
 * their output for each command.
 */
public class AnimalActions {
    private Animal[] animals;

    /**
     * Creates an instance of the AnimalActions class.
     * Initializes the animals field.
     */
    public AnimalActions() {
        animals = getAnimals();
    }

    /**
     * Gets a map containing the animals name and the animal instance as key-value
     * pairs.
     * 
     * @return a map containing the animals name and the animal instance as
     *         key-value pairs.
     */
    private Animal[] getAnimals() {
        Animal[] animals = new Animal[7];
        animals[0] = new Lion("henk");
        animals[1] = new Hippo("elsa");
        animals[2] = new Pig("dora");
        animals[3] = new Tiger("wally");
        animals[4] = new Zebra("marty");
        animals[5] = new Hyena("ed");
        animals[6] = new Giraffe("piet");

        return animals;
    }

    /**
     * All animals will display their helloText.
     */
    public void allAnimalsSayHello() {
        for (Animal animal : animals) {
            animal.sayHello();
        }
    }

    /**
     * Only a specific animal (based on user input) will display their helloText.
     * 
     * @param input    the user's input.
     * @param commands the list with known commands.
     */
    public void specificAnimalSaysHello(String input, String[] commands) {
        String animalName = input.substring(commands[0].length() + 1);
        Animal chosenAnimal = null;

        for (Animal animal : animals) {
            if (animal.getName().equals(animalName)) {
                chosenAnimal = animal;
            }
        }

        if (chosenAnimal == null) {
            System.out.println("Unknown command: " + input);
        } else {
            chosenAnimal.sayHello();
        }
    }

    /**
     * Animals that eat leaves (herbivores and omnivores) will display their
     * eatText.
     */
    public void giveLeaves() {
        for (Animal animal : animals) {
            if (animal instanceof Herbivore) {
                ((Herbivore) animal).eatLeaves();
            } else if (animal instanceof Omnivore) {
                ((Omnivore) animal).eatLeaves();
            }
        }
    }

    /**
     * Animals that eat meat (carnivores and omnivores) will display their eatText.
     */
    public void giveMeat() {
        for (Animal animal : animals) {
            if (animal instanceof Carnivore) {
                ((Carnivore) animal).eatMeat();
            } else if (animal instanceof Omnivore) {
                ((Omnivore) animal).eatMeat();
            }
        }
    }

    /**
     * Animals that can perform tricks (performers) will display their trick.
     */
    public void performTrick() {
        for (Animal animal : animals) {
            if (animal instanceof Performer) {
                ((Performer) animal).performTrick();
            }
        }
    }
}
