package TestSearch;

import googleSheet.GoogleSheetsPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
public class TestGoogleSheet extends GoogleSheetsPage {
    GoogleSheetsPage googleSheetsPage;
    @Test
    public void testLogInByInvalidIdPassUsingGoogleSheet() throws Exception {
        googleSheetsPage = PageFactory.initElements(driver, GoogleSheetsPage.class);
        googleSheetsPage.testGoogleSheet();
    }
}

