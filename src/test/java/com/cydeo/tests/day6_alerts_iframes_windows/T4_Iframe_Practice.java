package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_Iframe_Practice {

    public WebDriver driver;
    @BeforeClass
    public void setUp(){

        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/iframe");

    }

    //sayfada 1 den fazla test olur ve onu çalıştırmak istemezsek
    //1- @Test başına // koyarız //@Test
    //2- @Ignore koyabiliriz
    @Test
            public void iframeTest()
        {
//iframe içine girebilmek için switch kullanıyoruz
            driver.switchTo().frame("mce_0_ifr");
            WebElement yourContentGoesHere=driver.findElement(By.xpath("//p[.='Your content goes here.']"));

            Assert.assertTrue(yourContentGoesHere.isDisplayed());

            //iframe içini test ettikten sonra tekrar iframe dışına çıkacağız

            driver.switchTo().parentFrame();
            WebElement headerText = driver.findElement(By.xpath("//h3"));

            //assertion of header text is displayed or not
            Assert.assertTrue(headerText.isDisplayed());



        }


}
/*
TC #4: Iframe practice
1. Create a new class called: T4_Iframes
2. Create new test and make set ups
3. Go to: https://practice.cydeo.com/iframe
4. Assert: “Your content goes here.” Text is displayed.
5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”
 */