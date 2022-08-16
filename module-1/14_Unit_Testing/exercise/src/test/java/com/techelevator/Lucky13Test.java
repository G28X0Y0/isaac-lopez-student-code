package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Lucky13Test {

    @Test
    public void testGetLucky() {
        int[] passArr = new int[5];
        passArr[0] = 1;
        passArr[1] = 4;
        passArr[2] = 3;
        passArr[3] = 10;
        passArr[4] = 3;

        int[] passArr2 = new int[5];
        passArr2[0] = 2;
        passArr2[1] = 4;
        passArr2[2] = 4;
        passArr2[3] = 10;
        passArr2[4] = 7;



        Lucky13 test1 = new Lucky13();
        boolean result = test1.getLucky(passArr);
        Lucky13 test2 = new Lucky13();
        boolean result2 = test2.getLucky(passArr2);


        Assert.assertEquals(false, result);
        Assert.assertEquals(true, result2);



    }
}