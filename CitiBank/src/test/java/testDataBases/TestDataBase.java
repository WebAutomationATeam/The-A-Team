package testDataBases;

import base.CommonAPI;
import dataBaseOperation.DataBaseOperations;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;

public class TestDataBase extends CommonAPI {
    DataBaseOperations databaseOperation;
    @BeforeMethod
    public void setUP() {
        databaseOperation = PageFactory.initElements(driver, DataBaseOperations.class);
    }
    @Test
    public void webElementName() throws Exception {
        List actual = databaseOperation.getUserDatafromDB();
        List expected = databaseOperation.getHeadersValue1();
        Assert.assertEquals(actual,expected);
    }
}