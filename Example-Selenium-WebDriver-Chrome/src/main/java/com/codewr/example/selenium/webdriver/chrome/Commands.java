package com.codewr.example.selenium.webdriver.chrome;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author codewr
 */
public class Commands {

    public static void main(String[] args) {
        try {
            String exePath = "D:\\codewr\\chromedriver.exe";
            System.setProperty("webdriver.chrome.driver", exePath);
            // Create a new instance of the Firefox driver
            WebDriver driver = new ChromeDriver();
            //1.get(String arg0) : void – This method Load a new web page in the current browser window. 
            // Accepts String as a parameter and returns nothing.
            driver.get("http://google.com");
            //2.getTitle() : String – This method fetches the Title of the current page. 
            // Accepts nothing as a parameter and returns a String value
            String title = driver.getTitle();
            System.out.println("title: " + title);
            //3.getCurrentUrl() : String – This method fetches the string representing the Current URL which is opened in the browser. 
            // Accepts nothing as a parameter and returns a String value.
            String currentUrl = driver.getCurrentUrl();
            System.out.println("currentUrl: " + currentUrl);
            //4.getPageSource() : String – This method returns the Source Code of the page. 
            //Accepts nothing as a parameter and returns a String value.
            String pageSource = driver.getPageSource();
            System.out.println("pageSource: " + pageSource);
            //Wait for 5 Sec
            Thread.sleep(5000);
            // Close the driver
            driver.close();
        } catch (InterruptedException ex) {
            Logger.getLogger(Commands.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
