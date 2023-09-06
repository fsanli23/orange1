package com.orange.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = {
        "pretty","html:target/cucumber-report.html",
        "json:target/cucumber.json",
        "rerun:target/rerun.txt"


},
         features = {"src/main/resources/features/LoginFeature.feature"},
         glue ={"src/main/java/com/orange/step_definitions"},
         dryRun = false,
         tags = "@directory"
)

public class CukesRunner {
}

