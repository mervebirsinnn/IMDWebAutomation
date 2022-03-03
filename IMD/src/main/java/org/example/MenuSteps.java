package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MenuSteps extends BasePage {
    BasePage basePage = new BasePage(driver,wait,action);

    public MenuSteps(WebDriver driver, WebDriverWait wait, Actions action) {
        super(driver, wait, action);
    }

    public static String loginPageUrl =  "https://www.imdb.com/";
    public static String MenuButtonXpath = "//div[text()='Menu']";
    public static String OscarsButtonXpath = "//a[@href='/oscars/?ref_=nv_ev_acd']";
    public static String EventHistoryYearXpath = "//a[text()='1929']";
    public static String CharlesXpath = "//a[text()='The Circus']";
    public static String JazzXpath = "(//a[text()='The Jazz Singer'])[2]";
    public void goTo() {
        driver.get(loginPageUrl);
    } //gets loginpage url and opens it

    public void verifyPage(){ basePage.VerifyFullyLoaded2(driver); }

    public void clickMenu(){
        basePage.click(By.xpath(MenuButtonXpath));
    }

    public void clickOscars(){
        basePage.click(By.xpath(OscarsButtonXpath));
    }

    public void clickEventYear(){
        basePage.click(By.xpath(EventHistoryYearXpath));
    }

    public void charlesSelect() {
        basePage.scroll(By.xpath(CharlesXpath));

    }
    public void jazzSelect() {
        basePage.scroll(By.xpath(JazzXpath));

    }
}
