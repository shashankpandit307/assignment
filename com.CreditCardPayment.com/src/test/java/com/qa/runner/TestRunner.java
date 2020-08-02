package com.qa.runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(format={"pretty","json:target/"}, features="G:/Assignments/com.CreditCardPayment.com/src/main/java/PaymentGateway/CreditCartPayment.feature",glue={"com.CreditPayment.stepDefination"},
plugin = { "pretty", "com.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport.html" },
strict = true,
dryRun = false
)
public class TestRunner {
	@AfterClass
	public static void setup()
	{
	Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
	//Reporter.setSystemInfo("Test User", System.getProperty("user.name"));
	Reporter.setSystemInfo("User Name", "Shashank Pandit");
	Reporter.setSystemInfo("Application Name", "COCO STORE ");
	Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
	Reporter.setSystemInfo("Environment", "Test");
	Reporter.setTestRunnerOutput("Test Execution Cucumber Report");
	}
	}

