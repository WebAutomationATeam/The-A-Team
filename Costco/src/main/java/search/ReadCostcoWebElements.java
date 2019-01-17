package search;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import searchDB.XlsxDataReader;

import java.util.ArrayList;
import java.util.List;

public class ReadCostcoWebElements extends CommonAPI {

        @FindBy(how = How.XPATH, xpath = "//*[@id=\"footer-list\"]/div/div[1]/ul/li[1]/a")
        WebElement Aboutus;

        @FindBy(xpath = "///*[@id=\"footer-list\"]/div/div[1]/ul/li[3]/a")
        WebElement CharitableContributions;

        @FindBy(xpath = "//*[@id=\"footer-list\"]/div/div[1]/ul/li[4]/a")
        WebElement CompanyInformation;

        @FindBy(xpath = "//*[@id=\"footer-list\"]/div/div[1]/ul/li[5]/a")
        WebElement SustainabilityCommitment;

        @FindBy(xpath = "//*[@id=\"footer-list\"]/div/div[1]/ul/li[6]/a")
        WebElement InvestorRelations;

        @FindBy(xpath = "//*[@id=\"footer-list\"]/div/div[1]/ul/li[7]/a")
        WebElement Jobs;

        @FindBy(how = How.XPATH, xpath = "//*[@id=\"footer-list\"]/div/div[1]/ul/li[8]/a]")
        WebElement KriklandSignature;

        @FindBy(xpath = "//*[@id=\"footer-list\"]/div/div[1]/ul/li[9]/a")
        WebElement LogoAndMediaRequests;

        @FindBy(xpath = "//*[@id=\"footer-list\"]/div/div[1]/ul/li[10]/a")
        WebElement ProductVideos;

        @FindBy(xpath = "//*[@id=\"footer-list\"]/div/div[1]/ul/li[11]/a")
        WebElement TheCostcoConnection;

        @FindBy(xpath = "//*[@id=\"footer-list\"]/div/div[1]/ul/li[12]/a")
        WebElement QuickAndEasyRecepeVideos;

        @FindBy(xpath = "//*[@id=\"footer-list\"]/div/div[1]/ul/li[13]/a")
        WebElement EmployeeSite;

        @FindBy(xpath = "//*[@id=\"footer-list\"]/div/div[2]/ul[1]/li[1]/a")
        WebElement Membership;

        @FindBy(xpath = "//*[@id=\"footer-list\"]/div/div[2]/ul[1]/li[2]/a")
        WebElement JoinNow;

        @FindBy(xpath = "//*[@id=\"footer-list\"]/div/div[2]/ul[1]/li[3]/a")
        WebElement MemberPrivileges;

        @FindBy(xpath = "//*[@id=\"footer-list\"]/div/div[2]/ul[1]/li[4]/a")
        WebElement ExecutiveMembershipTerms;

        @FindBy(xpath = "//*[@id=\"footer-list\"]/div/div[2]/ul[1]/li[5]/a")
        WebElement SignInOrRegister;

        @FindBy(xpath = "//*[@id=\"footer-list\"]/div/div[2]/ul[1]/li[6]/a")
        WebElement CreditCard;

        public List webElementList(){
            List<WebElement> webElements = new ArrayList<>();
            webElements.add(Aboutus);
            webElements.add(CharitableContributions);
            webElements.add(CompanyInformation);
            webElements.add(SustainabilityCommitment);
            webElements.add(InvestorRelations);
            webElements.add(Jobs);
            webElements.add(KriklandSignature);
            webElements.add(LogoAndMediaRequests);
            webElements.add(ProductVideos);
            webElements.add(TheCostcoConnection);
            webElements.add(QuickAndEasyRecepeVideos);
            webElements.add(EmployeeSite);

            List<String> list = new ArrayList<>();
            for (int i = 0; i<webElements.size();i++){
                list.add(webElements.get(i).getText());
            }
            System.out.println(list);
            return list;
        }
        public List webElementList1(){
            List<WebElement> webElements1 = new ArrayList<>();
            webElements1.add(Membership);
            webElements1.add(JoinNow);
            webElements1.add(MemberPrivileges);
            webElements1.add (ExecutiveMembershipTerms);
            webElements1.add(SignInOrRegister);
            webElements1.add(CreditCard);


            List<String> list = new ArrayList<>();
            for (int i = 0; i<webElements1.size();i++){
                list.add(webElements1.get(i).getText());
            }
            System.out.println(list);
            return list;
        }
        //Readxls readxls = PageFactory.initElements(driver,Readxls.class);
        XlsxDataReader xlData = new XlsxDataReader("/Users/animesh/Desktop/The-A-Team/Costco/CostcoHomePage.xlsx");

        public List expectedWebElement(){
            int rowcount = xlData.getRowCount("About us");
            List<String> expect = new ArrayList<>();
            for(int i = 1; i <= rowcount; i++){
                expect.add(xlData.getCellData("About","About",i));
            }
            System.out.println(expect);
            return expect;
        }

        XlsxDataReader xlData1 = new XlsxDataReader("/Users/animesh/Desktop/The-A-Team/Costco/CostcoHomePage.xlsx");
        public List expectedWebElement1(){
            int rowcount = xlData1.getRowCount("Membership");
            List<String> expect = new ArrayList<>();
            for(int i = 1; i <= rowcount; i++){
                expect.add(xlData1.getCellData("Membership","Membership",i));
            }
            System.out.println(expect);
            return expect;
        }
    }

