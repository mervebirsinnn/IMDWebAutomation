package org.example;
import org.apache.log4j.PropertyConfigurator;
import org.example.*;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class BaseTest {
    Logger logger;
    public WebDriver driver;
    public WebDriverWait wait;
    public Actions action;

    protected MenuSteps menuSteps;
    protected TheCircus theCircus;
    protected  PhotoCheck photoCheck;
    protected  TheJazzSinger theJazzSinger;
    protected  CompareFile compareFile;

    @Before
    public void setup() {

        String projectPath = System.getProperty("user.dir");
        String log4jConfPath = projectPath + "\\src\\main\\resources\\log4j.properties";
        PropertyConfigurator.configure(log4jConfPath);
        logger = LoggerFactory.getLogger(BaseTest.class.getName());

        System.setProperty("webdriver.chrome.driver", "C:\\bin\\chromedriver.exe");
        this.driver = new ChromeDriver();
        String url = "https://www.imdb.com/";
        this.driver.get(url);
        this.driver.manage().window().maximize();

        menuSteps = new MenuSteps(driver,wait,action);
        theCircus = new TheCircus(driver,wait,action);
        photoCheck = new PhotoCheck(driver,wait,action);
        theJazzSinger = new TheJazzSinger(driver,wait,action);
        compareFile = new CompareFile(driver,wait,action);
    }
    @After
    public void quitDriver() {
      //  logger.info("TEST IS TERMINATED");
       // this.driver.quit();
    }
}
