package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_Yahoo_Verification {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();


        WebDriver driver=new ChromeDriver();


        driver.get("https://www.yahoo.com");

       String currentTitle=driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);


    }





}
