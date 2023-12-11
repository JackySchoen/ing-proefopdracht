package com.ing.zoo.animals;

import java.util.Random;

import com.ing.zoo.animals.interfaces.Performer;
import com.ing.zoo.animals.superclasses.Omnivore;

public class Pig extends Omnivore implements Performer {
    private String trick;

    /**
     * Creates an instance of the Pig class.
     * 
     * @param name the Pig's name.
     */
    public Pig(String name) {
        super();
        this.name = name;
        this.helloText = "splash";
    }

    /**
     * Displays the helloText.
     */
    @Override
    public void sayHello() {
        System.out.println(helloText);
    }

    /**
     * Displays the eatText.
     */
    @Override
    public void eatLeaves() {
        eatText = "munch munch oink";
        System.out.println(eatText);
    }

    /**
     * Displays the eatText.
     */
    @Override
    public void eatMeat() {
        eatText = "nomnomnom oink thx";
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
            trick = "rolls in the mud";
        } else {
            trick = "runs in circles";
        }
        System.out.println(trick);
    }
}
