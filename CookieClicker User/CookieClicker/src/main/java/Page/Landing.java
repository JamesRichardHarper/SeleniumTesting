package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Landing {

    @FindBy(xpath = "//*[@id=\"bigCookie\"]")
    public WebElement Cookie;

    @FindBy(id = "cookies")
    public WebElement CookieAmount;

}
