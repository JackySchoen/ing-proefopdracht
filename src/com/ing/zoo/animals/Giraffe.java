package com.ing.zoo.animals;

import com.ing.zoo.animals.superclasses.Herbivore;

public class Giraffe extends Herbivore {
    /**
     * Creates an instance of the Giraffe class.
     * 
     * @param name the Giraffe's name.
     */
    public Giraffe(String name) {
        super();
        this.name = name;
        this.helloText = "hello I'm very tall!";
        this.eatText = "munch munch good leaves";
    }

    /**
     * Displays the helloText.
     */
    @Override
    public void sayHello() {
        System.out.println(helloText);
    }

    /**
     * Displays the eatText for animals who eat leaves.
     */
    @Override
    public void eatLeaves() {
        System.out.println(eatText);
    }
}
