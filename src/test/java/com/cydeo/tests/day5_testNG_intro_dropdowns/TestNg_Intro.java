package com.cydeo.tests.day5_testNG_intro_dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;


public class TestNg_Intro {//buradaki yeşil oka basarsak bütün testler çalışır
    @Test (priority = 2)
    public void test1()
    {
        System.out.println("Test 1 is running...");

        //Asser Equals
        String actual="apple";
        String expected="apple1";

        Assert.assertEquals(actual, expected );


    } // hangi test çalışsın istersek onun yanındaki oka bas

    @Test(priority = 1)
    public void test2()
    {
        System.out.println("Test 2 is running...");

        //Asser True
        String actual="apple";
        String expected="apple2";

        Assert.assertTrue(actual.equals(expected));


    }

    @BeforeClass // this starts only one time before tests
    public void setUpClass()
    {
        System.out.println("Before class is runnning...");
    }

    @AfterClass // this starts only one time after tests
    public void tearDownClass()
    {
        System.out.println("After class is running");
    }

    @BeforeMethod  // this starts each of test both before test1 and test2
    public void setUpMethod()
    {
        System.out.println("Before method is runnning...");
    }

    @AfterMethod   // this starts each of test both after test1 and test2
    public void tearDownMethod()
    {
        System.out.println("After method is running");
    }

}
