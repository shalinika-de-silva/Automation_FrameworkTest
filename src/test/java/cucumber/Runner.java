package cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src/Features/"} , glue= {"cucumber"},
plugin= {"pretty" , "json:target/cucumber-json.json"},
tags="@Login")
public class Runner extends AbstractTestNGCucumberTests{

}
 