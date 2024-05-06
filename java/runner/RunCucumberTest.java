package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        tags = "@LoginSucesso",
        glue = "steps",
        monochrome = false,
        dryRun = false,
        snippets = CucumberOptions.SnippetType.UNDERSCORE,
        plugin = {
                "pretty",
                "html:target/cucumber/index.html",
                "json:target/cucumber/index.json"
        }

)

public class RunCucumberTest {

}
