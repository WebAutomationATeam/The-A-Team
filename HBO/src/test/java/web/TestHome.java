package web;

import Util.TestLogger;
import base.CommonAPI;
import basic.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHome extends HomePage {

    HomePage hp = null;
    @BeforeMethod
    public void initializeElement () {
        hp=PageFactory.initElements(driver,HomePage.class);
    }
    @Test
    public void clickSearchButton () { hp.clickOnSearchButton(); }
    @Test
    public void clickGetHBO() {hp.clickonGetHBO(); }
    @Test
    public void clickSignIn() {hp.clickOnSignIn();}
    @Test
    public void clickLogo () {hp.clickOnLogo();}
    @Test
    public void clickSearchlink(){searchlink.click();}
    @Test
    public void searchItems(){sendInput();}
    @Test
    public void clickSeries(){findSeries();}
    @Test
    public void clickMovie(){findMovies();}
    @Test
    public void clickFreeEpisodes(){getFreeEpisodes();}
    @Test
    public void clickGetItToday(){clickHBOToday();}
    @Test
    public void goToNextSlide(){clickNextSlide();}
    @Test
    public void testFbPage(){getFbPage();}
    @Test
    public void checkInstaPage(){getInstaPage();}
    @Test
    public void viewTwitterPage(){getTwitterPage();}
    @Test
    public void viewYoutubePage(){navigateToYoutubePage();}

}
