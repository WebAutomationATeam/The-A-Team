package EBayMotorsPage;

import EBayMotors.EBayMotors;
import Util.TestLogger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class TestEBayMotors extends EBayMotors {
    EBayMotors motors;
    @BeforeMethod
    public void initElement() {
        motors = PageFactory.initElements(driver, EBayMotors.class);
    }
    //User should be able to click on find parts
    @Test
    public void testViewFindParts() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        motors.checkViewFindParts();
    }
    //User should be able to click on all parts
    @Test
    public void testViewAllParts() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        motors.checkViewAllParts();
    }
    //User should be able to click on  car, truck and parts
    @Test
    public void testViewCarTruckParts() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        motors.checkViewCarTruckParts();
    }
    //User should be able to click on wheel parts
    @Test
    public void testViewWheelParts() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        motors.checkViewWheelParts();
    }
    //User should be able to click on motorcycle parts
    @Test
    public void testViewMotorCycleParts() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        motors.checkViewMotorCycleParts();
    }
    //User should be able to click on ATV and UTV parts
    @Test
    public void testViewAtvUtvParts() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        motors.checkViewAtvUtvParts();
    }
    //User should be able to click on Commercial Truck Parts
    @Test
    public void testViewCommercialTruckParts() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        motors.checkViewCommercialTruckParts();
    }
    //User should be able to click on automotive tool display
    @Test
    public void testViewAutoMativeToolSupply() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        motors.checkViewAutoMativeToolSupply();
    }
    //User should be able to click on car and truck
    @Test
    public void testViewCarTruck() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        motors.checkViewCarTruck();
    }
    //User should be able to click on motorcycle
    @Test
    public void testViewMotorCycle() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        motors.checkViewMotorCycle();
    }
    //User should be able to click on classics
    @Test
    public void testViewClassic() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        motors.checkViewClassic();
    }
    //User should be able to click on collector cars
    @Test
    public void testViewCollectorCar() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        motors.checkViewCollectorCar();
    }
    //User should be able to click on hybrid cars
    @Test
    public void ViewElectricHybrid() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        motors.checkViewElectricHybrid();
    }
    //User should be able to click on electric hybrid
    @Test
    public void testViewExotic() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        motors.checkViewExotic();
    }
    //User should be able to click on power sports
    @Test
    public void testViewPowerSport() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        motors.checkViewPowerSport();
    }
    //User should be able to click on view other option
    @Test
    public void testViewOther() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        motors.checkViewOther();
    }
    //User should be able to click on boat
    @Test
    public void testViewBoat() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        motors.checkViewBoat();
    }
    //User should be able to click on motors daily deals
    @Test
    public void testViewMotorsDailyDeals() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        motors.checkViewMotorsDailyDeals();
    }
    //User should be able to click on motors sales events
    @Test
    public void testViewMotorsSalesEvents() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        motors.checkViewMotorsSalesEvents();
    }
    //User should be able to click on car care
    @Test
    public void testViewCarCare() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        motors.checkViewCarCare();
    }
    //User should be able to click on digital manual
    @Test
    public void testViewDigitalManual() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        motors.checkViewDigitalManual();
    }
    //User should be able to click on virtual tech
    @Test
    public void testViewVirtualTech() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        motors.checkViewVirtualTech();
    }
    //User should be able to click on blog
    @Test
    public void testViewBlog() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        motors.checkViewBlog();
    }
    //User should be able to click on parts hub
    @Test
    public void testViewPartsHub() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        motors.checkViewPartsHub();
    }
    //User should be able to click on sellparts
    @Test
    public void testViewSellParts() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        motors.checkViewSellParts();
    }
    //User should be able to click on sell vehicle
    @Test
    public void testViewSellVehicle() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        motors.checkViewSellVehicle();
    }
    //User should be able to click on vehicles sales hub
    @Test
    public void testViewVehiclesSalesHub() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        motors.checkViewVehiclesSalesHub();
    }
    //User should be able to click on send suggestion
    @Test
    public void testViewSendSuggestion() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        motors.checkViewSendSuggestion();
    }
    //User should be able to click on what you think
    @Test
    public void testViewTellWhatYouThink() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        motors.checkViewTellWhatYouThink();
    }
    //User should be able to click on ship tires
    @Test
    public void testViewShipTires() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        motors.checkViewShipTires();
    }
}
