package TestRunner;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
		(
				
		features= ".//Features/",
		glue = "stepDefinitions",
		dryRun = false,								 //if dryRun=true will display if all steps have been implemented. Is every step is having corresponding method
		monochrome = true,							//will remove unnecessary character in your console.
		plugin = {"pretty","html:test-output"},
		tags = {"@sanity, @regression"}
		
		)



public class testRun {

}
