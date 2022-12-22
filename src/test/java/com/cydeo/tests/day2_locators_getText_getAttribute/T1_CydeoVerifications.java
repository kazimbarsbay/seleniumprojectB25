package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerifications {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com");


        String expectedUrl="cydeo";
        String currentUrl=driver.getCurrentUrl();
        if (expectedUrl.equals(currentUrl))
        {
            System.out.println("Url verification passed");

        }else
        {
            System.out.println("Url verification failed");
        }

        System.out.println("currentUrl = " + currentUrl);

        String expectedTitle="Practice";
        String currentTitle=driver.getTitle();
        if (expectedTitle.equals(currentTitle))
        {
            System.out.println("Title verification passed");

        }else
        {
            System.out.println("Title verification failed");
        }
        //System.out.println("currentTitle = " + currentTitle);

        driver.close();
    }

}
