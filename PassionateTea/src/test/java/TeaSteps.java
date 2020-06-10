import Pages.TeaCheckout;
import Pages.TeaLanding;
import Pages.TeaMenu;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class TeaSteps {

    public WebDriver driver;
    public static ExtentReports report;
    public ExtentTest test;

    @BeforeClass
    public static void ReportSetup(){
        report = new ExtentReports();
        ExtentHtmlReporter htmlReport = new ExtentHtmlReporter("test-output/html/extentReport.html");
        htmlReport.config().setAutoCreateRelativePathMedia(true);
        report.attachReporter(htmlReport);

    }

    @Before
    public void DriverSetup(){
        System.setProperty(Config.Property , Config.ChromeLocation);
        ChromeOptions opts = new ChromeOptions();
        opts.setHeadless(false);
        driver = new ChromeDriver(opts);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @Given("^the correct web address$")
    public void the_correct_web_address() throws Throwable {
        driver.get(Config.WebPage);
    }

    @When("^I navigate to the 'Menu' page$")
    public void i_navigate_to_the_Menu_page() throws Throwable {
        TeaLanding Landing = PageFactory.initElements(driver, TeaLanding.class);
        Landing.MainMenu.click();
    }

    @Then("^I can browse a list of the available products\\.$")
    public void i_can_browse_a_list_of_the_available_products() throws Throwable {
        TeaMenu Menu = PageFactory.initElements(driver, TeaMenu.class);
        Assert.assertNotNull(Menu.TeaSelection);
    }

    @Given("^the correct web address for the second scenario$")
    public void the_correct_web_address_for_the_second_scenario() throws Throwable {
        driver.get(Config.WebPage);
    }

    @When("^I click the other checkout button$")
    public void i_click_the_other_checkout_button() throws Throwable {
        TeaLanding Landing = PageFactory.initElements(driver, TeaLanding.class);
        Landing.MainMenu.click();
        TeaMenu Menu = PageFactory.initElements(driver, TeaMenu.class);
        Menu.CheckOutGreen.click();
    }

    @Then("^I am taken to the checkout page$")
    public void i_am_taken_to_the_checkout_page() throws Throwable {
        TeaCheckout Checkout = PageFactory.initElements(driver, TeaCheckout.class);
        Checkout.PlaceOrder.click();
    }

    @After
    public void quit(){
        driver.quit();
    }

}
