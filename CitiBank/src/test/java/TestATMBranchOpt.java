import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import searchCiti.ATMorBrachOption;

public class TestATMBranchOpt extends ATMorBrachOption {
    ATMorBrachOption aTMorBrachOpt;

    @BeforeMethod
    public void init() {
        aTMorBrachOpt = PageFactory.initElements(driver, ATMorBrachOption.class);
    }

    @Test
    public void test_atmBranchOpt(){ aTMorBrachOpt.atmBranchOpt();}
    @Test
    public void test_searchATMBranchOpt(){ aTMorBrachOpt.searchATMBranchOpt();}
    @Test
    public void test_inserAddressBoxOpt(){ aTMorBrachOpt.inserAddressBoxOpt();}
    @Test
    public void test_searchAddressOpt(){ aTMorBrachOpt.searchAddressOpt(); }
    @Test
    public void test_filterOpt(){ aTMorBrachOpt.filterOpt();}
    @Test
    public void test_signOnOpt(){ aTMorBrachOpt.signOnOpt();}
    @Test
    public void test_locateMeOpt(){ aTMorBrachOpt.locateMeOpt();}
    @Test
    public void test_viewDetailsOpt(){ aTMorBrachOpt.viewDetailsOpt();}
    @Test
    public void test_getDirectionsOpt(){ aTMorBrachOpt.getDirectionsOpt();}
    @Test
    public void test_atmsOpt(){ aTMorBrachOpt.atmsOpt();}
    @Test
    public void test_branchOpt(){ aTMorBrachOpt.branchOpt();}
    @Test
    public void test_relationshipManagerOpt(){ aTMorBrachOpt.relationshipManagerOpt();}
    @Test
    public void test_homelendingOpt(){ aTMorBrachOpt.homelendingOpt();}
    @Test
    public void test_internationalBankingOpt(){ aTMorBrachOpt.internationalBankingOpt();}
    @Test
    public void test_financialAdvisorOpt(){ aTMorBrachOpt.financialAdvisorOpt();}
    @Test
    public void test_fullServiceOpt(){ aTMorBrachOpt.fullServiceOpt();}
    @Test
    public void test_checkDepositeATMOpt() { aTMorBrachOpt.checkDepositeATMOpt();}
    @Test
    public void test_driveUpOpt(){ aTMorBrachOpt.driveUpOpt();}
    @Test
    public void test_applyOpt(){ aTMorBrachOpt.applyOpt();}
}