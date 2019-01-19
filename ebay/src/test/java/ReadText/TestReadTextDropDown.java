package ReadText;

import ReadList.ReadDropDown;
import Util.TestLogger;
import org.testng.annotations.Test;
public class TestReadTextDropDown extends ReadDropDown {
    @Test
    public void TestReadDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        readText();
    }
}
