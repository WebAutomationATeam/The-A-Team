package googleSheet;
import base.CommonAPI;
import com.google.api.services.sheets.v4.model.*;
import com.google.api.services.sheets.v4.Sheets;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static googleApi.GoogleSheetReader.getSheetsService;

public class GoogleSheetsPage extends CommonAPI{
    @FindBy(xpath = "//*[@id=\"username\"]")
    WebElement useId;
    @FindBy(xpath = "//*[@id=\"password\"]")
    WebElement password;
    @FindBy(xpath = "//*[@id=\"signInBtn\"]")
    WebElement signOn;
    @FindBy(css = "//*[@id=\"signOnLoginError\"]")
    WebElement logInErrorMesage;

    public void clickSignOn() throws InterruptedException {
        sleepFor(4);
        signOn.click();
 }
      public List<List<Object>> getSpreadSheetRecords(String spreadsheetId, String range) throws IOException {
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
    public List<String> signInByInvalidIdPass(String spreadsheetId, String range) throws IOException, InterruptedException {
        List<List<Object>> col2Value = getSpreadSheetRecords(spreadsheetId, range);
        List<String> actual = new ArrayList<>();
        for (List row : col2Value) {
            sleepFor(1);
            inputValueInTextBoxByWebElement(useId, row.get(0).toString());
            inputValueInTextBoxByWebElement(password, row.get(1).toString());
            sleepFor(1);
            //actual.add(getCurrentPageTitle());
            actual.add(getTextByWebElement(logInErrorMesage));
            System.out.println(getTextByWebElement(logInErrorMesage));
            clearInputBox(useId);
            clearInputBox(password);
            sleepFor(1);
        }
        return actual;
    }
    private String getTextByWebElement(WebElement webElement) {
        String text = webElement.getText();
        return text;
    }
}