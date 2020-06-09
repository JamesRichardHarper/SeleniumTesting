import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    WebDriver webdriver;

    @Before
    public void init() {
        webdriver = new ChromeDriver();
    }

    @Test
    public void test() {
        webdriver.manage().window().maximize();
        webdriver.get("https://www.google.com/");
        WebElement SearchBar = webdriver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div[1]/div[1]/div/div[2]/input"));
        SearchBar.sendKeys("Frogs");
        SearchBar.sendKeys(Keys.ENTER);
    }

    @After
    public void tearDown() {
        webdriver.quit();
    }
}
