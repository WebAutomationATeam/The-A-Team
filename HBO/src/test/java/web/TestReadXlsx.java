package web;
import basic.ReadXlsx;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TestReadXlsx extends ReadXlsx {

    ReadXlsx read;
    @BeforeMethod
    public void initializeElement () {
        read= PageFactory.initElements(driver, ReadXlsx.class);
    }
    @Test
    public void webElementName(){
        List actual = read.webElementList();
        List expected = read.expectedWebElement();
        Assert.assertEquals(actual,expected);
    }
}
