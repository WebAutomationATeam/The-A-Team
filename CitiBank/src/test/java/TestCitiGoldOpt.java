import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import searchCiti.CitiGoldOption;

public class TestCitiGoldOpt extends CitiGoldOption {
    CitiGoldOption citiGoldOpt;
    @BeforeMethod
    public void init() {
        citiGoldOpt = PageFactory.initElements(driver, CitiGoldOption.class);
    }
    @Test
    public void test() {
        citiGoldOpt.search(); }
}
