package ReadList;

import Util.TestLogger;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;
public class ReadDropDown extends CommonAPI {
    public void readText() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<WebElement> element = getListOfWebElementsByCss("#gh-cat");
        List<String> listOfText = getListOfString(element);
        for (String text : listOfText) {
            System.out.println(text);
        }
        List<String> expectedMenu = listOfText;
        Assert.assertEquals(listOfText, expectedMenu);
    }
}
