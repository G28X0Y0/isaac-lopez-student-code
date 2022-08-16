package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FrontTimesTest {

    @Test
    public void testGenerateString() {
        FrontTimes test1 = new FrontTimes();


        String result = test1.generateString("Chocolatey", 3);

        Assert.assertEquals("ChoChoCho", result);


    }

    @Test
    public void testShorterThan3(){
        FrontTimes test1 = new FrontTimes();

        String result = test1.generateString("Hi", 6);

        Assert.assertEquals("HiHiHiHiHiHi", result);
    }
}