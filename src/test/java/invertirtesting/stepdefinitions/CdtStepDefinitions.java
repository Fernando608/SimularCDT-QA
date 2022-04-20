package invertirtesting.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import invertirtesting.model.SimulationData;
import invertirtesting.questions.resultsShow;
import invertirtesting.tasks.OpenUp;
import invertirtesting.tasks.Simulate;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CdtStepDefinitions {

    @Before
    public void sedStage(){ OnStage.setTheStage(new OnlineCast()); }

    @Given("^the user enters Falabella bank's web page$")
    public void theUserEntersFalabellaBankSWebPage()  {
        OnStage.theActorCalled("User").wasAbleTo(OpenUp.theUrl());
    }

    @When("^the user enters the simulation data$")
    public void theUserEntersTheSimulationData(List<SimulationData>simulationData)  {
        theActorInTheSpotlight().attemptsTo(Simulate.CL(simulationData));
    }

    @Then("^verify that the results of the simulation were obtained$")
    public void verifyThatTheResultsOfTheSimulationWereObtained() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(resultsShow.info()));
    }

}
