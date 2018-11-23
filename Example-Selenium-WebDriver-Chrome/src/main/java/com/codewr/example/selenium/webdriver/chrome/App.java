package com.codewr.example.selenium.webdriver.chrome;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author codewr
 */
public class App {

    public static void main(String[] args) {
        try {
            String exePath = "D:\\codewr\\chromedriver.exe";
            System.setProperty("webdriver.chrome.driver", exePath);
             // Create a new instance of the Firefox driver
            WebDriver driver = new ChromeDriver();
             //Launch the google.com Website
            driver.get("http://google.com");
             //Wait for 5 Sec
            Thread.sleep(5000);
             // Close the driver
            driver.close();
        } catch (InterruptedException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
