package org.example;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.*;

public class TheJazzSinger extends BasePage{
    public TheJazzSinger(WebDriver driver, WebDriverWait wait, Actions action) {
        super(driver, wait, action);
    }
    BasePage basePage = new BasePage(driver, wait, action);
    public static String DirectorXpath = "(//a[text()='Alan Crosland'])[1]";
    public static String WriterXpath = "(//a[text()='Samson Raphaelson'])[1]";
    public static String WriterXpath2 ="(//a[text()='Alfred A. Cohn'])[1]";
    public static String WriterXpath3 ="(//a[text()='Jack Jarmuth'])[1]";
    public static String StarXpath1 = "(//a[text()='Al Jolson'])[1]";
    public static String StarXpath2 = "(//a[text()='May McAvoy'])[1]";
    public static String StarXpath3 = "(//a[text()='Warner Oland'])[1]";
    public static String titleXpath = "(//a[text()='The Jazz Singer'])[1]";

    public  static  String Director="(//a[text()='Richard Fleischer'])[1]";
    public static String Director2 = "(//a[text()='Sidney J. Furie'])[1]";
    public static String Writer ="(//a[text()='Samson Raphaelson'])[1]";
    public static String Writer2 ="(//a[text()='Herbert Baker'])[1]";
    public static String Writer3 ="(//a[text()='Stephen H. Foreman'])[1]";
    public static String Star1 = "(//a[text()='Laurence Olivier'])[1]";
    public static String Star2 = "(//a[text()='Neil Diamond'])[1]";
    public static String Star3 = "(//a[text()='Lucie Arnaz'])[1]";

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
            basePage.firstResult(By.xpath(WriterXpath2));
            String g = driver.findElement(By.xpath((WriterXpath2))).getAttribute("text");
            //  driver.findElement(By.xpath(DirectorXpath)).getAttribute("text")+' '+
            basePage.firstResult(By.xpath(WriterXpath3));
            String h = driver.findElement(By.xpath((WriterXpath3))).getAttribute("text");
            basePage.firstResult(By.xpath(StarXpath1));
            String c = driver.findElement(By.xpath((StarXpath1))).getAttribute("text");
            basePage.firstResult(By.xpath(StarXpath2));
            String d = driver.findElement(By.xpath((StarXpath2))).getAttribute("text");
            basePage.firstResult(By.xpath(StarXpath3));
            String e = driver.findElement(By.xpath((StarXpath3))).getAttribute("text");
            // myWriter.write(enabled);
            myWriter.write(a);
            myWriter.newLine();
            myWriter.write(b);
            myWriter.newLine();
            myWriter.write(g);
            myWriter.newLine();
            myWriter.write(h);
            myWriter.newLine();
            myWriter.write(c);
            myWriter.newLine();
            myWriter.write(d);
            myWriter.newLine();
            myWriter.write(e);
            myWriter.close();
            System.out.println("Successfully wrote to the jazzdata.txt file.");
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
            basePage.firstResult(By.xpath(Director));
            String a = driver.findElement(By.xpath((Director))).getAttribute("text");
            basePage.firstResult(By.xpath(Director2));
            String b = driver.findElement(By.xpath((Director2))).getAttribute("text");
            basePage.firstResult(By.xpath(Writer));
            String c = driver.findElement(By.xpath((Writer))).getAttribute("text");
            basePage.firstResult(By.xpath(Writer2));
            String d = driver.findElement(By.xpath((Writer2))).getAttribute("text");
            basePage.firstResult(By.xpath(Writer3));
            String e = driver.findElement(By.xpath((Writer3))).getAttribute("text");
            basePage.firstResult((By.xpath(Star1)));
            String f = driver.findElement(By.xpath((Star1))).getAttribute("text");
            basePage.firstResult(By.xpath(Star2));
            String g = driver.findElement(By.xpath((Star2))).getAttribute("text");
            basePage.firstResult(By.xpath(Star3));
            String h = driver.findElement(By.xpath((Star3))).getAttribute("text");

            myWriter.write(a);
            myWriter.newLine();
            myWriter.write(b);
            myWriter.newLine();
            myWriter.write(c);
            myWriter.newLine();
            myWriter.write(d);
            myWriter.newLine();
            myWriter.write(e);
            myWriter.newLine();
            myWriter.write(f);
            myWriter.newLine();
            myWriter.write(g);
            myWriter.newLine();
            myWriter.write(h);
            myWriter.close();
            System.out.println("Successfully wrote to the jazzdata2.txt file.");
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
    public void clickTitle() {basePage.click(By.xpath(titleXpath));}


}

