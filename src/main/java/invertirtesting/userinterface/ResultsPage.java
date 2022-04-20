package invertirtesting.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ResultsPage {

    public static final Target TEXT_IEA = Target.the("E.A. Interest Rate").located(By.xpath("//div[1]//div[1]//div[1]//p[2]"));
    public static final Target TEXT_INA = Target.the("N.A. Interest Rate").located(By.xpath("//div[1]//div[1]//div[2]//p[2]"));
    public static final Target TEXT_RNI = Target.the("Net investment return").located(By.xpath("//div[2]//div[1]//p[2]"));
    public static final Target TEXT_RF = Target.the("Withholding tax").located(By.xpath("//div[2]//div[2]//p[2]"));
    public static final Target TEXT_RP = Target.the("Yield per period").located(By.xpath("//div[1]//div[1]//div[3]//p[2]"));
    public static final Target TEXT_VFI = Target.the("Final value of the investment").located(By.xpath("//div[2]//div[3]//p[2]"));

}
