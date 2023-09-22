package StepsCode;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue={"StepsCode"},



plugin ={"pretty","html:target/HtmlReports3",
          "json:target/cucumber-reports2/Cucumber.json"},

monochrome=true


)

public class TestRunner {
	
	

}
