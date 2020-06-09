import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class CheckWebsite {

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
        System.setProperty(Config.Property , Config.ChromeLocation);
        ChromeOptions opts = new ChromeOptions();
        opts.setHeadless(false);
        driver = new ChromeDriver(opts);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void openWebsite(){
        driver.get(Config.WebPage);
        this.test = report.createTest("testOpen");

        LoadInPage Landing = PageFactory.initElements(driver, LoadInPage.class);

        Landing.Cookie.click();
        Landing.Risers.click();

        RiserPage Riser = PageFactory.initElements(driver, RiserPage.class);

        String Company = Riser.CompanyName.getText();
        String Increase = Riser.PercentIncrease.getText();
        System.out.println(Company + " - " + Increase);

    }

    @After
    public void quit(){
        driver.quit();
    }

    @AfterClass
    public static void sendReport(){
        report.flush();
    }


}
