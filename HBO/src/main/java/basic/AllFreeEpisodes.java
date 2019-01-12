package basic;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllFreeEpisodes extends CommonAPI {

    @FindBy (xpath = "/html/body/main/div[1]/div/div/header/div[1]/div/div[3]/ul/li[1]/div/a")
    public WebElement freeEpisodes;

    @FindBy(xpath = "/html/body/main/div[2]/div/div/div[1]/div[1]/div[1]/div[2]/h1/a")
    public WebElement sopranos;

    @FindBy (xpath = "/html/body/main/div[2]/div/div/div[3]/section/div/div/div[2]/div/div/div/div[5]/div[2]/div[1]/button[1]")
    public WebElement playSopranos;

    @FindBy (xpath = "/html/body/main/div[4]/div/div/div[1]/div[2]/div[1]/section/div/div/div/div[1]/div/a/img")
    public WebElement theIceBox;

    @FindBy (xpath = "/html/body/main/div[4]/div/div/div[3]/section/div/div/div[2]/div/div/div/div[3]/div[2]/div/div[1]")
    public WebElement playIceBox;

    @FindBy (xpath = "/html/body/main/div[4]/div/div/div[1]/div[2]/div[1]/section/div/div/div/div[2]/div/a/img")
    public WebElement westWorld;

    @FindBy (xpath = "/html/body/main/div[4]/div/div/div[3]/section/div/div/div[2]/div/div/div/div[3]/div[2]/div/div[1]")
    public WebElement playWestWorld;

    @FindBy (xpath = "/html/body/main/div[4]/div/div/div[1]/div[2]/div[2]/div/div[3]/div/a/img")
    public WebElement barry;

    @FindBy (xpath = "/html/body/main/div[4]/div/div/div[3]/section/div/div/div[2]/div/div/div/div[3]/div[2]/div/div[1]")
    public WebElement playBarry;

    @FindBy (xpath = "/html/body/main/div[7]/div/div/div[1]/div[2]/div[2]/section/div/div/div/div[1]/div/a/img")
    public WebElement sally4Ever;

    @FindBy (xpath = "/html/body/main/div[7]/div/div/div[3]/section/div/div/div[2]/div/div/div/div[3]/div[2]/div/div[1]")
    public WebElement playSally4Ever;

    @FindBy (xpath = "/html/body/main/div[7]/div/div/div[1]/div[2]/div[1]/section/div/div/div/div[2]/div/a/img")
    public WebElement podSaveAmerica;

    @FindBy (xpath = "/html/body/main/div[7]/div/div/div[3]/section/div/div/div[2]/div/div/div/div[3]/div[2]/div/div[1]")
    public WebElement playPodSaveAmerica;

    @FindBy (xpath = "/html/body/main/div[7]/div/div/div[1]/div[2]/div[1]/section/div/div/div/div[3]/div/a/img")
    public WebElement sharpObjects;

    @FindBy (xpath = "/html/body/main/div[7]/div/div/div[3]/section/div/div/div[2]/div/div/div/div[3]/div[2]/div/div[1]")
    public WebElement playSharpObjects;

    @FindBy (xpath = "/html/body/main/div[7]/div/div/div[1]/div[2]/div[1]/section/div/div/div/div[4]/div/a/img")
    public WebElement animals;

    @FindBy (xpath = "/html/body/main/div[7]/div/div/div[3]/section/div/div/div[2]/div/div/div/div[3]/div[2]/div/div[1]")
    public WebElement playAnimals;

    @FindBy (xpath = "/html/body/main/div[7]/div/div/div[1]/div[2]/div[1]/section/div/div/div/div[5]/div/a/img")
    public WebElement srAvila;

    @FindBy (xpath = "/html/body/main/div[7]/div/div/div[3]/section/div/div/div[2]/div/div/div/div[3]/div[2]/div/div[1]")
    public WebElement playSrAvila;

    @FindBy (xpath = "/html/body/main/div[7]/div/div/div[1]/div[2]/div[1]/section/div/div/div/div[6]/div/a/img")
    public WebElement veep;

    @FindBy (xpath = "/html/body/main/div[7]/div/div/div[3]/section/div/div/div[2]/div/div/div/div[3]/div[2]/div/div[1]")
    public WebElement playVeep;

    @FindBy (xpath = "/html/body/main/div[7]/div/div/div[1]/div[2]/div[1]/section/div/div/div/div[7]/div/a/img")
    public WebElement hereAndNow;

    @FindBy (xpath = "/html/body/main/div[7]/div/div/div[3]/section/div/div/div[2]/div/div/div/div[3]/div[2]/div/div[1]")
    public WebElement playHereAndNow;

    @FindBy (xpath = "/html/body/main/div[7]/div/div/div[1]/div[2]/div[1]/section/div/div/div/div[8]/div/a/img")
    public WebElement theNightOf;

    @FindBy (xpath = "/html/body/main/div[7]/div/div/div[3]/section/div/div/div[2]/div/div/div/div[3]/div[2]/div/div[1]")
    public WebElement playTheNightOf;

    @FindBy (xpath = "/html/body/main/div[7]/div/div/div[1]/div[2]/div[1]/section/div/div/div/div[9]/div/a/img")
    public WebElement room104;

    @FindBy (xpath = "/html/body/main/div[7]/div/div/div[3]/section/div/div/div[2]/div/div/div/div[3]/div[2]/div/div[1]")
    public WebElement playRoom104;

    public WebElement getFreeEpisodes() {
        freeEpisodes.click();
        return freeEpisodes;
    }

    public WebElement getWatchSopranos() {
        return sopranos;
    }

    public WebElement getPlaySopranos() {
        return playSopranos;
    }

    public WebElement getTheIceBox() {
        return theIceBox;
    }

    public WebElement getPlayIceBox() {
        return playIceBox;
    }

    public WebElement getWestWorld() {
        return westWorld;
    }

    public WebElement getPlayWestWorld() {
        return playWestWorld;
    }

    public WebElement getBarry() {
        return barry;
    }

    public WebElement getPlayBarry() {
        return playBarry;
    }

    public WebElement getSally4Ever() {
        return sally4Ever;
    }

    public WebElement getPlaySally4Ever() {
        return playSally4Ever;
    }

    public WebElement getPodSaveAmerica() {
        return podSaveAmerica;
    }

    public WebElement getPlayPodSaveAmerica() {
        return playPodSaveAmerica;
    }

    public WebElement getSharpObjects() {
        return sharpObjects;
    }

    public WebElement getPlaySharpObjects() {
        return playSharpObjects;
    }

    public WebElement getAnimals() {
        return animals;
    }

    public WebElement getPlayAnimals() {
        return playAnimals;
    }

    public WebElement getSrAvila() {
        return srAvila;
    }

    public WebElement getPlaySrAvila() {
        return playSrAvila;
    }

    public WebElement getVeep() {
        return veep;
    }

    public WebElement getPlayVeep() {
        return playVeep;
    }

    public WebElement getHereAndNow() {
        return hereAndNow;
    }

    public WebElement getPlayHereAndNow() {
        return playHereAndNow;
    }

    public WebElement getTheNightOf() {
        return theNightOf;
    }

    public WebElement getPlayTheNightOf() {
        return playTheNightOf;
    }

    public WebElement getRoom104() {
        return room104;
    }

    public WebElement getPlayRoom104() {
        return playRoom104;
    }
}
