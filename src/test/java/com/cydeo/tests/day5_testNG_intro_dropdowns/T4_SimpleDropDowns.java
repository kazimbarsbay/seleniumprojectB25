package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_SimpleDropDowns {
    WebDriver driver;

    @BeforeMethod
    public void SetUp()
    {
        //Do Browser Driver setup
        //open browser
        driver= WebDriverFactory.getDriver("chrome");
        //maximize page
        driver.manage().window().maximize();
        //implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");


    }

    @AfterMethod
    public void tearDown()
    {
        driver.close();
    }

    @Test
    public void test1()
    {

  //  3. Verify “Simple dropdown” default selected value is correct
//Expected: “Please select an option”
        Select simpleDropDown=new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));

        WebElement currentlySelectedOption = simpleDropDown.getFirstSelectedOption();

        String actualSimpleDropDownText=currentlySelectedOption.getText(); //yukarıda sadece webelement olarak lacate işlemini yapabilmiştik
        //şimdi ise locate ettiğimiz webelementten getText() ile textini alıyoruz.

        String expected="Please select an option";

        Assert.assertEquals(actualSimpleDropDownText,expected);



//4. Verify “State selection” default selected value is correct

//Expected: “Select a State”

        Select simpleDropDown2=new Select(driver.findElement(By.xpath("//select[@id='state']")));

        WebElement currentlySelectedOption2 = simpleDropDown2.getFirstSelectedOption();

        String actualSimpleDropDownText2=currentlySelectedOption2.getText(); //yukarıda sadece webelement olarak lacate işlemini yapabilmiştik
        //şimdi ise locate ettiğimiz webelementten getText() ile textini alıyoruz.

        String expected2="Select a State";

        Assert.assertEquals(actualSimpleDropDownText2,expected2);

    }




}
