package frontPage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopHeader extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"navUtility\"]/div/div/ul/li[1]/a")
    public static  WebElement atmBranch;
    @FindBy(xpath = "//*[@id=\"navUtility\"]/div/div/ul/li[2]/a")
    public static WebElement openNAccount;
    @FindBy(xpath = "//*[@id=\"navUtility\"]/div/div/ul/li[3]/a")
    public static WebElement languageChange;
    @FindBy(xpath = "//*[@id=\"headerLoka ogoLink\"]/div")
    public static WebElement leftHeaderLogo;
    @FindBy(xpath = "//*[@id=\"searchicon\"]")
    public static WebElement frontSearchTab;

    public void atmBranchOption(){atmBranch.click();}
    public void openNAccountOption(){openNAccount.click();}
    public void languageChangeOption(){languageChange.click();}
    public void leftHeaderLogoOption(){leftHeaderLogo.click();}
    public void frontSearchOption(){frontSearchTab.click();}
}