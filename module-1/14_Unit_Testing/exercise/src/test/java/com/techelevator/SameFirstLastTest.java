package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SameFirstLastTest {

    @Test
    public void testIsItTheSame() {
        int[] numsPass1 = new int[4];
        numsPass1[0] = 3;
        numsPass1[1] = 5;
        numsPass1[2] = 6;
        numsPass1[3] = 3;

        int[] numsPass2 = new int[1];
        numsPass2[0] = 4;

        int[] numsPass3 = new int[3];
        numsPass3[0] = 1;
        numsPass3[1] = 2;
        numsPass3[2] = 3;

        SameFirstLast test1 = new SameFirstLast();
        SameFirstLast test2 = new SameFirstLast();
        SameFirstLast test3 = new SameFirstLast();

        boolean result1 = test1.isItTheSame(numsPass1);
        boolean result2 = test2.isItTheSame(numsPass2);
        boolean result3 = test3.isItTheSame(numsPass3);


        Assert.assertEquals(true, result1);
        Assert.assertEquals(true, result2);
        Assert.assertEquals(false, result3);



    }


}