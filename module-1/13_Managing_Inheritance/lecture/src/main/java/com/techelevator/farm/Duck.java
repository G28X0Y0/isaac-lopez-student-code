package com.techelevator.farm;

import com.techelevator.farm.animals.FarmAnimal;

public class Duck extends FarmAnimal {

    public Duck(String name, String sound) {
        super(name, sound);
    }
    public void printTheContentsOfProtectedMethod(){
        super.aProtectedMethod();
    }
}
