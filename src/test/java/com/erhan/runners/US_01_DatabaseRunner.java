package com.erhan.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = "com.erhan.steps",
		dryRun = false,
		monochrome = true,
		tags = "@DB",
		plugin = {
					
					"html:target/cucumber-default-report.html",
					"json:target/cucumber.json"
				}
		
		)

public class US_01_DatabaseRunner {

}
