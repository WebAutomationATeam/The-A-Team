package TestSearch;

import Util.TestLogger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import search.Keyword;

public class KeywordDrivenTest extends Keyword {
    Keyword keyword;

    @BeforeMethod
    public void intializeElements(){
        keyword = PageFactory.initElements(driver,Keyword.class);
    }
    @Test
    public void keywordTest() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        keyword.keywordWebElement();
    }
}
