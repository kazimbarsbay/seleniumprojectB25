package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_Google_Search {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://google.com");


        // write apple in search box
        //önce google sayfasına gidip ordan search box içinde inspect yapıp ordan name attribute bulup onun içinde yazan q 'yu kopyaladık buraya name içine yapıştırdık
        //ilk eşleşmeyi bize döndürüyor

        WebElement googleSearchBox = driver.findElement(By.name("q"));

        googleSearchBox.sendKeys("apple" + Keys.ENTER); // apple arıyoruz

        String expectedTitle = "apple";
        String currentTitle = driver.getTitle();


        if (currentTitle.startsWith(expectedTitle))
        {
            System.out.println("test passed");
        }
        else
        {
            System.out.println("test failed");
        }
    }
}
