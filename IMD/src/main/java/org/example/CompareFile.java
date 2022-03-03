package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CompareFile extends BasePage {
    BasePage basePage = new BasePage(driver,wait,action);
    public CompareFile(WebDriver driver, WebDriverWait wait, Actions action) {
        super(driver, wait, action);
    }
   public static boolean compareTextFiles ( String file1, String file2) throws FileNotFoundException, IOException {
        BufferedReader r1 = new BufferedReader(new FileReader(file1));
        BufferedReader r2 = new BufferedReader(new FileReader(file2));
        int c1=0, c2=0;
        while(true){
            c1 = r1.read();
            c2 = r2.read();
            if(c1==-1 && c2==-1)
                return true;
            else if(c1==-1 || c2==-1 || c1!=c2){
                return false;
            }
        }
    }

    public  void compareFile(String file1,String file2) throws IOException {


        if(compareTextFiles(file1, file2)){
            System.out.println("Files are same");
        }
        else{
            System.out.println("Files are different");
        }
    }
}
