package searchCiti;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InvestingOption extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"investing\"]")
    public static WebElement investingOption;

    public void search(){
        investingOption.click();
    }
}



