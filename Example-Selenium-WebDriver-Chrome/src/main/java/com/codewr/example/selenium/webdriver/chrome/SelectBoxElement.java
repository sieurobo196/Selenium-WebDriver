package com.codewr.example.selenium.webdriver.chrome;

import java.util.List;
import org.openqa.selenium.support.ui.Select;
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
public class SelectBoxElement {

    public static void main(String[] args) {
        try {
            String exePath = "D:\\codewr\\chromedriver.exe";
            System.setProperty("webdriver.chrome.driver", exePath);
            WebDriver driver = new ChromeDriver();

            // load html website
            String appUrl = "file:///D:/codewr/select_box.html";
            driver.get(appUrl);

            Select select = new Select(driver.findElement(By.id("cars")));
            //select by visible text
            select.selectByVisibleText("Saab");
            Thread.sleep(2000);
            //select by index
            select.selectByIndex(0);
            Thread.sleep(2000);
            //select by value
            select.selectByValue("audi");
            Thread.sleep(2000);
            //print all text
            List<WebElement> elementCount = select.getOptions();
            System.out.println(elementCount.size());
            for(WebElement element :elementCount){
                System.out.println(element.getText());
                System.out.println(element.isSelected());
            }
            Thread.sleep(2000);
            driver.close();
        } catch (InterruptedException ex) {
            Logger.getLogger(RadioButtonElement.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
