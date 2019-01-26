package dataBaseOperation;
import base.CommonAPI;
import database.ConnectToSqlDB;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.ArrayList;
import java.util.List;

public class DataBaseOperations extends ConnectToSqlDB {
    public static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

    public static void insertDataIntoDB() {
        List<String> list = getHeaderValue();
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        connectToSqlDB.insertStringDataFromArrayListToSqlTable( list,"itemlist", "items");
    }
    public static List<String> getHeaderValue() {
        List<String> itemlist = new ArrayList<>();
        itemlist.add("Credit Cards");
        itemlist.add("Banking");
        itemlist.add("Lending");
        itemlist.add("Investing");
        itemlist.add("Citigold");
        return itemlist;
    }

    public List<String> getUserDatafromDB() throws Exception {
        List<String> list = new ArrayList<>();
        list = connectToSqlDB.readDataBase("itemlist", "items");
        System.out.println(list);
        return list;
    }

    @FindBy(xpath = "//*[@id=\"creditCards\"]")
    WebElement creditCardOption;
    @FindBy(xpath = "//*[@id=\"banking\"]")
    WebElement bankingOption;
    @FindBy(xpath = "//*[@id=\"lending\"]")
    WebElement lendingOption;
    @FindBy(xpath = "//*[@id=\"investing\"]")
    WebElement investingOption;
    @FindBy(xpath = "//*[@id=\"citiGold\"]")
    WebElement citiGoldOption;

    public List getHeadersValue1() {
        List<WebElement> itemlist1 = new ArrayList<>();
        itemlist1.add(creditCardOption);
        itemlist1.add(bankingOption);
        itemlist1.add(lendingOption);
        itemlist1.add(investingOption);
        itemlist1.add(citiGoldOption);

        List<String> list = new ArrayList<>();
        for (int i = 0; i < itemlist1.size(); i++) {
            list.add(itemlist1.get(i).getText());
        }
        System.out.println(list);
        return list;
    }
    public static void main(String[] args) {
        insertDataIntoDB();
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        List<String> list = null;
        try {
            list = connectToSqlDB.readDataBase("itemlist", "items");
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (String st : list) {
            System.out.println(st);
        }
    }
}