package searchDB;

import database.ConnectToSqlDB;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class DBOperation extends ConnectToSqlDB {
    public static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

    public static void insertDataIntoDB() {
        List<String> list = getHeaderValue();
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        //connectToSqlDB.insertStringDataFromArrayListToMySql(list, "headerList","headers");
        //connectToSqlDB.insertDataFromArrayListToSqlTableforString(list,"headerList","headers");
        connectToSqlDB.insertStringDataFromArrayListToMySql(list,"headerList","headers");
    }
    public static List<String> getHeaderValue() {
        List<String> headerList = new ArrayList<>();
        headerList.add("SITE MAP");
        headerList.add("TERMS AND CONDITIONS");
        headerList.add("YOUR PRIVATE RIGHTS");
        headerList.add("FEEDBACK");
        return headerList;
    }
    public List<String> getUserDatafromDB() throws Exception {
        List<String> list = new ArrayList<>();
        list = connectToSqlDB.readDataBase("headerList", "headers");
        System.out.println(list);
        return list;
    }
    @FindBy(xpath = "//a[contains(text(),'Site Map')]")
    WebElement SITE_MAP;
    @FindBy(xpath = "//a[contains(text(),'Terms and Conditions')]")
    WebElement TERMS_AND_CONDITIONS;
    @FindBy(xpath = "//a[contains(text(),'Your Privacy Rights')]")
    WebElement YOUR_PRIVATE_RIGHTS;
    @FindBy(xpath = "//a[contains(text(),'Feedback')]")
    WebElement FEEDBACK;

    public List getHeadersValue1() {
        List<WebElement> headerList1 = new ArrayList<>();
        headerList1.add(SITE_MAP);
        headerList1.add(TERMS_AND_CONDITIONS);
        headerList1.add(YOUR_PRIVATE_RIGHTS);
        headerList1.add(FEEDBACK);

        List<String> list = new ArrayList<>();
        for (int i = 0; i<headerList1.size();i++){
            list.add(headerList1.get(i).getText());
        }
        System.out.println(list);
        return list;
    }
    public static void main(String[] args) throws Exception {
        insertDataIntoDB();
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        List<String> list = connectToSqlDB.readDataBase("headerList", "headers");
        for (String st : list) {
            System.out.println(st);
        }
    }
}
