package com.codewr.example.selenium.webdriver.chrome;

import java.util.List;
import java.util.concurrent.TimeUnit;
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
public class RadioButtonElement {

    public static void main(String[] args) {
        try {
            String exePath = "D:\\codewr\\chromedriver.exe";
            System.setProperty("webdriver.chrome.driver", exePath);
            WebDriver driver = new ChromeDriver();

            // load google.com website
            String appUrl = "file:///D:/codewr/radio_button.html";
            driver.get(appUrl);
            RadioButtonElement buttonElement = new RadioButtonElement();
            buttonElement.byIsSelected(driver);
//            buttonElement.byValue(driver);
            // wait 2s and close browser
            Thread.sleep(2000);
            driver.close();
        } catch (InterruptedException ex) {
            Logger.getLogger(RadioButtonElement.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void byIsSelected(WebDriver driver) {
        List<WebElement> oRadioButton = driver.findElements(By.name("gender"));

        // Create a boolean gender
        boolean bValue = false;
        bValue = oRadioButton.get(0).isSelected();

        if (bValue == false) {
            oRadioButton.get(0).click();
        } else {
            oRadioButton.get(1).click();
        }
    }

    public void byValue(WebDriver driver) {
        List<WebElement> oCheckBox = driver.findElements(By.name("gender"));
        int iSize = oCheckBox.size();

        // Start the loop from first checkbox to last checkboxe
        for (int i = 0; i < iSize; i++) {

            String sValue = oCheckBox.get(i).getAttribute("value");

            // check male
            if (sValue.equalsIgnoreCase("male")) {

                oCheckBox.get(i).click();

                break;

            }

        }
    }

}
