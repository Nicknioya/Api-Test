package com.nioyatech.cyberApiprojecttest.Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin   = {"pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failedRerun.txt"
        },
        publish  = true,
        features = {"src/test/resources/Features"},
        glue     = {"com.nioyatech.mlhubprojecttest.StepDefinitions"},
        tags     = "@all_tests" ,
        dryRun   = false
)
public class Runners {
}
