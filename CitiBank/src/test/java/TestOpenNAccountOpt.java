import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import searchCiti.OpenNAccountOption;

public class TestOpenNAccountOpt extends OpenNAccountOption {
    OpenNAccountOption openNAccountOpt;
    @BeforeMethod
    public void init() {
        openNAccountOpt = PageFactory.initElements(driver, OpenNAccountOption.class);
    }
    @Test
    public void test() {
        openNAccountOpt();
    }
}
