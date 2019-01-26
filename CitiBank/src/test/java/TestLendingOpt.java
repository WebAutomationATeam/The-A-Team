import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import searchCiti.LendingOption;

public class TestLendingOpt extends LendingOption {
    LendingOption lendingOpt;
    @BeforeMethod
    public void init(){
        lendingOpt = PageFactory.initElements(driver, LendingOption.class);
    }
    @Test
    public void test(){
        lendingOpt.search();
    }
}




