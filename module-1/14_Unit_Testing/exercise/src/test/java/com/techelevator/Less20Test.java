package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.security.PublicKey;

import static org.junit.Assert.*;

public class Less20Test {
    @Test
    public void TestLess20(){
        Less20 test1 = new Less20();

        boolean result = test1.isLessThanMultipleOf20(18);
        boolean result2 = test1.isLessThanMultipleOf20(19);

        Assert.assertEquals(result, true);
        Assert.assertEquals(result2, true);

    }

}