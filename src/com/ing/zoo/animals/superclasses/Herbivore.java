package com.ing.zoo.animals.superclasses;

/**
 * I created a Herbivore superclass which extends Animal. This way, only
 * herbivore animals who extend this class will be able to call the eatLeaves
 * method and animals that extend Carnivore won't be able to call this method.
 */
public abstract class Herbivore extends Animal {
    public abstract void eatLeaves();
}
