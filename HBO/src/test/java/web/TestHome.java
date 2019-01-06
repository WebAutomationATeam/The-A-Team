package web;

import base.CommonAPI;
import basic.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHome extends CommonAPI {

    HomePage hp = null;
    @Test
    public void Test () {
        hp = PageFactory.initElements(driver, HomePage.class);
        hp.clickOnSearchButton();
    }

    @Test
    public void Test1() {
        hp = PageFactory.initElements(driver,HomePage.class);
        hp.clickonGetHBO();
    }
}
