package com.ing.zoo.animals;

import com.ing.zoo.animals.superclasses.Carnivore;

public class Hyena extends Carnivore {
    /**
     * Creates an instance of the Hyena class.
     * 
     * @param name the Hyena's name.
     */
    public Hyena(String name) {
        super();
        this.name = name;
        this.helloText = "hehehehe";
        this.eatText = "nomnomnom hehehe good meat thx";
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
}
