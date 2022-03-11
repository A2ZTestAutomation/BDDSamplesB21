package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		publish = true,
		features = "src//test//resources//taggedFeatures//",
		glue = {"stepDefs"},
		dryRun = false,
		monochrome = true,
		plugin= {"html:target/reports/HtmlReports.html"},
//		tags = "@RegressionTest"
//		tags = "@RegressionTest or @SmokeTest"
//		tags = "@RegressionTest and @SmokeTest"
//		tags = "not @IntegrationTest"
//		tags = "@RegressionTest"
//		tags = "@PhaseOne and @RegressionTest"
//		tags = "@PhaseOne and not @RegressionTest or @PhaseTwo and @SmokeTest"
//		tags = "@RegressionTest or @SmokeTest"
//		tags = "not @RegressionTest and not @SmokeTest and not @IntegrationTest"
//		tags = "@PhaseOne or @PhaseTwo"
		tags = "@PhaseOne and @RegressionTest or @PhaseOne and @SmokeTest"
		)
public class CRMRunner {

}
