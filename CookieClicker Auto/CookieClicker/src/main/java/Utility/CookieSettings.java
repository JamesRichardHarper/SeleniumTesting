package Utility;

import Page.Landing;
import Utility.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class CookieSettings {

    public static WebDriver driver;

    public static void Setup(){
        System.setProperty(Config.Property , Config.ChromeLocation);
        ChromeOptions opts = new ChromeOptions();
        opts.setHeadless(false);
        driver = new ChromeDriver(opts);
        driver.manage().window().maximize();
    }

    public static void Close(){
        driver.quit();
    }

    public static void GoToCookie(){
        driver.get(Config.WebPage);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public static Landing SetupPageclass(){
        Landing CookieMain = PageFactory.initElements(driver, Landing.class);
        return CookieMain;
    }
}
