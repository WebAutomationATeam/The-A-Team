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

    @FindBy (css = "body > main > div.carouselband.basecomponent > div > div > div.components\\2f Modal--modalWrapper > section > div > div > div.modules\\2f VideoPlayerOverlay--modalPlayer > div > div > div > div.__player-placeholder-container.__player-placeholder-container--fadein > div.__player-placeholder-box > div > div.__player-placeholder-play-button")
    public WebElement playSopranos;

    @FindBy (xpath = "/html/body/main/div[4]/div/div/div[1]/div[2]/div[2]/div/div[1]/div/a/img")
    public WebElement theIceBox;

    @FindBy (xpath = "/html/body/main/div[4]/div/div/div[3]/section/div/div/div[2]/div/div/div/div[3]/div[2]/div/div[1]")
    public WebElement playIceBox;

    @FindBy (xpath = "/html/body/main/div[4]/div/div/div[3]/section/div/div/div[2]/div/div/div/div[5]/div/div/div/form/input")
    public WebElement inputEmail;

    @FindBy (xpath = "/html/body/main/div[4]/div/div/div[3]/section/div/div/div[2]/div/div/div/div[5]/div/div/div/form/div[1]/button")
    public WebElement pressPlay;

    @FindBy (xpath = "/html/body/main/div[4]/div/div/div[1]/div[2]/div[1]/section/div/div/div/div[2]/div/a/img")
    public WebElement westWorld;

    @FindBy (css = "body > main > div.carouselband.basecomponent > div > div > div.components\\2f Modal--modalWrapper > section > div > div > div.modules\\2f VideoPlayerOverlay--modalPlayer > div > div > div > div.__player-placeholder-container.__player-placeholder-container--fadein > div.__player-placeholder-box > div > div.__player-placeholder-play-button")
    public WebElement playWestWorld;

    @FindBy (xpath = "/html/body/main/div[4]/div/div/div[1]/div[2]/div[2]/div/div[3]/div/a/img")
    public WebElement barry;

    @FindBy (css = "body > main > div.carouselband.basecomponent > div > div > div.components\\2f Modal--modalWrapper > section > div > div > div.modules\\2f VideoPlayerOverlay--modalPlayer > div > div > div > div.__player-placeholder-container.__player-placeholder-container--fadein > div.__player-placeholder-box > div > div.__player-placeholder-play-button")
    public WebElement playBarry;

    @FindBy (xpath = "/html/body/main/div[7]/div/div/div[1]/div[2]/div[2]/section/div/div/div/div[1]/div/a/img")
    public WebElement sally4Ever;

    @FindBy (css = "body > main > div.carouselband.basecomponent > div > div > div.components\\2f Modal--modalWrapper > section > div > div > div.modules\\2f VideoPlayerOverlay--modalPlayer > div > div > div > div.__player-placeholder-container.__player-placeholder-container--fadein > div.__player-placeholder-box > div > div.__player-placeholder-play-button")
    public WebElement playSally4Ever;

    @FindBy (xpath = "/html/body/main/div[7]/div/div/div[1]/div[2]/div[1]/section/div/div/div/div[2]/div/a/img")
    public WebElement podSaveAmerica;

    @FindBy (css = "body > main > div.carouselband.basecomponent > div > div > div.components\\2f Modal--modalWrapper > section > div > div > div.modules\\2f VideoPlayerOverlay--modalPlayer > div > div > div > div.__player-placeholder-container.__player-placeholder-container--fadein > div.__player-placeholder-box > div > div.__player-placeholder-play-button")
    public WebElement playPodSaveAmerica;

    @FindBy (xpath = "/html/body/main/div[7]/div/div/div[1]/div[2]/div[1]/section/div/div/div/div[3]/div/a/img")
    public WebElement sharpObjects;

    @FindBy (css = "body > main > div.carouselband.basecomponent > div > div > div.components\\2f Modal--modalWrapper > section > div > div > div.modules\\2f VideoPlayerOverlay--modalPlayer > div > div > div > div.__player-placeholder-container.__player-placeholder-container--fadein > div.__player-placeholder-box > div > div.__player-placeholder-play-button")
    public WebElement playSharpObjects;

    @FindBy (xpath = "/html/body/main/div[7]/div/div/div[1]/div[2]/div[1]/section/div/div/div/div[4]/div/a/img")
    public WebElement animals;

    @FindBy (css = "body > main > div.carouselband.basecomponent > div > div > div.components\\2f Modal--modalWrapper > section > div > div > div.modules\\2f VideoPlayerOverlay--modalPlayer > div > div > div > div.__player-placeholder-container.__player-placeholder-container--fadein > div.__player-placeholder-box > div > div.__player-placeholder-play-button")
    public WebElement playAnimals;

    @FindBy (xpath = "/html/body/main/div[7]/div/div/div[1]/div[2]/div[1]/section/div/div/div/div[5]/div/a/img")
    public WebElement srAvila;

    @FindBy (css = "body > main > div.carouselband.basecomponent > div > div > div.components\\2f Modal--modalWrapper > section > div > div > div.modules\\2f VideoPlayerOverlay--modalPlayer > div > div > div > div.__player-placeholder-container.__player-placeholder-container--fadein > div.__player-placeholder-box > div > div.__player-placeholder-play-button")
    public WebElement playSrAvila;

    @FindBy (xpath = "/html/body/main/div[7]/div/div/div[1]/div[2]/div[1]/section/div/div/div/div[6]/div/a/img")
    public WebElement veep;

    @FindBy (css="body > main > div.carouselband.basecomponent > div > div > div.components\\2f Modal--modalWrapper > section > div > div > div.modules\\2f VideoPlayerOverlay--modalPlayer > div > div > div > div.__player-placeholder-container.__player-placeholder-container--fadein > div.__player-placeholder-box > div > div.__player-placeholder-play-button")
    public WebElement playVeep;

    @FindBy (xpath = "/html/body/main/div[7]/div/div/div[1]/div[2]/div[1]/section/div/div/div/div[7]/div/a/img")
    public WebElement hereAndNow;

    @FindBy (css = "body > main > div.carouselband.basecomponent > div > div > div.components\\2f Modal--modalWrapper > section > div > div > div.modules\\2f VideoPlayerOverlay--modalPlayer > div > div > div > div.__player-placeholder-container.__player-placeholder-container--fadein > div.__player-placeholder-box > div > div.__player-placeholder-play-button")
    public WebElement playHereAndNow;

    @FindBy (xpath = "/html/body/main/div[7]/div/div/div[1]/div[2]/div[1]/section/div/div/div/div[8]/div/a/img")
    public WebElement theNightOf;

    @FindBy (css = "body > main > div.carouselband.basecomponent > div > div > div.components\\2f Modal--modalWrapper > section > div > div > div.modules\\2f VideoPlayerOverlay--modalPlayer > div > div > div > div.__player-placeholder-container.__player-placeholder-container--fadein > div.__player-placeholder-box > div > div.__player-placeholder-play-button")
    public WebElement playTheNightOf;

    @FindBy (xpath = "/html/body/main/div[7]/div/div/div[1]/div[2]/div[1]/section/div/div/div/div[9]/div/a/img")
    public WebElement room104;

    @FindBy (css = "body > main > div.carouselband.basecomponent > div > div > div.components\\2f Modal--modalWrapper > section > div > div > div.modules\\2f VideoPlayerOverlay--modalPlayer > div > div > div > div.__player-placeholder-container.__player-placeholder-container--fadein > div.__player-placeholder-box > div > div.__player-placeholder-play-button")
    public WebElement playRoom104;

    public WebElement getFreeEpisodes() {
        freeEpisodes.click();
        return freeEpisodes;
    }
    public WebElement getWatchSopranos() {
        sopranos.click();
        return sopranos;
    }
    public WebElement getPlaySopranos() {
        playSopranos.click();
        return playSopranos;
    }
    public WebElement getTheIceBox() {
        theIceBox.click();
        return theIceBox;
    }
    public WebElement getPlayIceBox() {
        playIceBox.click();
        return playIceBox;
    }
    public WebElement getInputEmail(){
        inputEmail.sendKeys("roktimrobin@gmail.com");
        return inputEmail;
    }
    public WebElement getPressPlay(){
        pressPlay.click();
        return pressPlay;
    }

    public WebElement getWestWorld() {
        westWorld.click();
        return westWorld;
    }

    public WebElement getPlayWestWorld() {

        playWestWorld.click();
        return playWestWorld;
    }

    public WebElement getBarry() {
        barry.click();
        return barry;
    }

    public WebElement getPlayBarry() {
        playBarry.click();
        return playBarry;
    }

    public WebElement getSally4Ever() {
        sally4Ever.click();
        return sally4Ever;
    }

    public WebElement getPlaySally4Ever() {
        playSally4Ever.click();
        return playSally4Ever;
    }

    public WebElement getPodSaveAmerica() {

        podSaveAmerica.click();
        return podSaveAmerica;
    }

    public WebElement getPlayPodSaveAmerica() {
        playPodSaveAmerica.click();
        return playPodSaveAmerica;
    }

    public WebElement getSharpObjects() {
        sharpObjects.click();
        return sharpObjects;
    }

    public WebElement getPlaySharpObjects() {
        playSharpObjects.click();
        return playSharpObjects;
    }

    public WebElement getAnimals() {
        getAnimals().click();
        return animals;
    }
    public WebElement getPlayAnimals() {
        playAnimals.click();
        return playAnimals;
    }

    public WebElement getSrAvila() {
        srAvila.click();
        return srAvila;
    }

    public WebElement getPlaySrAvila() {
        playSrAvila.click();
        return playSrAvila;
    }

    public WebElement getVeep() {
        veep.click();
        return veep;
    }

    public WebElement getPlayVeep() {
        playVeep.click();
        return playVeep;
    }

    public WebElement getHereAndNow() {
        hereAndNow.click();
        return hereAndNow;
    }

    public WebElement getPlayHereAndNow() {
        playHereAndNow.click();
        return playHereAndNow;
    }

    public WebElement getTheNightOf() {
        theNightOf.click();
        return theNightOf;
    }

    public WebElement getPlayTheNightOf() {
        playTheNightOf.click();
        return playTheNightOf;
    }

    public WebElement getRoom104() {
        room104.click();
        return room104;
    }

    public WebElement getPlayRoom104() {
        playRoom104.click();
        return playRoom104;
    }
}
