package searchCiti;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CitiGoldOption extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"citiGold\"]")
    public static WebElement citiGoldOption;

    public void search(){
        citiGoldOption.click();
    }
}


