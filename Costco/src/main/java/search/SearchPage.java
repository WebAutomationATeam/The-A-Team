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
        typeOnElementNEnter("#search-field", "Coffee");
        navigateBack();
        typeOnElementNEnter("#search-field", "iPhone");
        navigateBack();
        typeOnElementNEnter("#search-field", "Macbooks");
        navigateBack();
        typeOnElementNEnter("#search-field", "Fans");
        navigateBack();
        typeOnElementNEnter("#search-field", "Kids Book");
        navigateBack();
        typeOnElementNEnter("#search-field", "Binders");
        navigateBack();
        typeOnElementNEnter("#search-field", "Baby Food");
        navigateBack();
        typeOnElementNEnter("#search-field", "Seafood");
        navigateBack();
        typeOnElementNEnter("#search-field", "Basketball");
        navigateBack();
        typeOnElementNEnter("#search-field", "Optical");
        navigateBack();
    }
}
