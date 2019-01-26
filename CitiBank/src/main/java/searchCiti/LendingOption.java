package searchCiti;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LendingOption extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"lending\"]")
    public static WebElement lendingOption;

    public void search() {
        lendingOption.click();
    }
}