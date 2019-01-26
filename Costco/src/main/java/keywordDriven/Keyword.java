package keywordDriven;

import base.CommonAPI;
import org.openqa.selenium.By;

public class Keyword extends CommonAPI {
    public void input_Username() {
        driver.findElement(By.cssSelector("#login-user")).sendKeys("mercury");
    }

    public void input_Password() {
        driver.findElement(By.cssSelector("#login-password")).sendKeys("joihjhk");
    }

    public void click_Login() {
        driver.findElement(By.cssSelector("#login-submit")).click();
    }
    public void keywordWebElement() throws Exception {
        Keyword Actions = new Keyword();
        String sPath = "/Users/animesh/Desktop/The-A-Team/Costco/CostcoHomePage.xlsx";
//        XlsxDataReader.setExcelFile(sPath, "login2");
        for (int i = 1; i <= 3; i++) {
//            String sActions = XlsxDataReader.getCellData(i, 1);
//            System.out.println(sActions);
        }
    }
}





