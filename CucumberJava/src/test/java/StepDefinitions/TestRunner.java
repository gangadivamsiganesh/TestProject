package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/Features/login1.feature","src/test/resources/Features/login1.feature"},glue ={"StepDefinitions"},monochrome=true,
plugin={"pretty", "json:target/JSONReports/reports.json"},tags="")
public class TestRunner 
{

}
