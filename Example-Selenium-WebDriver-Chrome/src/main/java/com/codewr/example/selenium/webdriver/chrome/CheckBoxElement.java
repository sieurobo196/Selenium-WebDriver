package com.codewr.example.selenium.webdriver.chrome;

import java.util.List;
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
public class CheckBoxElement {

    public static void main(String[] args) {
        try {
            String exePath = "D:\\codewr\\chromedriver.exe";
            System.setProperty("webdriver.chrome.driver", exePath);
            WebDriver driver = new ChromeDriver();

            // load google.com website
            String appUrl = "file:///D:/codewr/checkbox.html";
            driver.get(appUrl);

            // by name
            WebElement elementByName = driver.findElement(By.name("bike"));
            elementByName.click();

            // wait 2s and close browser
            Thread.sleep(2000);
            driver.close();
        } catch (InterruptedException ex) {
            Logger.getLogger(CheckBoxElement.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
