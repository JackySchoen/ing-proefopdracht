package com.ing.zoo.animals;

import java.util.Random;

import com.ing.zoo.animals.interfaces.Performer;
import com.ing.zoo.animals.superclasses.Herbivore;

public class Zebra extends Herbivore implements Performer {
    private String trick;

    /**
     * Creates an instance of the Zebra class.
     * 
     * @param name the Zebra's name.
     */
    public Zebra(String name) {
        super();
        this.name = name;
        this.helloText = "zebra zebra";
        this.eatText = "munch munch zank yee bra";
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

    /**
     * Displays the trick.
     */
    @Override
    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            trick = "stands on two legs";
        } else {
            trick = "jumps over lion";
        }
        System.out.println(trick);
    }
}
