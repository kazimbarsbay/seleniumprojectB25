package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_Alert_Practices {
    public WebDriver driver;
    @BeforeMethod
    public void setUp()
    {
        //TC #1: Information alert practice
       // 1. Open browser
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//2. Go to website: http://practice.cydeo.com/javascript_alerts
        driver.get("http://practice.cydeo.com/javascript_alerts");

    }
    @Test
    public void test1() throws InterruptedException {
        WebElement informationAlertButton=driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        informationAlertButton.click();
        Thread.sleep(2000);



        Alert alert=driver.switchTo().alert();

        alert.accept();

        WebElement okButtonResult=driver.findElement(By.xpath("//p[.='You successfully clicked an alert']"));

       // String expected="You successfully //clicked an alert";
     //   String actual=okButtonResult.getText();
       // Assert.assertEquals(expected,actual);

        Assert.assertTrue(okButtonResult.isDisplayed());






    }
}
/*

3. Click to “Click for JS Alert” button
4. Click to OK button from the alert
5. Verify “You successfully clicked an alert” text is displayed.
 */