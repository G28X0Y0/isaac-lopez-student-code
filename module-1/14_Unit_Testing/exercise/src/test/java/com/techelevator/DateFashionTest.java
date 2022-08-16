package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DateFashionTest {
    @Test
    public void testGetATable() {

        DateFashion test1 = new DateFashion();

        int result1 = test1.getATable(5, 10);
        int result2 = test1.getATable(5,2);
        int result3 = test1.getATable(5,5);


        Assert.assertEquals(2, result1);
        Assert.assertEquals(0, result2);
        Assert.assertEquals(1, result3);

    }
}