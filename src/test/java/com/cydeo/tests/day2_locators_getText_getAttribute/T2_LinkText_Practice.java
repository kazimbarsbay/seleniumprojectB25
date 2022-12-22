package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_LinkText_Practice {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com");

        // Click to A/B testsing from top of the list

       // driver.findElement(By.linkText("A/B Testing")).click();

        // bu işlemi bir değişkene atayıp ihtiyaç oldukça da kullanabiliriz.
        WebElement abTestLink=driver.findElement(By.linkText("A/B Testing"));
        abTestLink.click();
        Thread.sleep(3000);


        String expectedTitle="No A/B Test";
        String currentTitle=driver.getTitle();
        if (expectedTitle.equals(currentTitle))
        {
            System.out.println("title test passed");
        }else {
            System.out.println("title test failed");
        }

        driver.navigate().back();

        String expectedTitle2="Practice";
        String currentTitle2=driver.getTitle();
        if (expectedTitle2.equals(currentTitle2))
        {
            System.out.println("title test passed");
        }else {
            System.out.println("title test failed");
        }

    }



}
