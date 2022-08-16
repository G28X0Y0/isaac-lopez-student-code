package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringBitsTest {

    @Test
    public void testGetBits() {
    String word = "Goodbye";

    StringBits test1 = new StringBits();

    String result = test1.getBits(word);

        Assert.assertEquals("Gobe", result);

    }
}