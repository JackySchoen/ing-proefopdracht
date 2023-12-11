package com.ing.zoo.animals;

import com.ing.zoo.animals.superclasses.Carnivore;

public class Lion extends Carnivore {
    /**
     * Creates an instance of the Lion class.
     * 
     * @param name the Lion's name.
     */
    public Lion(String name) {
        super();
        this.name = name;
        this.helloText = "roooaoaaaaar";
        this.eatText = "nomnomnom thx mate";
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
    public void eatMeat() {
        System.out.println(eatText);
    }
}
