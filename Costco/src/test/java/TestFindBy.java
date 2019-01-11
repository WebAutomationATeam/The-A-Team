import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import search.SearchFindBy;

public class TestFindBy extends SearchFindBy {

    SearchFindBy sfb = null;
    @Test
    public void Test () {
        sfb = PageFactory.initElements(driver, SearchFindBy.class);
        //TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sfb.clickOnSearchButton();
    }

    @Test
    public void Test1() {
        sfb = PageFactory.initElements(driver,SearchFindBy.class);
        sfb.clickonGetCostco();
    }
    @Test
    public void Test2() {
        sfb = PageFactory.initElements(driver,SearchFindBy.class);
        sfb.clickOnSignIn();
    }

}
