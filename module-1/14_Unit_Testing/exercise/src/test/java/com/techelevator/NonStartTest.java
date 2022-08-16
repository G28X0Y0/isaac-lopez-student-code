package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NonStartTest {

    @Test
    public void getPartialString() {

        NonStart test1 = new NonStart();

        String result = test1.getPartialString("first", "second");

        Assert.assertEquals(result, "irstecond");

    }
}