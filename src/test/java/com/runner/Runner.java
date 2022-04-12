package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.base.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
/*
 features = "C:\\Users\\User\\Desktop\\Cucumber - BDD\\CucumberPOM\\src\\main\\java\\com\\qa\\features\\DemoSite.feature"//path of the feature files
        ,glue = {"com/qa/stepDefinitions"} //path of the step definition files
        ,plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport.html"}
      ,plugin = {"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_output/cucumber.xml"} //to generate diff types of reporting
        ,monochrome =true //display the console output in a proper readable format
        ,strict=true //it will check if any step is not defined in step definition file
        ,dryRun = false  //to check the mapping is proper btw feature file and step defn file
        //,tags = {"@FuntionalTest" , "~@SmokeTest" , "~@End2EndTest"}
        )
 */
@CucumberOptions(features = "src\\test\\java\\com\\feature",
					glue = "com\\stepdefinition",
					monochrome = true,
					strict = true, 
					plugin = {
							"pretty",
							"json:target/My Reports/report.json",
							"html:target/My Reports/report",
							"com.cucumber.listener.ExtentCucumberFormatter:target/My Reports/ExtentReport.html"
							})

public class Runner {
	public static WebDriver driver;

	@BeforeClass
	public static void setUp() {
//		driver = BaseClass.browserLaunch("chrome");
	}

	@AfterClass
	public static void tearDown() {
		BaseClass.close();
	}
}
