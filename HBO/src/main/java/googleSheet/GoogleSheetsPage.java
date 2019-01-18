package googleSheet;

import base.CommonAPI;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.ValueRange;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static googleApi.GoogleSheetReader.getSheetsService;
import static org.openqa.selenium.support.How.CSS;

public class GoogleSheetsPage extends CommonAPI {

    /*// we have to use our own methods
    @FindBy(how = CSS, using = "#login-user")
    public static WebElement user;
    @FindBy(how = CSS, using = "#login-password")
    public static WebElement password;
    @FindBy(css = "#login-submit")
    public static WebElement logInButton;
    @FindBy(css = "#alertMsg")
    public static WebElement logInErrorMesage;

    public void clickLogIn() throws InterruptedException {
        sleepFor(4);
        logInButton.click();
    }
//    public void switchToLogInForm() {
//        driver.switchTo().frame("Amex login");
//   }

    public List<List<Object>> getSpreadSheetRecords(String spreadsheetId, String range) throws IOException {
        // Build a new authorized API client service.
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
    // //ALI_GS_TC1 LogIn by using Google Sheet sheet data
    public List<String> signInByInvalidIdPass(String spreadsheetId, String range) throws IOException, InterruptedException {

        List<List<Object>> col2Value = getSpreadSheetRecords(spreadsheetId, range);
        List<String> actual = new ArrayList<>();
        for (List row : col2Value) {
            sleepFor(1);
            inputValueInTextBoxByWebElement(user, row.get(0).toString());
            inputValueInTextBoxByWebElement(password, row.get(1).toString());
            sleepFor(1);
            //actual.add(getCurrentPageTitle());
            actual.add(getTextByWebElement(logInErrorMesage));
            System.out.println(getTextByWebElement(logInErrorMesage));
            clearInputBox(user);
            clearInputBox(password);
            sleepFor(1);
        }
        return actual;
    }

    public String getTextByWebElement(WebElement webElement) {
        String text = webElement.getText();
        return text;
    }*/
}
