package feature;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/feature"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = { "pretty", "html:target/cucumber-reports" },
        monochrome = true)

public class RunTest {
}
