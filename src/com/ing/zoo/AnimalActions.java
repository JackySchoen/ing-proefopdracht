package com.ing.zoo;

import java.util.Map;
import java.util.HashMap;

import com.ing.zoo.animals.*;
import com.ing.zoo.animals.interfaces.Performer;
import com.ing.zoo.animals.superclasses.*;

/**
 * I created this class for encapsulation and readability of the animals and
 * their output for each command.
 */
public class AnimalActions {
    private Map<String, Animal> animals;

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
    private Map<String, Animal> getAnimals() {
        Map<String, Animal> animals = new HashMap<String, Animal>();
        animals.put("henk", new Lion("henk"));
        animals.put("elsa", new Hippo("elsa"));
        animals.put("dora", new Pig("dora"));
        animals.put("wally", new Tiger("wally"));
        animals.put("marty", new Zebra("marty"));
        animals.put("ed", new Hyena("ed"));
        animals.put("piet", new Giraffe("piet"));

        return animals;
    }

    /**
     * All animals will display their helloText.
     */
    public void allAnimalsSayHello() {
        for (Animal animal : animals.values()) {
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
        Animal animal = animals.get(animalName);
        if (animal == null) {
            System.out.println("Unknown command: " + input);
        } else {
            animal.sayHello();
        }
    }

    /**
     * Animals that eat leaves (herbivores and omnivores) will display their
     * eatText.
     */
    public void giveLeaves() {
        for (Animal animal : animals.values()) {
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
        for (Animal animal : animals.values()) {
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
        for (Animal animal : animals.values()) {
            if (animal instanceof Performer) {
                ((Performer) animal).performTrick();
            }
        }
    }
}
