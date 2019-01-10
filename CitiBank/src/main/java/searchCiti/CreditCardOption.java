package searchCiti;
import base.CommonAPI;

public class CreditCardOption extends CommonAPI {
    public void creditCardOpt(){
        clickElement("#creditCards");
        navigateBack();
    }
}
