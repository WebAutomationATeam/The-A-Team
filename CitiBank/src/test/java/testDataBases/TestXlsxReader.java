package testDataBases;
import base.CommonAPI;
import dataReader.ReadCitiBankWebElements;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;

public class TestXlsxReader extends CommonAPI {
    ReadCitiBankWebElements readCitiBankWebElements;
    @BeforeMethod
    public void setUP(){
        readCitiBankWebElements = PageFactory.initElements(driver, ReadCitiBankWebElements.class);
    }
    @Test
    public void webElementName(){// data driven test, using data from excel sheets
        List actual = readCitiBankWebElements.webElementList();
        List expected = readCitiBankWebElements.expectedWebElement();
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void webElementName1(){// data driven test, using data from excel sheets
        List actual = readCitiBankWebElements.webElementList1();
        List expected = readCitiBankWebElements.expectedWebElement1();
        Assert.assertEquals(actual,expected);
    }
}