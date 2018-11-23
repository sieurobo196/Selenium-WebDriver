package com.codewr.example.selenium.webdriver.chrome;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author codewr
 */
public class FindElementCommands {

    public static void main(String[] args) {
        try {
            String exePath = "D:\\codewr\\chromedriver.exe";
            System.setProperty("webdriver.chrome.driver", exePath);
            WebDriver driver = new ChromeDriver();

            // load google.com website
            String appUrl = "file:///D:/codewr/index.html";
            driver.get(appUrl);
//            // by id
//            WebElement elementbyId = driver.findElement(By.id("submit"));
//            elementbyId.click();
//            // by name
//            WebElement elementByName = driver.findElement(By.name("submit"));
//            elementByName.click();
//            // by class name
//            WebElement elementByClassName = driver.findElement(By.className("btn"));
//            elementByClassName.click();
//            // by tag name
//            WebElement elementByTagName = driver.findElement(By.tagName("button"));
//            elementByTagName.click();
            // by xpath
            WebElement elementByXPath = driver.findElement(By.xpath("//button[@id='submit']"));
            elementByXPath.click();
            // wait 2s and close browser
            Thread.sleep(2000);
            driver.close();
        } catch (InterruptedException ex) {
            Logger.getLogger(FindElementCommands.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
