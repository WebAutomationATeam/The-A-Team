package testFrontPage;

import frontPage.BankingChannels;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBankingChannels extends BankingChannels {

    BankingChannels bankingChannels;
    @BeforeMethod
    public void initial(){
        bankingChannels = PageFactory.initElements(driver, BankingChannels.class);
    }
    @Test
    public void test_credidCardsOption(){bankingChannels.credidCardsOption();}
    @Test
    public void test_bankingOption(){bankingChannels.bankingOption();}
    @Test
    public void test_lendingOption(){bankingChannels.lendingOtion();}
    @Test
    public void test_investingOption(){bankingChannels.investingOption();}
    @Test
    public void test_citiGoldOption(){bankingChannels.citiGoldOption();}
    @Test
    public void test_helpOption(){bankingChannels.helpOption();}
}
