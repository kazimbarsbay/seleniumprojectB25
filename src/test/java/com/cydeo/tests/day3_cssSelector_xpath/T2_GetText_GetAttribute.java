package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_GetText_GetAttribute {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("https://login1.nextbasecrm.com");

        driver.manage().window().maximize();

        Thread.sleep(3000);

        String expectedRememberMe="Remember me on this computer";
        String rememberMeButton=driver.findElement(By.tagName("label")).getText();
        if (expectedRememberMe.equalsIgnoreCase(rememberMeButton))
        {
            System.out.println("Test is passed");
        }
        else{
            System.out.println("FAILED");
        }

            WebElement forgotPasswordLink=driver.findElement(By.className("login-link-forgot-pass"));

            String actual=forgotPasswordLink.getText();

            String expectedLink="Forgot your password?";

            if (actual.equalsIgnoreCase(expectedLink))
            {
                System.out.println("PASSED");
            }
            else
            {
                System.out.println("FAILED");
            }

        String expectedInHref = "forgot_password=yes";
        String actualHrefAttributeValue = forgotPasswordLink.getAttribute("href");

        System.out.println("actualHrefAttributeValue = " + actualHrefAttributeValue);

        if (actualHrefAttributeValue.contains(expectedInHref)){
            System.out.println("HREF attribute value verification PASSED!");
        }else{
            System.out.println("HREF attribute value verification FAILED!!!");
        }

    }




}
