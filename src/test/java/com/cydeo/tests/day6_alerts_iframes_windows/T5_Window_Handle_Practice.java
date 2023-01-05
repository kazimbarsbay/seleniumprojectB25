package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class T5_Window_Handle_Practice {

    public WebDriver driver;
    @BeforeClass
    public void setUp(){

        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/windows");


    }

    @Test
    public void windowHandle() {


        //store main pages windowHandle
        String mainPageHandle = driver.getWindowHandle();


        String actual = driver.getTitle();
        String expected = "Windows";
        Assert.assertEquals(actual, expected);

        WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));

        clickHereLink.click();


//6. Switch to new Window.
        Set<String> allWindowHandles = driver.getWindowHandles();
        // window handle 1 - main window
        // window handle 2 - 2nd window

        for (String each : allWindowHandles) {

            driver.switchTo().window(each);
            System.out.println("Current title while switching windows: " + driver.getTitle());

        }

        //7. Assert: Title is “New Window”
        String expectedTitleAfterClick = "New Window";
        actual = driver.getTitle();

        Assert.assertEquals(actual, expectedTitleAfterClick);

        System.out.println("Title after click: " + actual);

        //If we want to go back to main page, we can use already stored main handle
        //driver.switchTo().window(mainHandle);

        //driver.switchTo().window(mainPageHandle); ben bu şekilde değişken atadığım için ismi farklı
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
