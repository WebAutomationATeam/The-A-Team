package search;

import base.CommonAPI;

public class SearchLogin extends CommonAPI {

    public void costcoLogin(){

        clickElement("//*[@id=\"header_sign_in\"]");
        typeOnElementNEnter("//*[@id=\"logonId\"]","partha_uk@hotmail.com");
        typeOnElementNEnter("//*[@id=\"logonPassword\"]","Sneha$3116");
        clickElement("//*[@id=\"LogonForm\"]/fieldset/div[5]/input");
        typeOnElementNEnter("#search-field", "Cookies" );
        clickElement("//*[@id=\"myaccount-d\"]");
        clickElement("//*[@id=\"myaccount-t\"]/span");

    }
}
