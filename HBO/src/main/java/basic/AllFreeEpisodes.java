package basic;

import Util.TestLogger;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.ArrayList;
import java.util.List;

public class AllFreeEpisodes extends CommonAPI {

    @FindBy (xpath = "/html/body/main/div[1]/div/div/header/div[1]/div/div[3]/ul/li[1]/div/a")
    public WebElement freeEpisodes;

    @FindBy(xpath = "/html/body/main/div[2]/div/div/div[1]/div[1]/div[1]/div[2]/h1/a")
    public WebElement sopranos;

    @FindBy (xpath = "//div[@class='__player-placeholder-play-button']")
    public WebElement playSopranos;

    @FindBy (xpath = "/html/body/main/div[4]/div/div/div[1]/div[2]/div[2]/div/div[1]/div/a/img")
    public WebElement theIceBox;

    @FindBy (xpath = "//div[@class='__player-placeholder-play-button']")
    public WebElement playIceBox;

    @FindBy (xpath = "/html/body/main/div[4]/div/div/div[3]/section/div/div/div[2]/div/div/div/div[5]/div/div/div/form/input")
    public WebElement inputEmail;

    @FindBy (xpath = "//div[@class='__player-placeholder-play-button']")
    public WebElement pressPlay;

    @FindBy (xpath = "/html/body/main/div[4]/div/div/div[1]/div[2]/div[1]/section/div/div/div/div[2]/div/a/img")
    public WebElement westWorld;

    @FindBy (xpath = "//div[@class='__player-placeholder-play-button']")
    public WebElement playWestWorld;

    @FindBy (xpath = "/html/body/main/div[4]/div/div/div[1]/div[2]/div[2]/div/div[3]/div/a/img")
    public WebElement barry;

    @FindBy (xpath = "//div[@class='__player-placeholder-play-button']")
    public WebElement playBarry;

    @FindBy (xpath = "/html/body/main/div[7]/div/div/div[1]/div[2]/div[2]/section/div/div/div/div[1]/div/a/img")
    public WebElement sally4Ever;

    @FindBy (xpath = "//div[@class='__player-placeholder-play-button']")
    public WebElement playSally4Ever;

    @FindBy (xpath = "/html/body/main/div[7]/div/div/div[1]/div[2]/div[1]/section/div/div/div/div[2]/div/a/img")
    public WebElement podSaveAmerica;

    @FindBy (xpath = "//div[@class='__player-placeholder-play-button']")
    public WebElement playPodSaveAmerica;

    @FindBy (xpath = "/html/body/main/div[7]/div/div/div[1]/div[2]/div[1]/section/div/div/div/div[3]/div/a/img")
    public WebElement sharpObjects;

    @FindBy (xpath = "//div[@class='__player-placeholder-play-button']")
    public WebElement playSharpObjects;

    @FindBy (xpath = "/html/body/main/div[7]/div/div/div[1]/div[2]/div[1]/section/div/div/div/div[4]/div/a/img")
    public WebElement animals;

    @FindBy (xpath = "//div[@class='__player-placeholder-play-button']")
    public WebElement playAnimals;

    @FindBy (xpath = "/html/body/main/div[7]/div/div/div[1]/div[2]/div[1]/section/div/div/div/div[5]/div/a/img")
    public WebElement srAvila;

    @FindBy (xpath = "//div[@class='__player-placeholder-play-button']")
    public WebElement playSrAvila;

    @FindBy (xpath = "/html/body/main/div[7]/div/div/div[1]/div[2]/div[1]/section/div/div/div/div[6]/div/a/img")
    public WebElement veep;

    @FindBy (xpath = "//div[@class='__player-placeholder-play-button']")
    public WebElement playVeep;

    @FindBy (xpath = "/html/body/main/div[7]/div/div/div[1]/div[2]/div[1]/section/div/div/div/div[7]/div/a/img")
    public WebElement hereAndNow;

    @FindBy (xpath = "//div[@class='__player-placeholder-play-button']")
    public WebElement playHereAndNow;

    @FindBy (xpath = "/html/body/main/div[7]/div/div/div[1]/div[2]/div[1]/section/div/div/div/div[8]/div/a/img")
    public WebElement theNightOf;

    @FindBy (xpath = "//div[@class='__player-placeholder-play-button']")
    public WebElement playTheNightOf;

    @FindBy (xpath = "/html/body/main/div[7]/div/div/div[1]/div[2]/div[1]/section/div/div/div/div[9]/div/a/img")
    public WebElement room104;

    @FindBy (xpath = "//div[@class='__player-placeholder-play-button']")
    public WebElement playRoom104;

    public WebElement getFreeEpisodes() {
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        freeEpisodes.click();
        return freeEpisodes;
    }
    public WebElement getWatchSopranos() {
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sopranos.click();
        return sopranos;
    }
    public WebElement getPlaySopranos() {
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        playSopranos.click();
        return playSopranos;
    }
    public WebElement getTheIceBox() {
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        theIceBox.click();
        return theIceBox;
    }
    public WebElement getPlayIceBox() {
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        playIceBox.click();
        return playIceBox;
    }
    public WebElement getInputEmail(){
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        inputEmail.sendKeys("roktimrobin@gmail.com");
        return inputEmail;
    }
    public WebElement getPressPlay(){
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        pressPlay.click();
        return pressPlay;
    }
    public WebElement getWestWorld() {
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        westWorld.click();
        return westWorld;
    }
    public WebElement getPlayWestWorld() {
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        playWestWorld.click();
        return playWestWorld;
    }
    public WebElement getBarry() {
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        barry.click();
        return barry;
    }
    public WebElement getPlayBarry() {
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        playBarry.click();
        return playBarry;
    }
    public WebElement getSally4Ever() {
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sally4Ever.click();
        return sally4Ever;
    }
    public WebElement getPlaySally4Ever() {
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        playSally4Ever.click();
        return playSally4Ever;
    }
    public WebElement getPodSaveAmerica() {
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        podSaveAmerica.click();
        return podSaveAmerica;
    }
    public WebElement getPlayPodSaveAmerica() {
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        playPodSaveAmerica.click();
        return playPodSaveAmerica;
    }
    public WebElement getSharpObjects() {
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sharpObjects.click();
        return sharpObjects;
    }
    public WebElement getPlaySharpObjects() {
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        playSharpObjects.click();
        return playSharpObjects;
    }
    public WebElement getAnimals() {
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getAnimals().click();
        return animals;
    }
    public WebElement getPlayAnimals() {
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        playAnimals.click();
        return playAnimals;
    }
    public WebElement getSrAvila() {
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        srAvila.click();
        return srAvila;
    }
    public WebElement getPlaySrAvila() {
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        playSrAvila.click();
        return playSrAvila;
    }
    public WebElement getVeep() {
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        veep.click();
        return veep;
    }
    public WebElement getPlayVeep() {
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        playVeep.click();
        return playVeep;
    }
    public WebElement getHereAndNow() {
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        hereAndNow.click();
        return hereAndNow;
    }
    public WebElement getPlayHereAndNow() {
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        playHereAndNow.click();
        return playHereAndNow;
    }
    public WebElement getTheNightOf() {
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        theNightOf.click();
        return theNightOf;
    }
    public WebElement getPlayTheNightOf() {
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        playTheNightOf.click();
        return playTheNightOf;
    }
    public WebElement getRoom104() {
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        room104.click();
        return room104;
    }
    public WebElement getPlayRoom104() {
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        playRoom104.click();
        return playRoom104;
    }
    public List list(){
        List<WebElement> webElements = new ArrayList<>();
        webElements.add(sopranos);
        webElements.add(theIceBox);
        webElements.add(westWorld);
        webElements.add(barry);
        webElements.add(sally4Ever);
        webElements.add(podSaveAmerica);
        webElements.add(sharpObjects);
        webElements.add(animals);
        webElements.add(srAvila);
        webElements.add(veep);
        webElements.add(hereAndNow);
        webElements.add(theNightOf);
        webElements.add(room104);

        List<String > text = new ArrayList<>();
        for(int i = 0; i<webElements.size();i++){
            text.add(webElements.get(i).getText());
            System.out.println(webElements.get(i).getText());
        }
        return text;
    }
    public List expectedAllFreeEpisodes(){
        List<String> expectedShowsName = new ArrayList<>();
        expectedShowsName.add("Sopranos");
        expectedShowsName.add("The IceBox");
        expectedShowsName.add("WestWorld");
        expectedShowsName.add("Barry");
        expectedShowsName.add("Sally4Ever");
        expectedShowsName.add("Pod Save America");
        expectedShowsName.add("Sharp Objects");
        expectedShowsName.add("Animals");
        expectedShowsName.add("Sr.Avila");
        expectedShowsName.add("Veep");
        expectedShowsName.add("Here and Now");
        expectedShowsName.add("The Night Of");
        expectedShowsName.add("Room 104");
        return expectedShowsName;
    }

}
