package invertirtesting.tasks;

import invertirtesting.model.SimulationData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static invertirtesting.userinterface.SimulatePage.*;

public class Simulate implements Task {
    private static List<SimulationData> sc;
    public Simulate (List<SimulationData> sc){this.sc = sc;}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(sc.get(0).getValue()).into(INPUT_INVERSION),
                Enter.theValue(sc.get(0).getInvestment_term()).into(INPUT_PLAZO),
                SelectFromOptions.byVisibleText(sc.get(0).getType_cdt()).from(INPUT_TIPO),
                SelectFromOptions.byVisibleText(sc.get(0).getPeriodicity()).from(INPUT_PERIOCIDAD),
                Click.on(BUTTON_SIMULATE)
        );
    }

    public static Simulate CL(List<SimulationData> sc) {
        return Tasks.instrumented(Simulate.class, sc);}
}
