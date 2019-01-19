package GoogleSheetReader;

import Util.TestLogger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class TestGoogleSheet extends GoogleSheetsPage {
    GoogleSheetsPage googleSheetsPage;
    //Verify log in by taking data from a google sheets file
    @Test
    public void testLogInByInvalidIdPassUsingGoogleSheet() throws Exception {
        googleSheetsPage = PageFactory.initElements(driver, GoogleSheetsPage.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        googleSheetsPage.testGoogleSheet();
        }
    }