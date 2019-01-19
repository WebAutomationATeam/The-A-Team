package GoogleSheetReader;

import Util.TestLogger;
import base.CommonAPI;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.ValueRange;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static googleApi.GoogleSheetReader.getSheetsService;
import static org.openqa.selenium.support.How.CSS;
public class GoogleSheetsPage extends CommonAPI {
    String spreadsheetId = "1G4HDqbno6QFb5LGhF-iqzB1ANBSbhCDzKwFHvJfrgYA";
    String range = "Sheet1!A1:Z1000";
    @FindBy(xpath = ("//*[@id=\"gh-ug\"]/a"))
    public static WebElement ViewSignInUser;
    @FindBy(how = CSS, using = "#userid")
    public static WebElement user;
    @FindBy(how = CSS, using = "#pass")
    public static WebElement password;
    @FindBy(css = "#sgnBt")
    public static WebElement logInButton;
    @FindBy(css = "#errf")
    public static WebElement logInErrorMesage;
    public void clickLogIn() throws InterruptedException {
        ViewSignInUser.click();
        logInButton.click();
    }
    public List<List<Object>> getSpreadSheetRecords() throws IOException {
    //Build a new authorized API client service.
        Sheets service = getSheetsService();
        ValueRange response = service.spreadsheets().values()
                .get(spreadsheetId, range)
                .execute();
        List<List<Object>> values = response.getValues();
        if (values == null || values.size() == 0) {
            return null;
        } else {
            return values;
        }
    }
    //LogIn by using Google Sheet sheet data
    public List<String> signInByInvalidIdPass() throws IOException, InterruptedException {
        List<List<Object>> col2Value = getSpreadSheetRecords();
        List<String> actual = new ArrayList<>();
        for (List row : col2Value) {
            inputValueInTextBoxByWebElement(user, row.get(0).toString());
            inputValueInTextBoxByWebElement(password, row.get(1).toString());
            actual.add(getTextByWebElement(logInErrorMesage));
            System.out.println(getTextByWebElement(logInErrorMesage));
            clearInputBox(user);
            clearInputBox(password);
        }
        return actual;
    }
    public void testGoogleSheet() throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickLogIn();
        List<String> actualItems = signInByInvalidIdPass();
        List<List<Object>> expectedItems = getSpreadSheetRecords();
        Assert.assertEquals(actualItems,expectedItems);
    }
}
