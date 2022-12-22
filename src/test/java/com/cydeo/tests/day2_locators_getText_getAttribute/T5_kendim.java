package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_kendim {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/registration_form");

        WebElement headerText=driver.findElement(By.tagName("h2"));

        String expectedHeaderText="Registration form";
        String actualHeaderText= headerText.getText();

        if (actualHeaderText.equals(expectedHeaderText))
        {
            System.out.println("test passed");
        }else {
            System.out.println("header text failed");
        }

        WebElement firstNameInput=driver.findElement(By.name("firstname"));

        String expectedPlaceHolder="first name";
        String actualPlaceHolder=driver.findElement(By.name("firstname")).getAttribute("placeholder");
        //kısayolu zaten yukarıda firstNameInput ile o elementi bulmuştuk
        //String actualPlaceHolder=firstNameInput.getAttribute da diyebiliriz.


        driver.close();




    }



}
