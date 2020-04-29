package org.academy.lesson1;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleTestNG2 {
    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test Child2");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class Child2");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before method Child2");
    }

    @Test
    public void testA2() {
        System.out.println("testA");
        Assert.assertEquals(true, true);
    }

    @Test
    public void testB2() {
        System.out.println("testB");
        Assert.assertEquals(true, true);
    }

    @Test(groups = "academy")
    public void testC2() {
        System.out.println("testC");
        Assert.assertEquals(true, true);
    }

    @Test
    public void testD2() {
        System.out.println("testD");
        Assert.assertEquals(true, true);
    }
}