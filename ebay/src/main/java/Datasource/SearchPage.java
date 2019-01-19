package Datasource;

import Util.TestLogger;
import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import java.util.List;
import static Datasource.DatabaseOperation.getItemValue;
public class SearchPage extends CommonAPI {
    @FindBy(how = How.XPATH, using ="//*[@id=\"gh-ac\"]")
    public static WebElement searchInputWebElement;
    @FindBy(how = How.XPATH, using ="//*[@id=\"gh-btn\"]")
    public static WebElement submitButtonWebElement;
    public void searchFor(String value){
        searchInputWebElement.sendKeys(value);
    }
    public void clearInput(){
        searchInputWebElement.clear();
    }
    public void submitSearchButton(){
        submitButtonWebElement.click();
    }
    public void searchItemsAndSubmitButton()throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        DatabaseOperation databaseOperation = new DatabaseOperation();
        List<String> list = databaseOperation.getItemsListFromDB(); //Getting Item from database
        for(int i=0; i<list.size(); i++) {
            searchFor(list.get(i));
            submitSearchButton();
            clearInput();
        }
    }
    public WebElement getSearchInputField() {
        return searchInputWebElement;
    }
    public void searchItems(){
        List<String> itemList = getItemValue();
        for(String st: itemList) {
            getSearchInputField().sendKeys(st, Keys.ENTER);
            getSearchInputField().clear();
        }
    }
}
