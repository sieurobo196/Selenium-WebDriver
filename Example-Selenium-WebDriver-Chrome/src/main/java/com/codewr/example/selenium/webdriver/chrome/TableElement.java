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
public class TableElement {

    public static void main(String[] args) {
        try {
            String exePath = "D:\\codewr\\chromedriver.exe";
            System.setProperty("webdriver.chrome.driver", exePath);
            WebDriver driver = new ChromeDriver();

            // load html website
            String appUrl = "file:///D:/codewr/table.html";
            driver.get(appUrl);
            //get th  Firstname row 1 col 1
            String thead = driver.findElement(By.xpath(".//*[@id='table']/tbody/tr[1]/th[1]")).getText();
            System.out.println(thead);
            //get td Jill row 2 col 1
            String td = driver.findElement(By.xpath(".//*[@id='table']/tbody/tr[2]/td[1]")).getText();
            System.out.println(td);

            Thread.sleep(2000);
            driver.close();
        } catch (InterruptedException ex) {
            Logger.getLogger(TableElement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
