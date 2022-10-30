package com.juaracoding.cucumber;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "",
        features = {"src/main/resources/features/02.Login.feature",
                "src/main/resources/features/03.Dashboard.feature"},
        glue = "com.juaracoding.cucumber",
        plugin = {"pretty","html:target/cucumber-reports.html","json:target/cucumber.json"})

public class RunnerTest extends AbstractTestNGCucumberTests{
}
