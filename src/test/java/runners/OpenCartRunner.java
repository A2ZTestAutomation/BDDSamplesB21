package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		publish = true,
		features = "src//test//resources//features//OpencartLogin.feature",
		glue = {"stepDefs"},
		dryRun = false,
		monochrome = true,
		plugin = {"pretty",
					"html:target/reports/HtmlReport.html",
				}
		)
public class OpenCartRunner {

}
