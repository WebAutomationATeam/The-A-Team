package testFrontPage;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import frontPage.TopHeader;

public class TestTopHeader extends TopHeader {
    TopHeader topHeader;
    @BeforeMethod
    public void initial(){ topHeader = PageFactory.initElements(driver, TopHeader.class);
    }
    @Test
    public void test_atmBranchOption(){topHeader.atmBranchOption();}
    @Test
    public void test_openNAccountOption(){topHeader.openNAccountOption();}
    @Test
    public void test_languageChangeOption(){topHeader.languageChangeOption();}
    @Test
    public void test_leftHeaderLogoOption(){topHeader.leftHeaderLogoOption();}
    @Test
    public void test_frontSearchOption(){topHeader.frontSearchOption();}
}

