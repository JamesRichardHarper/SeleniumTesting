package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TeaMenu {

    @FindBy(xpath = "//*[@id=\"wsb-button-00000000-0000-0000-0000-000451955160\"]/span")
    public WebElement CheckOutGreen;

    @FindBy(xpath = "//*[@id=\"wsb-button-00000000-0000-0000-0000-000451959280\"]")
    public WebElement CheckOutRed;

    @FindBy(xpath = "//*[@id=\"wsb-button-00000000-0000-0000-0000-000451961556\"]/span")
    public WebElement CheckOutOolong;

    @FindBy(xpath = "//*[text()=' tea']")
    public WebElement TeaSelection;

    /**
     * For all intents and purposes, these checkout buttons all lead
     * to the same place
     */
}
