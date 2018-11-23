package com.codewr.example.selenium.webdriver.chrome;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author codewr
 */
public class NavigateCommands {

    public static void main(String[] args) {
        try {
            // Create a new instance of the FireFox driver
            String exePath = "D:\\codewr\\chromedriver.exe";
            System.setProperty("webdriver.chrome.driver", exePath);
            WebDriver driver = new ChromeDriver();

            // Open google.com web site
            String appUrl = "http://www.google.com/";
            driver.get(appUrl);

            // search  codewr.com java
            String keySearch = "codewr.com java";
            driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys(keySearch);
            // submit button search of google
            driver.findElement(By.xpath("//input[@name='btnK']")).submit();
            Thread.sleep(5000);
            // Go back to Home Page after 5s
            driver.navigate().back();
            Thread.sleep(5000);
            // Go forward to Registration page after 5s
            driver.navigate().forward();
            Thread.sleep(5000);
            // Go back to Home page after 5s
            driver.navigate().to(appUrl);
            Thread.sleep(5000);
            // Refresh browser after 5s
            driver.navigate().refresh();
            Thread.sleep(5000);
            // Close browser after 5s
            driver.close();
        } catch (InterruptedException ex) {
            Logger.getLogger(NavigateCommands.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
