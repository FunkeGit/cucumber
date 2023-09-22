package StepsCode;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		         features="src/test/resources/Featuretags", 
                 glue={"StepsCode"},
                 tags= "@Smoke and not @Regression"


  )

public class TestRunnertag {
	
	

}
