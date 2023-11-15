package com.assignment.springdemoapp.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;


@CucumberOptions(
        features = "src/test/java/com/assignment/springdemoapp/features",
        glue = "com.assignment.springdemoapp.stepdefinitions",
        plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", //Extent report adapter- plugin
        "com.assignment.springdemoapp.listeners.RunnerLifecycleHandler"}, //Custom listener - cucumber plugin
        tags = "@Smoke"
)

public class CucumberRunnerTest extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios(){
        return super.scenarios();
    }




}
