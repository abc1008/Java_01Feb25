package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\features"},
		glue = {"stepDefinitions","hooks"}
		
		)
public class TestRunner extends AbstractTestNGCucumberTests
{

}
