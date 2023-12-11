package com.ing.zoo.animals;

import java.util.Random;

import com.ing.zoo.animals.interfaces.Performer;
import com.ing.zoo.animals.superclasses.Carnivore;

public class Tiger extends Carnivore implements Performer {
    private String trick;

    /**
     * Creates an instance of the Tiger class.
     * 
     * @param name the Tiger's name.
     */
    public Tiger(String name) {
        super();
        this.name = name;
        this.helloText = "rraaarww";
        this.eatText = "nomnomnom oink wubalubadubdub";
    }

    /**
     * Displays the helloText.
     */
    @Override
    public void sayHello() {
        System.out.println(helloText);
    }

    /**
     * Displays the eatText for animals who eat meat.
     */
    @Override
    public void eatMeat() {
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
            trick = "jumps in tree";
        } else {
            trick = "scratches ears";
        }
        System.out.println(trick);
    }
}
