package HomePage;

import MainPage.SearchEBay;
import Util.TestLogger;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;
public class TestSearchEBay extends CommonAPI {
    //User should be able to search items in the search box and get results
    @Test
    public void searchItems() throws IOException, InterruptedException {
        SearchEBay search = PageFactory.initElements(driver, SearchEBay.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        search.searchItemsAndSubmitButton();
    }
}
