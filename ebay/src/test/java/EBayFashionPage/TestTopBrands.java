package EBayFashionPage;

import EBayFashion.TopBrands;
import Util.TestLogger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class TestTopBrands extends TopBrands {
    TopBrands topBrands;
    @BeforeMethod
    public void initElement() {
        topBrands = PageFactory.initElements(driver, TopBrands.class);
    }
    //User should be able to click on Adidas
    @Test
    public void testViewAdidas() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        topBrands.ClickViewAdidas();
        driver.navigate().back();
    }
    //User should be able to click on Air Jordan
    @Test
    public void testViewAirJordan() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        topBrands.ClickViewAirJordan();
    }
    //User should be able to click on Anthropologie
    @Test
    public void testViewAnthropologie() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        topBrands.ClickViewAnthropologie();
    }
    //User should be able to click on Calvin Klein
    @Test
    public void testViewCalvinKlein() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        topBrands.ClickViewCalvinKlein();
    }
    //User should be able to click on Chanel
    @Test
    public void testViewChanel() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        topBrands.ClickViewChanel();
    }
    //User should be able to click on Coach
    @Test
    public void testViewCoach() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        topBrands.ClickViewCoach();
    }
    //User should be able to click on David Yurman
    @Test
    public void testViewDavidYurman() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        topBrands.ClickViewDavidYurman();
    }
    //User should be able to click on Free People
    @Test
    public void testViewFreePeople() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        topBrands.ClickViewFreePeople();
        driver.navigate().back();
    }
    //User should be able to click on Gucci
    @Test
    public void testViewGucci() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        topBrands.ClickViewGucci();
    }
    //User should be able to click on Invicta
    @Test
    public void testViewInvicta() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        topBrands.ClickViewInvicta();
        driver.navigate().back();
    }
    //User should be able to click on JCrew
    @Test
    public void testViewJCrew() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        topBrands.ClickViewJCrew();
        driver.navigate().back();
    }
    //User should be able to click on Lewis
    @Test
    public void testViewLevis() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        topBrands.ClickViewLevis();
        driver.navigate().back();
    }
    //User should be able to click on Louis Vuitton
    @Test
    public void testViewLouisVuitton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        topBrands.ClickViewLouisVuitton();
    }
    //User should be able to click on LuluMelon
    @Test
    public void testViewLuluMelon() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        topBrands.ClickViewLuluMelon();
        driver.navigate().back();
    }
    //User should be able to click on MadeWell
    @Test
    public void testViewMadeWell() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        topBrands.ClickViewMadeWell();
        driver.navigate().back();
        driver.close();
    }
    //User should be able to click on MichaelKors
    @Test
    public void testViewMichaelKors() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        topBrands.ClickViewMichaelKors();
    }
    //User should be able to click on Nike
    @Test
    public void testViewNike() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        topBrands.ClickViewNike();
    }
    //User should be able to click on Omega
    @Test
    public void testViewOmega() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        topBrands.ClickViewOmega();
        driver.navigate().back();
        driver.close();
    }
    //User should be able to click on Ralph Lauren
    @Test
    public void testViewRalphLauren() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        topBrands.ClickViewRalphLauren();
    }
    //User should be able to click on RayBan
    @Test
    public void testViewRayBan() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        topBrands.ClickViewRayBan();
    }
    //User should be able to click on Supreme
    @Test
    public void testViewSupreme() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        topBrands.ClickViewSupreme();
    }
    //User should be able to click on Rolex
    @Test
    public void testViewRolex() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        topBrands.ClickViewRolex();
    }
    //User should be able to click on Tory Burch
    @Test
    public void testViewToryBurch() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        topBrands.ClickViewToryBurch();
    }
    //User should be able to click on Under Armor
    @Test
    public void testViewUnderArmour() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        topBrands.ClickViewUnderArmour();
    }
    //User should be able to click on Victoria Secret
    @Test
    public void testViewVictoriaSecret() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        topBrands.ClickViewVictoriaSecret();
    }
    //User should be able to click on Zara
    @Test
    public void testViewZara() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        topBrands.ClickViewZara();
        driver.navigate().back();
    }
}
