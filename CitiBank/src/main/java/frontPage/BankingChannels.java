package frontPage;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BankingChannels extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"creditCards\"]")
    WebElement creditCards;
    @FindBy(xpath = "//*[@id=\"banking\"]")
    WebElement banking;
    @FindBy(xpath = "//*[@id=\"lending\"]")
    WebElement lending;
    @FindBy(xpath = "//*[@id=\"investing\"]")
    WebElement investing;
    @FindBy(xpath = "//*[@id=\"citiGold\"]")
    WebElement citiGold;
    @FindBy(xpath = "//*[@id=\"relevant-alert-span\"]")
    WebElement help;

    public void credidCardsOption(){creditCards.click();}
    public void bankingOption(){banking.click();}
    public void lendingOtion(){lending.click();}
    public void investingOption(){investing.click();}
    public void citiGoldOption(){citiGold.click();}
    public void helpOption(){help.click();}
}
