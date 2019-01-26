import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import searchCiti.InvestingOption;

public class TestInvestingOpt extends InvestingOption {
    InvestingOption investingOpt;
    @BeforeMethod
    public void init(){
        investingOpt = PageFactory.initElements(driver, InvestingOption.class);
    }
    @Test
    public void test(){
        investingOpt.search();}
}