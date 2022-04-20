package invertirtesting.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/cdt.feature",
        tags ="@story",
        glue = "invertirtesting.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class CdtRunner {
}
