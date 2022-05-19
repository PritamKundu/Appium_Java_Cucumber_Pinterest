package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(features="failedTests/failed_scenarios.txt",glue ="stepDefinitions"
        ,monochrome=true,
        plugin= {"html:allure-results/cucumber-failed.html", "json:allure-results/cucumber-failed.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        }
)
public class FailedTestRunner extends AbstractTestNGCucumberTests{

    @Override
    @DataProvider(parallel=true)
    public Object[][] scenarios()
    {
        return super.scenarios();
    }

}