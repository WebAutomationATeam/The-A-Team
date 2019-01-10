package search;

import base.CommonAPI;

public class SearchPage extends CommonAPI {

    public void searchMenu(){
        typeOnElementNEnter("#search-field", "Cookies");
        navigateBack();
        typeOnElementNEnter("#search-field", "Samsung");
        navigateBack();
        typeOnElementNEnter("#search-field", "Vegetable");
        navigateBack();
    }
}
