import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import searchCiti.MainSearchOption;

public class TestMainSearchOpt extends MainSearchOption {
    MainSearchOption mainSearchOpt;
    @BeforeMethod
    public void init(){
        mainSearchOpt = PageFactory.initElements(driver, MainSearchOption.class);
    }
    @Test
    public void test(){
        mainSearchOpt.searchOpt();
    }
}
