package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNg_Selenium {

    WebDriver driver;
    @BeforeMethod
    public void setUp()
    {
        //Do Browser Driver setup
        //open browser
        driver= WebDriverFactory.getDriver("chrome");
        //maximize page
        driver.manage().window().maximize();
        //implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void tearDown()
    {
      driver.close();
    }
    @Test
    public void selenium_test()
    {



        //get https://google.com
        driver.get("https://google.com");
        //assert title is google

        /*
        String actual=driver.getTitle();
        String expected="Google";
        Assert.assertEquals(actual,expected);
         */
        Assert.assertEquals(driver.getTitle(),"Google");//google dan sonra virgül koyup eğer test başarısız olursa
                                                                //bir mesaj görmek istiyorsak yazabilriz.







    }



}
