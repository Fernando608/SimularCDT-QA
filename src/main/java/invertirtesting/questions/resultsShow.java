package invertirtesting.questions;

import invertirtesting.utils.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import javax.swing.*;

import static invertirtesting.userinterface.ResultsPage.*;


public class resultsShow implements Question {

    public static resultsShow info() {
        return new resultsShow();
    }

    @Override
    public Object answeredBy(Actor actor) {
        Wait.Time(5000);

        System.out.println(
                "Tasa de Interés E.A. : "+
                TEXT_IEA.resolveFor(actor).getText()+"\n"+
                        "Tasa de Interés N.A. : " +
                        TEXT_INA.resolveFor(actor).getText()+"\n"+
                        "Rentabilidad neta de la inversión : " +
                        TEXT_RNI.resolveFor(actor).getText()+"\n"+
                        "Retención en la fuente : " +
                        TEXT_RF.resolveFor(actor).getText()+"\n"+
                        "Rentabilidad por periodo : " +
                        TEXT_RP.resolveFor(actor).getText()+"\n"+
                        "Valor final de la inversión : " +
                        TEXT_VFI.resolveFor(actor).getText()
        );

        return true;
    }


}
