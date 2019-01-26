import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import searchCiti.BankingOption;

public class TestBankingOpt extends BankingOption {

    BankingOption bankingOpt;

    @BeforeMethod
    public void init() {
        bankingOpt = PageFactory.initElements(driver, BankingOption.class);
    }
//    @Test
//    public void test(){
//        bankingOpt.mouseHoverByXpath();}
//}
}