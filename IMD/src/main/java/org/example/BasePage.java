package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;
import java.time.Duration;

import java.util.List;



public class BasePage {
    //Base page contains common methods which are used other classes
    public WebDriver driver;
    public WebDriverWait wait;
    public Actions action;

    public BasePage(WebDriver driver, WebDriverWait wait, Actions action){
        this.driver = driver;
        this.wait =new WebDriverWait(driver,10);
        this.action = action;
    }



    public void click(By elementLocation){
        driver.findElement(elementLocation).click();
    }

    public void firstResult(By elementLocation){
         wait.until(ExpectedConditions.visibilityOfElementLocated(elementLocation));
    }
    public void clear(By elementLocation){
        driver.findElement(elementLocation).clear();
    }

    public void hoverClick(By elementLocation){
        this.action = new Actions(driver);
        action.moveToElement(driver.findElement(elementLocation)).click().build().perform();
        driver.findElement(elementLocation).click();
    }

    public String getText1(By elementLocation){
        String text= this.driver.findElement(elementLocation).getText();
        return text;
    }



public void sendKeyEnter(By elementLocation){
        driver.findElement(elementLocation).sendKeys(Keys.ENTER);
}

    public void writeText(By elementLocation, String text){
        driver.findElement(elementLocation).sendKeys(text);
    }




    public void VerifyFullyLoaded2(WebDriver driver){ //to verify page ready or not

        JavascriptExecutor js = (JavascriptExecutor)driver;
        String ready = (String)js.executeScript("return document.readyState");
        System.out.println("Ready or not : "+ready);
    }

    public void getCurrentUrl(){driver.getCurrentUrl();} //to get current page url

    public void scroll (By elementLocation){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(elementLocation));
        try {
            driver.findElement(elementLocation).click();
        } catch (Exception e) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", driver.findElement(elementLocation));
        }
    }




}
