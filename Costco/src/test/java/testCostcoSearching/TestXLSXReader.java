package testCostcoSearching;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import search.ReadCostcoWebElements;

import java.util.List;

public class TestXLSXReader extends CommonAPI {

        ReadCostcoWebElements readCostcoWebElements;

        @BeforeMethod
        public void setUP(WebDriver driver){
            readCostcoWebElements = PageFactory.initElements(driver,ReadCostcoWebElements.class);

        }
        @Test
        public void webElementName(){// data driven test, using data from excel sheets
            List actual = readCostcoWebElements.webElementList();
            List expected = readCostcoWebElements.expectedWebElement();
            Assert.assertEquals(actual,expected);

        }
        @Test
        public void webElementName1(){// data driven test, using data from excel sheets
            List actual = readCostcoWebElements.webElementList1();
            List expected = readCostcoWebElements.expectedWebElement1();
            Assert.assertEquals(actual,expected);
        }
    }

