package search;

import base.CommonAPI;

public class SearchPage extends CommonAPI {

    public void searchMenu() throws InterruptedException {
        typeOnElementNEnter("#search-field", "Fans");
        sleepFor(5);
        navigateBack();
        typeOnElementNEnter("#search-field", "Kids Book");
        sleepFor(5);
        navigateBack();
        typeOnElementNEnter("#search-field", "Binders");
        sleepFor(5);
        navigateBack();
        typeOnElementNEnter("#search-field", "Baby Food");
        sleepFor(5);
        navigateBack();
        typeOnElementNEnter("#search-field", "Seafood");
        sleepFor(5);
        navigateBack();
        typeOnElementNEnter("#search-field", "Basketball");
        sleepFor(5);
        navigateBack();
        typeOnElementNEnter("#search-field", "Optical");
        sleepFor(5);
        navigateBack();
    }
}














//            switch (sActions) {
//            case "input_Username":
//                input_Username();
//                break;
//            case "input_Password":
//                input_Password();
//                break;
//            case "click_Login":
//                click_Login();
//                break;
//            default:
//                throw new InvalidArgumentException("Invalid login");
//        }
//        System.out.println(sActions);
//    }
