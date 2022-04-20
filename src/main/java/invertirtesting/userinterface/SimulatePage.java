package invertirtesting.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SimulatePage {
    public static final Target INPUT_INVERSION = Target.the("value invesment").located(By.id("valor"));
    public static final Target INPUT_PLAZO = Target.the("plazo").located(By.id("plazo"));
    public static final Target INPUT_TIPO = Target.the("type CDT").located(By.id("TipoSelect"));
    public static final Target INPUT_PERIOCIDAD = Target.the("Peririod").located(By.id("periodicidadSelect"));
    public static final Target BUTTON_SIMULATE = Target.the("Button simulate").located(By.id("SimularCDT"));
}
