package testCostcoSearching;
import keywordDriven.Keyword;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KeywordDrivenTest extends Keyword{
    Keyword keyword;
    @BeforeMethod
    public void intializedElements(){
        keyword = PageFactory.initElements(driver,Keyword.class);
    }
    @Test
    public void keywordTest()throws Exception{
        keyword.keywordWebElement();
}
}
