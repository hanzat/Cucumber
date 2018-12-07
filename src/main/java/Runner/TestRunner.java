package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/*@RunWith(Cucumber.class)
@CucumberOptions(

		features = "C:\\Users\\hanza\\eclipse-workspace\\CucemberLearning\\src\\main\\java\\Features", 
		glue = { "stepDefination" },

		//format = { "pretty", "html:test-output" }
		plugin= {"pretty","html:target/cucumber-reports"},
		monochrome=true

)

public class TestRunner {
	

	
	9

}
*/
@RunWith(Cucumber.class)
@CucumberOptions(

		features = "C:\\Users\\hanza\\eclipse-workspace\\CucemberLearning\\src\\main\\java\\Features\\signUp.feature", 
		glue = { "stepDefination" },

		//format = { "pretty", "html:test-output" }
		plugin= {"pretty","html:target/cucumber-reports"},
		monochrome=true

)

public class TestRunner {
	
	
	
	//https://github.com/hanzat/Cucumber.git
	
	

}
