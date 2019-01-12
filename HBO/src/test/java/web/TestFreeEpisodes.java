package web;

import basic.AllFreeEpisodes;
import basic.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestFreeEpisodes extends AllFreeEpisodes {

    AllFreeEpisodes free;

    @BeforeMethod
    public void initializeElement(){ free= PageFactory.initElements(driver, AllFreeEpisodes.class); }

    @Test
    public void navigateToFreeEpisodes(){free.getFreeEpisodes();}

}
