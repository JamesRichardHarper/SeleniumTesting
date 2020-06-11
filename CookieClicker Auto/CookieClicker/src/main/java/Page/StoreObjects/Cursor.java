package Page.StoreObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Cursor {

    @FindBy(id = "product0")
    public WebElement MouseClickable;

    @FindBy(id = "productPrice0")
    public WebElement MousePrice;

    @FindBy(id = "productOwned0")
    public WebElement MouseOwened;
}
