package org.example;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.*;

public class TheCircus extends  BasePage {

    BasePage basePage = new BasePage(driver, wait, action);

    public TheCircus(WebDriver driver, WebDriverWait wait, Actions actions) {
        super(driver, wait, actions);
    }

    public static String DirectorXpath = " //a[@href='/name/nm0000122/?ref_=tt_ov_dr']";
    public static String WriterXpath = " //a[@href='/name/nm0000122/?ref_=tt_ov_wr']";
    public static String StarXpath1 = "//a[text()=\"Charles Chaplin\"][1]";
    public static String StarXpath2 = "//a[text()='Merna Kennedy']";
    public static String StarXpath3 = "//a[text()='Al Ernest Garcia']";
    public static String homeId = "home_img_holder";
    public static String searchAreaName = "q";
    public static String searchButtonId = "//button[@class='nav-search__search-submit _1-XI3_I8iwubPnQ1mmvW97']";
    public static String titleXpath = "//a[text()=\"Şarlo Sirkte\"]";


    public void saveElement(String filePath) {


        try {
            File myObj = new File(filePath);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            BufferedWriter myWriter = new BufferedWriter(new FileWriter(filePath));
            basePage.firstResult(By.xpath(DirectorXpath));
            String a = driver.findElement(By.xpath((DirectorXpath))).getAttribute("text");
            basePage.firstResult(By.xpath(WriterXpath));
            String b = driver.findElement(By.xpath((WriterXpath))).getAttribute("text");
            basePage.firstResult(By.xpath(StarXpath1));
            String c = driver.findElement(By.xpath((StarXpath1))).getAttribute("text");
            basePage.firstResult(By.xpath(StarXpath2));
            String d = driver.findElement(By.xpath((StarXpath2))).getAttribute("text");
            basePage.firstResult(By.xpath(StarXpath3));
            String e = driver.findElement(By.xpath((StarXpath3))).getAttribute("text");

            myWriter.write(a);
            myWriter.newLine();
            myWriter.write(b);
            myWriter.newLine();
            myWriter.write(c);
            myWriter.newLine();
            myWriter.write(d);
            myWriter.newLine();
            myWriter.write(e);
            myWriter.close();
            System.out.println("Successfully wrote to the data.txt file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public void saveElementMain(String pathName) {


        try {
            File myObj = new File(pathName);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            BufferedWriter myWriter = new BufferedWriter(new FileWriter(pathName));
            basePage.firstResult(By.xpath(DirectorXpath));
            String a = driver.findElement(By.xpath((DirectorXpath))).getAttribute("text");
            basePage.firstResult(By.xpath(WriterXpath));
            String b = driver.findElement(By.xpath((WriterXpath))).getAttribute("text");
            basePage.firstResult(By.xpath(StarXpath1));
            String c = driver.findElement(By.xpath((StarXpath1))).getAttribute("text");
            basePage.firstResult(By.xpath(StarXpath2));
            String d = driver.findElement(By.xpath((StarXpath2))).getAttribute("text");
            basePage.firstResult(By.xpath(StarXpath3));
            String e = driver.findElement(By.xpath((StarXpath3))).getAttribute("text");
           
            myWriter.newLine();
            myWriter.write(b);
            myWriter.newLine();
            myWriter.write(c);
            myWriter.newLine();
            myWriter.write(d);
            myWriter.newLine();
            myWriter.write(e);
            myWriter.close();
            System.out.println("Successfully wrote to the data2.txt file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

public  void clearFile(String filePath) throws IOException {
    FileWriter writer = new FileWriter(filePath);
    PrintWriter pwOb = new PrintWriter(writer, false);
    pwOb.flush();
    pwOb.close();
    writer.close();
}
    public void gotoHome() { basePage.click(By.id(homeId));}
    public void sendKey(String key){
        basePage.writeText(By.name(searchAreaName),key);
    }

    public  void searchButtonClick(){
       basePage.sendKeyEnter(By.xpath(searchButtonId));
    }
    public void clickTitle() {basePage.click(By.xpath(titleXpath));}
}




