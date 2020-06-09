import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoadInPage {

    @FindBy(xpath = "//*[@id=\"view-constituents\"]/ul/li[2]")
    public WebElement Risers;

    @FindBy(linkText = "Fallers")
    public WebElement Fallers;

    @FindBy(xpath = "//*[@id=\"cookie-policy-overlay\"]/div/a[2]")
    public WebElement Cookie;
}
