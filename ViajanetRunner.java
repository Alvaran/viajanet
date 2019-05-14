package Core;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java"},
		glue = {"src/test/java/Step"},
		plugin = {"pretty", "json:target/teste.json"},
		monochrome = true,
		dryRun = false,
		snippets = SnippetType.CAMELCASE,
		tags = {"@feature"},
     	strict = true
	)
	public class ViajanetRunner {
	}
