package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        //1- setup browser driver
        WebDriverManager.chromedriver().setup();

        //2- create instance of the Selenium web driver
        //opening emty browser page
        WebDriver driver=new ChromeDriver();

        //3 go to "https://www.tesla.com"
        driver.get("https://www.tesla.com");


        //use selenium to navigate to back
        driver.navigate().back();

        //stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate to forward
        driver.navigate().forward();

        //stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate to refresh
        driver.navigate().refresh();


        //stop code execution for 3 seconds
        Thread.sleep(3000);


        //use navigate().to();
         driver.navigate().to("https://www.google.com");

        // get the title of the pace
        System.out.println(driver.getTitle());
        // diğer yol
        // String currentTitle=driver.getTitle();
        //System.out.println(currentTitle);



         //get the  current url
        String currentUrl= driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

        //screen maximize
         driver.manage().window().maximize();

         //screeen fullscreen
        //driver.manage().window().fullscreen();

        //this will close the currently opened window
        driver.close();

        //this will close the all opened window
        driver.quit();




    }


}
