package com.epic.Runner;

import com.epic.Utility.WebDriverHelper;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterMethod;

@CucumberOptions(features= {"src/Features/"} , glue= {"com/epic/StepDefenition"},
        plugin= {"pretty" , "json:target/cucumber-json.json"},
        tags="@Login")

public class Runner extends AbstractTestNGCucumberTests {

    @AfterMethod
    public void afterMethod(){
        WebDriverHelper.getHelper().driverClose();
    }
}
