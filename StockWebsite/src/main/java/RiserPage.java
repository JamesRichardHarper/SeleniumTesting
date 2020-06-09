import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RiserPage {

    @FindBy(xpath = "/html/body/main/div/div/div[3]/div[4]/div[1]/div[2]/table/tbody/tr[1]/td[2]")
    public WebElement CompanyName;

    @FindBy(xpath = "/html/body/main/div/div/div[3]/div[4]/div[1]/div[2]/table/tbody/tr[1]/td[5]")
    public WebElement PercentIncrease;

}
