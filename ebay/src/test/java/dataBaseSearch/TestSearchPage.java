package dataBaseSearch;

import Datasource.SearchPage;
import Util.TestLogger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
public class TestSearchPage extends SearchPage {
    //User should be able to search items from search box using MySql database
    @Test
    public void testSearchPage() throws Exception {
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchPage.searchItemsAndSubmitButton();
    }
}
