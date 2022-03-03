package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Unit test for simple App.
 */
public class MainTest extends BaseTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testIMD() throws InterruptedException, IOException {
        logger.info("LandingPage Check");
        menuSteps.goTo();
        this.driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
        menuSteps.verifyPage();
        this.driver.manage().timeouts().implicitlyWait(45L, TimeUnit.SECONDS);
        logger.info("LandingPage Done");

        //Menu
        menuSteps.clickMenu();
        logger.info("Menu Check");
        this.driver.manage().timeouts().implicitlyWait(45L, TimeUnit.SECONDS);
        Thread.sleep(200);
        menuSteps.clickOscars();
        logger.info("Click oscars");
        menuSteps.clickEventYear();
        this.driver.manage().timeouts().implicitlyWait(45,TimeUnit.SECONDS);
        menuSteps.charlesSelect();
        logger.info("PageScroll and The Circus Selected");
        this.driver.manage().timeouts().implicitlyWait(900L, TimeUnit.SECONDS);
        theCircus.clearFile("C:\\proje\\IMD\\src\\main\\resources\\data.txt");
        this.driver.manage().timeouts().implicitlyWait(45L, TimeUnit.SECONDS);
        theCircus.saveElement("C:\\proje\\IMD\\src\\main\\resources\\data.txt");
        logger.info("added element");
      //  compareInfo
        this.driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
        theCircus.gotoHome();
        logger.info("go to main menu");
        this.driver.manage().timeouts().implicitlyWait(45L, TimeUnit.SECONDS);
        theCircus.sendKey("The Circus");
        logger.info("The Circus writed");
        this.driver.manage().timeouts().implicitlyWait(45L, TimeUnit.SECONDS);
        theCircus.searchButtonClick();
       logger.info("Search button clicceked");
        this.driver.manage().timeouts().implicitlyWait(45L, TimeUnit.SECONDS);
        theCircus.clickTitle();
        logger.info("clicked Title");
        theCircus.saveElementMain("C:\\proje\\IMD\\src\\main\\resources\\data2.txt");
        this.driver.manage().timeouts().implicitlyWait(45L, TimeUnit.SECONDS);
        compareFile.compareFile("C:\\proje\\IMD\\src\\main\\resources\\data2.txt","C:\\proje\\IMD\\src\\main\\resources\\data.txt");
        this.driver.manage().timeouts().implicitlyWait(45L, TimeUnit.SECONDS);

        //Check Photo
        photoCheck.clickAllPhoto();
        logger.info("photo open");
        photoCheck.TheCircusCheckPhoto();
        logger.info("all photoes are checked");

        //The Jaz Singer
        menuSteps.clickMenu();
        logger.info("Menu Check");
        this.driver.manage().timeouts().implicitlyWait(45L, TimeUnit.SECONDS);
        Thread.sleep(200);
        menuSteps.clickOscars();
        logger.info("Click oscars");
        menuSteps.clickEventYear();
        this.driver.manage().timeouts().implicitlyWait(45,TimeUnit.SECONDS);
        menuSteps.jazzSelect();
        logger.info("PageScroll and The Jazz Singer Selected");
        this.driver.manage().timeouts().implicitlyWait(900L, TimeUnit.SECONDS);
        theJazzSinger.saveElement("C:\\proje\\IMD\\src\\main\\resources\\jazzdata.txt");
        logger.info("added element");
        //  compareInfo
        this.driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
        theCircus.gotoHome();
        logger.info("go to main menu");
        this.driver.manage().timeouts().implicitlyWait(45L, TimeUnit.SECONDS);
        theCircus.sendKey("The Jaz Singer");
        logger.info("The Jaz Singer writed");
        this.driver.manage().timeouts().implicitlyWait(45L, TimeUnit.SECONDS);
        theCircus.searchButtonClick();
        logger.info("Clicked search button");
        this.driver.manage().timeouts().implicitlyWait(45L, TimeUnit.SECONDS);
        theJazzSinger.clickTitle();
        logger.info("clicked tihe title");
        theJazzSinger.saveElementMain("C:\\proje\\IMD\\src\\main\\resources\\jazzdata2.txt");
        logger.info("saved director, writer and star name");
        compareFile.compareFile("C:\\proje\\IMD\\src\\main\\resources\\jazzdata.txt","C:\\proje\\IMD\\src\\main\\resources\\jazzdata2.txt");
        this.driver.manage().timeouts().implicitlyWait(45L, TimeUnit.SECONDS);

        //Check Photo
        photoCheck.clickAllPhoto();
        logger.info("photo opened");
        photoCheck.TheJazzSingerCheckPhoto();
        logger.info("all photoes are checked");
    }
}
