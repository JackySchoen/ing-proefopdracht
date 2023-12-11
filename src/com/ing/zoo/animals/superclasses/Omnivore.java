package com.ing.zoo.animals.superclasses;

/**
 * I created an Omnivore superclass that extends Animal. This way, omnivores
 * will have access to both the eatMeat and the eatLeaves method.
 */
public abstract class Omnivore extends Animal {
    public abstract void eatMeat();

    public abstract void eatLeaves();
}
