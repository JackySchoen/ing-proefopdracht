package com.ing.zoo.animals.superclasses;

/**
 * I created a Carnivore superclass which extends Animal. This way, only
 * carnivore animals who extend this class will be able to call the eatMeat
 * method and animals that extend Herbivore won't be able to call this method.
 */
public abstract class Carnivore extends Animal {
    public abstract void eatMeat();
}
