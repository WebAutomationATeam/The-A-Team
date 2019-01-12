package testCostcoSearching;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import searchDB.DBOperation;

import java.util.List;

public class TestDB extends CommonAPI {

    DBOperation dbOperation;
    @BeforeMethod
    public void setUP(){
        dbOperation = PageFactory.initElements(driver, DBOperation.class);

    }
    @Test
    public void webElementName() throws Exception {
        List actual = dbOperation.getUserDatafromDB();
        List expected = dbOperation.getHeadersValue1();
        Assert.assertEquals(actual,expected);

    }
}
