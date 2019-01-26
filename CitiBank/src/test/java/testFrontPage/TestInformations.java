package testFrontPage;

import frontPage.Informations;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestInformations extends Informations {
    Informations informations;
    @BeforeMethod
    public void initial(){
        informations = PageFactory.initElements(driver, Informations.class);}
    @Test
    public void test_lowRateOption(){informations.lowRateOption();}
    @Test
    public void test_newCitiRewardsOption(){informations.newCitiRewardsOption();}
    @Test
    public void test_advantageOfCardsOption(){informations.advantageOfCardsOption();}
    @Test
    public void test_learnLowRateOption(){informations.learnLowRateOption();}
    @Test
    public void test_learnNewCitiRewardsOption(){informations.learnNewCitiRewardsOption();}
    @Test
    public void test_learnAdvantageOfCardsOption(){informations.learnAdvantageOfCardsOption();}
    @Test
    public void test_experienceMoreOption(){informations.experienceMoreOption();}
    @Test
    public void test_learnExperienceMoreOption(){informations.learnExperienceMoreOption();}
    @Test
    public void test_financialCheckUpOption(){informations.financialCheckUpOption();}
    @Test
    public void test_learnFinancialCheckUpOption(){informations.learnFinancialCheckUpOption();}
    @Test
    public void test_familyCyberSaftyOption(){informations.familyCyberSaftyOption();}
    @Test
    public void test_learnFamilyCyberSaftyOption(){informations.learnFamilyCyberSaftyOption();}
}
