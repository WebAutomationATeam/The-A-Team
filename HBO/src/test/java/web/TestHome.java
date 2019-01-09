package web;

import Util.TestLogger;
import base.CommonAPI;
import basic.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHome extends HomePage {

    HomePage hp = null;
    @Test
    public void Test () {
        hp = PageFactory.initElements(driver, HomePage.class);
        //TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        hp.clickOnSearchButton();
    }

    @Test
    public void Test1() {
        hp = PageFactory.initElements(driver,HomePage.class);
        hp.clickonGetHBO();
    }
    @Test
    public void Test2() {
        hp = PageFactory.initElements(driver,HomePage.class);
        hp.clickOnSignIn();
    }

}
