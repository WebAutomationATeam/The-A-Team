package testFrontPage;

import frontPage.Footer;
import frontPage.TopHeader;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestFooter extends Footer{
    Footer footer ;
    @BeforeMethod
    public void initial(){ footer = PageFactory.initElements(driver, Footer.class);}
    @Test
    public void test_ourStoryOption(){footer.ourStoryOption();}
    @Test
    public void test_careersOption(){footer.careersOption();}
    @Test
    public void test_benifitNServicesOption(){footer.benifitNServicesOption();}
    @Test
    public void test_rewardsOption(){footer.rewardsOption();}
    @Test
    public void test_citiEasyDealsOption(){footer.citiEasyDealsOption();}
    @Test
    public void test_citiPrivatePassOption(){footer.citiPrivatePassOption();}
    @Test
    public void test_socialOffersOption(){footer.socialOffersOption();}
    @Test
    public void test_citiPriorityOption(){footer.citiPriorityOption();}
    @Test
    public void test_citiGoldFooterOption(){footer.citiGoldFooterOption();}
    @Test
    public void test_citiPrivateBankOption(){footer.citiPrivateBankOption();}
    @Test
    public void test_smallBusinessAccountsOption(){footer.smallBusinessAccountsOption();}
    @Test
    public void test_commercialAccountsOption(){footer.commercialAccountsOption();}
    @Test
    public void test_personalBankingOption(){footer.personalBankingOption();}
    @Test
    public void test_creditCardsFooterOption(){footer.creditCardsFooterOption();}
    @Test
    public void test_mortgageOption(){footer.mortgageOption();}
    @Test
    public void test_homeEquityOption(){footer.homeEquityOption();}
    @Test
    public void test_lendingFooterOption(){footer.lendingFooterOption();}
    @Test
    public void test_contactUsOption(){footer.contactUsOption();}
    @Test
    public void test_helpNFAQOption(){footer.helpNFAQOption();}
    @Test
    public void test_securityCenterOption(){footer.securityCenterOption();}
    @Test
    public void test_termsNConditionOption(){footer.termsNConditionOption();}
    @Test
    public void test_privacyOption(){footer.privacyOption();}
    @Test
    public void test_accessibilityOption(){footer.accessibilityOption();}
    @Test
    public void test_countryNJurisdictionsOption(){footer.countryNJurisdictionsOption();}
    @Test
    public void test_feedbackOption(){footer.feedbackOption();}
}
