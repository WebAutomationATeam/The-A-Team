package web;

import basic.AllFreeEpisodes;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;

public class TestFreeEpisodes extends AllFreeEpisodes {
    AllFreeEpisodes free;
    @BeforeMethod
    public void initializeElement(){ free= PageFactory.initElements(driver, AllFreeEpisodes.class); }
    @Test
    public void navigateToFreeEpisodes(){free.getFreeEpisodes();}
    @Test
    public void watchSoprano() throws InterruptedException {
        free.getFreeEpisodes();
        free.getWatchSopranos();
        driver.wait(3000);
        free.getPlaySopranos();
        free.getInputEmail();
        free.getPressPlay();
    }
    @Test
    public void watchTheIceBox() throws InterruptedException {
        free.getFreeEpisodes();
        free.getTheIceBox();
        driver.wait(3000);
        free.getPlayIceBox();
        free.getInputEmail();
        free.getPressPlay();
    }
    @Test
    public void watchWestWorld() throws InterruptedException {
        free.getFreeEpisodes();
        free.getWestWorld();
        driver.wait(3000);
        free.getPlayWestWorld();
    }
    @Test
    public void watchBarry() throws InterruptedException {
        free.getFreeEpisodes();
        free.getBarry();
        driver.wait(3000);
        free.getPlayBarry();
    }
    @Test
    public void watchSally4Ever() throws InterruptedException {
        free.getFreeEpisodes();
        free.getSally4Ever();
        driver.wait(3000);
        free.getPlaySally4Ever();
    }
    @Test
    public void watchPodSaveAmerica() throws InterruptedException {
        free.getFreeEpisodes();
        free.getPodSaveAmerica();
        driver.wait(3000);
        free.getPlayPodSaveAmerica();
    }
    @Test
    public void watchSharpObjects() throws InterruptedException {
        free.getFreeEpisodes();
        free.getSharpObjects();
        driver.wait(3000);
        free.getPlaySharpObjects();
    }
    @Test
    public void watchAnimals() throws InterruptedException {
        free.getFreeEpisodes();
        free.getAnimals();
        driver.wait(3000);
        free.getPlayAnimals();
    }
    @Test
    public void watchSrAvila() throws InterruptedException {
        free.getFreeEpisodes();
        free.getSrAvila();
        driver.wait(3000);
        free.getPlaySrAvila();
    }
    @Test
    public void watchVeep() throws InterruptedException {
        free.getFreeEpisodes();
        free.getVeep();
        driver.wait(3000);
        free.getPlayVeep();
    }
    @Test
    public void watchHereAndNow() throws InterruptedException {
        free.getFreeEpisodes();
        free.getHereAndNow();
        driver.wait(3000);
        free.getPlayHereAndNow();
    }
    @Test
    public void watchTheNightOf() throws InterruptedException {
        free.getFreeEpisodes();
        free.getTheNightOf();
        driver.wait(3000);
        free.getPlayTheNightOf();
    }
    @Test
    public void watchRoom104() throws InterruptedException {
        free.getFreeEpisodes();
        free.getRoom104();
        driver.wait(3000);
        free.getPlayRoom104();
    }
    @Test
    public void allFreeSpisodes(){
        free.getFreeEpisodes();
        List actual = free.list();
        List expected = free.expectedAllFreeEpisodes();
        Assert.assertEquals(actual,expected);
    }
}
