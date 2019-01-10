package searchCiti;
import base.CommonAPI;

public class MainSearchOption extends CommonAPI {
    public void mainSearchOpt(){
        clickElement("//*[@id=\"headerLoka ogoLink\"]/div");
        clickElement("#personetics-citi-menu");
        typeOnElementNEnter("citi-autocomplete-content-searchbox-livesearch", "My Transactions");
        clickElement("//*[@id=\"citi-full-search-content\"]/div[1]/button[2]");
        clickElement("#SummaryRecentTransactions-label");
        //clickElement("#cmlink_AccountDetailsSPF");
        clickElement("#SummaryRecentTransactions-label");
        clickElement("#DownloadAcountActivity-label");
        //clickElement("cmlink_AccountHomepageMRC");
        clickElement("#DownloadAcountActivity-label");
        clickElement("#DownloadingAccountActivityMicrosoftMoney-label");
        //clickElement("#cmlink_AccountDetailsSPF");
        clickElement("#DownloadingAccountActivityMicrosoftMoney-label");
    }
}

//*[@id="headerLoka ogoLink"]/div(xPath for Logo)
//"id=headerLoka ogoLink" (Locator for Logo)
//id="personetics-citi-menu" (Locator for Search button)
//id="citi-autocomplete-content-searchbox-livesearch" (Locator for writing space)
//*[@id="citi-full-search-content"]/div[1]/button[2]"(Locator for Search button in side search option)
//id="SummaryRecentTransactions-label"(Locator for Where i can find trasaction)
//id="cmlink_AccountDetailsSPF" (Locator for Account details)
//id="DownloadAcountActivity-label"(locator for How do i Download Statement )
//id="cmlink_AccountHomepageMRC"
//id="DownloadingAccountActivityMicrosoftMoney-label"
//*[@id="cmlink_AccountDetailsSPF"]