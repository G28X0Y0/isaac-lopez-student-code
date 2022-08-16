package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class AnimalGroupNameTest {


    @Test
    public void lowercaseInput() {
        //Arrange
        AnimalGroupName name1 = new AnimalGroupName();

        //Act
        String test1 = name1.getHerd("elephant");

        //Assert
        Assert.assertEquals(test1, "Herd");


    }

    @Test
    public void mixedCaseInput(){
        AnimalGroupName name1 = new AnimalGroupName();

        String test1 = name1.getHerd("GiRaffE");

        Assert.assertEquals(test1, "Tower");
    }

    @Test
    public void nullEmptyNotFound(){
        AnimalGroupName name1 = new AnimalGroupName();
        AnimalGroupName name2 = new AnimalGroupName();
        AnimalGroupName name3 = new AnimalGroupName();

        String test1 = name1.getHerd("");
        String test2 = name2.getHerd(null);
        String test3 = name3.getHerd("Animal");

        Assert.assertEquals(test1, "unknown");
        Assert.assertEquals(test2, "unknown");
        Assert.assertEquals(test3, "unknown");
    }

}