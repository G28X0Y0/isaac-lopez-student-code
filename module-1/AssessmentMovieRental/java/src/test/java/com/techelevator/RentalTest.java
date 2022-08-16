package com.techelevator;

import junit.framework.TestCase;
import org.junit.Assert;

public class RentalTest extends TestCase {

    public void testGetTitle() {
        Rental test1 = new Rental("Shrek 2", "DVD", true);
        Rental test2 = new Rental("RaNDoM", "DVD", true);
        Rental test3 = new Rental("", "DVD", true); //Test no title


        String result1 = test1.getTitle();
        String result2 = test2.getTitle();
        String result3 = test3.getTitle();
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        Assert.assertEquals("Shrek 2", result1);
        Assert.assertEquals("RaNDoM", result2);
        Assert.assertEquals("", result3);

    }

    public void testGetFormat() {
        Rental test1 = new Rental("Shrek 2", "DVD", true);
        Rental test2 = new Rental("RaNDoM", "VHS", true);
        Rental test3 = new Rental("", "BluRay", true);
        Rental test4 = new Rental("", "", true);

        String result1 = test1.getFormat();
        String result2 = test2.getFormat();
        String result3 = test3.getFormat();
        String result4 = test4.getFormat();
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

        Assert.assertEquals("DVD", result1);
        Assert.assertEquals("VHS", result2);
        Assert.assertEquals("BluRay", result3);
        Assert.assertEquals("", result4);
    }

    public void testGetRentalPrice() {
        Rental test1 = new Rental("Shrek 2", "DVD", true);
        Rental test2 = new Rental("RaNDoM", "VHS", true);
        Rental test3 = new Rental("", "BluRay", true);
        Rental test4 = new Rental("", "", true);

        double result1 = test1.getRentalPrice();
        double result2 = test2.getRentalPrice();
        double result3 = test3.getRentalPrice();
        double result4 = test4.getRentalPrice();
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

        Assert.assertEquals(1.99, result1, .01);
        Assert.assertEquals(.99, result2, .01);
        Assert.assertEquals(2.99, result3, .01);
        Assert.assertEquals(0, result4, .01);


    }

    public void testLateFeeCalculate() {
        Rental test1 = new Rental("Shrek 2", "DVD", true);
        Rental test2 = new Rental("RaNDoM", "VHS", true);
        Rental test3 = new Rental("", "BluRay", true);
        Rental test4 = new Rental("", "", true);

        double result1 = test1.lateFeeCalculate(0);
        double result2 = test2.lateFeeCalculate(1);
        double result3 = test3.lateFeeCalculate(2);
        double result4 = test4.lateFeeCalculate(3);
        double result5 = test1.lateFeeCalculate(-1);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);

        Assert.assertEquals(1.99, result1, .01);
        Assert.assertEquals(.99 + 1.99, result2, .01);
        Assert.assertEquals(2.99 + 3.99, result3, .01);
        Assert.assertEquals(0 + 19.99, result4, .01);
        Assert.assertEquals(1.99, result1, .01);

    }

    public void testTestToString() {
        Rental test1 = new Rental("Shrek 2", "DVD", true);
        Rental test2 = new Rental("RaNDoM", "VHS", true);
        Rental test3 = new Rental("", "BluRay", true);
        Rental test4 = new Rental("", "", true);

        String result1 = test1.toString();
        String result2 = test2.toString();
        String result3 = test3.toString();
        String result4 = test4.toString();

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

        Assert.assertEquals("Movie - Shrek 2 - DVD 1.99", result1);
        Assert.assertEquals("Movie - RaNDoM - VHS 0.99", result2);
        Assert.assertEquals("Movie -  - BluRay 2.99", result3);
        Assert.assertEquals("Movie -  -  0.0", result4);
    }
}