package com.ing.zoo.animals.superclasses;

/**
 * I created base superclass Animal with fields and methods all animals should
 * have. 
 */
public abstract class Animal {
    protected String name;
    protected String helloText;
    protected String eatText;

    /**
     * Gets the animal's name.
     * @return the animal's name.  
     */
    public String getName() {
        return name;
    }

    /**
     * Displays the helloText.
     */
    public abstract void sayHello();
}
