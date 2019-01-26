import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import searchCiti.CreditCardOption;

public class TestCreditCardOpt extends CreditCardOption {
    CreditCardOption CardOpt;
    @BeforeMethod
    public void init() {CardOpt = PageFactory.initElements(driver, CreditCardOption.class);
    }
    @Test
    public void test_creditCardsOpt(){CardOpt.creditCardsOpt();}
    @Test
    public void test_searchCitiOpt(){CardOpt.searchCitiOpt();}
    @Test
    public void test_bankingOpt(){CardOpt.bankingOpt();}
    @Test
    public void test_creditcardsOpt(){CardOpt.creditcardsOpt();}
    @Test
    public void test_lendingOpt(){CardOpt.lendingOpt();}
    @Test
    public void test_investingOpt(){CardOpt.investingOpt();}
    @Test
    public void test_businessOpt(){CardOpt.businessOpt();}
    @Test
    public void test_rewardsNOffersOpt(){CardOpt.rewardsNOffersOpt();}
    @Test
    public void test_servicesOpt(){CardOpt.servicesOpt();}
    @Test
    public void test_citiGoldOpt(){CardOpt.citiGoldOpt();}
    @Test
    public void test_helpToHelpOpt(){CardOpt.helpToHelpOpt();}
    @Test
    public void test_viewAllCreditCardsOpt(){CardOpt.viewAllCreditCardsOpt();}
    @Test
    public void test_selectCardCategoryOpt(){CardOpt.selectCardCategoryOpt();}
    @Test
    public void test_searchCardsOpt(){CardOpt.searchCardsOpt();}
    @Test
    public void test_compareCardsOpt(){CardOpt.compareCardsOpt();}
//    @Test
//    public void test_learnMoreOpt() throws Exception {CardOpt.learnMoreOpt();}
//    @Test
//    public void test_citiSimplicityCardOpt()throws Exception {CardOpt.citiSimplicityCardOpt();}
    @Test
    public void test_preQualifyOpt(){CardOpt.preQualifyOpt();}
    @Test
    public void test_creditCardOfferByMailOpt(){CardOpt.creditCardOfferByMailOpt();}
    @Test
    public void test_creditCardApplicationStatusOpt(){CardOpt.creditCardApplicationStatusOpt();}
//    @Test
//    public void test_prevSlidingArrowOpt(){CardOpt.prevSlidingArrowOpt();}
//    @Test
//    public void test_nextSlidingArrowOpt(){CardOpt.nextSlidingArrowOpt();}
}
