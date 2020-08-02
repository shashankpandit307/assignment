package com.CocoStore.BaseClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.imageio.stream.FileCacheImageInputStream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseClass {
	
public static WebDriver driver;
public static Properties prop;

public BaseClass(){
	try{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("G:/Assignments/com.CreditCardPayment.com/src/main/java/com/UITest/configuration/config.properties//");
		prop.load(fis);
	}catch (IOException e){
		e.getMessage();
	}
	 
	}
@Before public static void initialization()
{

	String browserName=prop.getProperty("browser");
	if(browserName.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
}
	else if(browserName.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		
	}

	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 driver.manage().timeouts().pageLoadTimeout(WebdriverComp.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
	 driver.manage().timeouts().implicitlyWait(WebdriverComp.IMPLICIT_WAIT,TimeUnit.SECONDS);
	 driver.get(prop.getProperty("url"));
}
	 @After public void cleanUp(){ 
	      driver.close(); 
}
}


