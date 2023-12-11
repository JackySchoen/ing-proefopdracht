package com.ing.zoo.animals;

import com.ing.zoo.animals.superclasses.Herbivore;

public class Hippo extends Herbivore {
    /**
     * Creates an instance of the Hippo class.
     * 
     * @param name the Hippo's name.
     */
    public Hippo(String name) {
        super();
        this.name = name;
        this.helloText = "splash";
        this.eatText = "munch munch lovely";
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
