package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class DropDownPractices {

    public WebDriver driver;

    @BeforeMethod
    public void setUp()
    {
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
    }

    @Test
    public void dropDown_Task5() throws InterruptedException {

        Select stateDropdown=new Select(driver.findElement(By.xpath("//select[@id='state']")));

        Thread.sleep(2000);
        stateDropdown.selectByVisibleText("Illinois");

        Thread.sleep(2000);
        stateDropdown.selectByValue("VA");

        Thread.sleep(2000);
        stateDropdown.selectByIndex(5);


        String expectedOption="California";
        String actualOption=stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(expectedOption,actualOption);
    }

        @Test
        public void dropDown_Task6() throws InterruptedException {

            Select yearDropdown=new Select(driver.findElement(By.xpath("//select [@id='year']")));

            Select monthDropdown=new Select(driver.findElement(By.xpath("//select [@id='month']")));

            Select dayDropdown=new Select(driver.findElement(By.xpath("//select [@id='day']")));

            Thread.sleep(2000);
            yearDropdown.selectByVisibleText("1924");
            Thread.sleep(2000);
            monthDropdown.selectByValue("11");
            Thread.sleep(2000);
            dayDropdown.selectByIndex(0);


            //creating expected values
            String expectedYear = "1924";
            String expectedMonth = "December";
            String expectedDay = "1";

            //getting actual values from browser
            String actualYear = yearDropdown.getFirstSelectedOption().getText();
            String actualMonth = monthDropdown.getFirstSelectedOption().getText();
            String actualDay = dayDropdown.getFirstSelectedOption().getText();

            //create assertions
            Assert.assertTrue(actualYear.equals(expectedYear));
            Assert.assertEquals(actualMonth, expectedMonth);
            Assert.assertEquals(actualDay, expectedDay);

        }
    @AfterMethod
    public void teardownMethod(){
        driver.close();
    }

/*
3. Select “December 1st, 1923” and verify it is selected.
Select year using : visible text
Select month using : value attribute
Select day using : index number
 */





}
