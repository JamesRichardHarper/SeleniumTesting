import Pages.AutoLandingPage;
import Pages.AutoSearchedPage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {
    public WebDriver driver;
    public static ExtentReports report;
    public ExtentTest test;

    @BeforeClass
    public static void setup(){
        report = new ExtentReports();
        ExtentHtmlReporter htmlReport = new ExtentHtmlReporter("test-output/html/extentReport.html");
        htmlReport.config().setAutoCreateRelativePathMedia(true);
        report.attachReporter(htmlReport);

    }

    @Before
    public void init() {
        ChromeOptions opts = new ChromeOptions();
        opts.setHeadless(false);
        driver = new ChromeDriver(opts);
        driver.manage().window().maximize();
    }

    @Test
    public void testPOM(){
        driver.get("http://automationpractice.com/index.php");
        this.test = report.createTest("testOpen");

        final String SearchTerm = "Dress";

        AutoLandingPage Landing = PageFactory.initElements(driver, AutoLandingPage.class);
        Landing.search(SearchTerm);

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        AutoSearchedPage Searched = PageFactory.initElements(driver, AutoSearchedPage.class);
        Searched.addItemToCart.click();
    }

//    @After
//    public void quit(){
//        driver.quit();
//    }

    @AfterClass
    public static void sendReport(){
        report.flush();
    }

}
