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
public class WebElementCommands {

    public static void main(String[] args) {
        try {
            String exePath = "D:\\codewr\\chromedriver.exe";
            System.setProperty("webdriver.chrome.driver", exePath);
            WebDriver driver = new ChromeDriver();

            // load google.com website
            String appUrl = "http://www.google.com/";
            driver.get(appUrl);
            //  key search
            String keySearchOld = "java";
            String keySearchNew = "codewr.com java";
            // input key search
            WebElement input = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
            input.sendKeys(keySearchOld);
            // wait 2s clear key
            Thread.sleep(2000);
            input.clear();
            // wait 1s input new key search
            Thread.sleep(1000);
            input.sendKeys(keySearchNew);
            //submit button search
            WebElement buttonSearch = driver.findElement(By.xpath("//input[@name='btnK']"));
            buttonSearch.submit();
            // wait 5s close browser
            Thread.sleep(5000);
            driver.close();
            
        } catch (InterruptedException ex) {
            Logger.getLogger(WebElementCommands.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
