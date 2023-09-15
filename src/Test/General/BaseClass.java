package Test.General;

import POM.PageObject;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;

public class BaseClass {

    public static WebDriver driver;
    public static Actions action;


    //  To Open Chrome Browser and Navigate to the URL
    public void chromeConfig() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Dependency\\chromedriver.exe");

        this.driver = new ChromeDriver();

        PageObject PageObject = new PageObject(driver);

        action = new Actions(driver);
        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
    }

    //  To Open Edge Browser and Navigate to the URL
    public void edgeConfig() {
        System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "\\Dependency\\msedgedriver.exe");

        this.driver = new EdgeDriver();

        PageObject PageObject = new PageObject(driver);

        action = new Actions(driver);
        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
    }

    @BeforeMethod(groups = {"E2E"})

    public void configuration() {
        // Write code here that turns the phrase above into concrete actions

//        edgeConfig();
        chromeConfig();

    }




    @AfterMethod(groups = {"E2E"})
    public void userLogout(){
        // Write code here that turns the phrase above into concrete actions

        PageObject.close();
    }



}




