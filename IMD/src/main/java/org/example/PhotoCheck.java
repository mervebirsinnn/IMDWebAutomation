package org.example;

import java.net.HttpURLConnection;
import java.util.Iterator;
import java.util.List;
import java.io.IOException;
import java.net.MalformedURLException;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PhotoCheck extends  BasePage {

    BasePage basePage = new BasePage(driver, wait, action);

    public PhotoCheck(WebDriver driver, WebDriverWait wait, Actions actions) {
        super(driver, wait, actions);
    }
   public static String AllPhotoXpath = "//a[@href='/title/tt0018773/mediaindex?ref_=tt_pv_mi_sm'][2]";
   public  static String AllPhotoXpath2 ="//h3[@class='ipc-title__text'][text()='Photos']";
   public static String TheCircusPhotoList="//div[@class='media_index_thumb_list']//img";
   public static String TheJazzSinger="//div[@class='media_index_thumb_list']//img";

    public void clickAllPhoto() {

        if(driver.findElements(By.xpath(AllPhotoXpath)).isEmpty()) {
            basePage.click(By.xpath(AllPhotoXpath2));

        }
        else
            basePage.click((By.xpath(AllPhotoXpath)));
    }
 public void TheCircusCheckPhoto()
 {
     for (WebElement image : driver.findElements(By.xpath(TheCircusPhotoList)))
     {
         isImageBroken(image);
     }
 }
 public void  TheJazzSingerCheckPhoto()
 {
     for (WebElement image : driver.findElements(By.xpath(TheJazzSinger)))
     {
         isImageBroken(image);
     }
 }
    public void isImageBroken(WebElement image)
    {
        if (image.getAttribute("naturalWidth").equals("0"))
        {
            System.out.println(image.getAttribute("outerHTML") + " is broken.");
        }
    }
}