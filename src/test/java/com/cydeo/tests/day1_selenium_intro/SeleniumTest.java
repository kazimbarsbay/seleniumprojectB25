package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) {

        // we create our browser driver
        WebDriverManager.chromedriver().setup();

        //we create instance of the chrome driver
        WebDriver driver=new ChromeDriver();

       // driver.get("https://www.google.com");
        driver.get("https://www.facebook.com");




    }


}
