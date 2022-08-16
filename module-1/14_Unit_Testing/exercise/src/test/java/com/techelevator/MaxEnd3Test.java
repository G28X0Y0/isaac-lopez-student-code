package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxEnd3Test {

    @Test
    public void TestMakeArray() {
        int[] nums = new int[3];
        nums[0] = 3;
        nums[1]= 2;
        nums[2] = 4;

        int[] numsPass = new int[3];
        numsPass[0] = 4;
        numsPass[1] = 4;
        numsPass[2] = 4;


        MaxEnd3 test1 = new MaxEnd3();

        int[] result = test1.makeArray(nums);

        Assert.assertArrayEquals(numsPass, result);


    }
}