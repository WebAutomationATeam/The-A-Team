package dataReader;
import base.CommonAPI;
import database.XlsxDataReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class ReadCitiBankWebElements extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"navUtility\"]/div/div/ul/li[1]/a")
    WebElement atmBranch;
    @FindBy(xpath = "//*[@id=\"navUtility\"]/div/div/ul/li[2]/a")
    WebElement openNAccount;
    @FindBy(xpath = "//*[@id=\"navUtility\"]/div/div/ul/li[3]/a")
    WebElement languageChange;
    @FindBy(xpath = "//*[@id=\"headerLoka ogoLink\"]/div")
    WebElement leftHeaderLogo;
    @FindBy(xpath = "//*[@id=\"creditCards\"]")
    WebElement creditCards;
    @FindBy(xpath = "//*[@id=\"banking\"]")
    WebElement banking;
    @FindBy(xpath = "//*[@id=\"lending\"]")
    WebElement lending;
    @FindBy(xpath = "//*[@id=\"investing\"]")
    WebElement investing;
    @FindBy(xpath = "//*[@id=\"citiGold\"]")
    WebElement citiGold;

    public List webElementList(){
        List<WebElement> webElements = new ArrayList<>();
        webElements.add(atmBranch);
        webElements.add(openNAccount);
        webElements.add(languageChange);
        webElements.add(leftHeaderLogo);

        List<String> list = new ArrayList<>();
        for (int i = 0; i<webElements.size();i++){
            list.add(webElements.get(i).getText());
        }
        System.out.println(list);
        return list;
    }
    public List webElementList1(){
        List<WebElement> webElements1 = new ArrayList<>();
        webElements1.add(creditCards);
        webElements1.add(banking);
        webElements1.add(lending);
        webElements1.add (investing);
        webElements1.add(citiGold);

        List<String> list = new ArrayList<>();
        for (int i = 0; i<webElements1.size();i++){
            list.add(webElements1.get(i).getText());
        }
        System.out.println(list);
        return list;
    }
    XlsxDataReader xlData = new XlsxDataReader("/Users/apple/IdeaProjects/The-A-Team/CitiBank/dataCollection/CitiXlsheet.xlsx");
    public List expectedWebElement(){
        int rowcount = xlData.getRowCount("Header");
        List<String> expect = new ArrayList<>();
        for(int i = 1; i <= rowcount; i++){
            expect.add(xlData.getCellData("Header","ATM / Branch",i));
        }
        System.out.println(expect);
        return expect;
    }
    XlsxDataReader xlData1 = new XlsxDataReader("/Users/apple/IdeaProjects/The-A-Team/CitiBank/dataCollection/CitiXlsheet.xlsx");
    public List expectedWebElement1(){
        int rowcount = xlData1.getRowCount("Operations");
        List<String> expect = new ArrayList<>();
        for(int i = 1; i <= rowcount; i++){
            expect.add(xlData1.getCellData("Operations","Credit Cards",i));
        }
        System.out.println(expect);
        return expect;
    }
}