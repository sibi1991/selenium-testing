package org.blazee;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
//@CucumberOptions
@CucumberOptions(features ="src/test/resources", glue = "org.stepde", monochrome = true,dryRun = false  )

public class TestRunner {

}
