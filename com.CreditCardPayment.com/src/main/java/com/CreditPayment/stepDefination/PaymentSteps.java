package com.CreditPayment.stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.CocoStore.BaseClass.BaseClass;
import com.PaymentGateway.objectspages.CreditPayment;
import com.testData.payment.FileLib;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class PaymentSteps extends BaseClass{
	CreditPayment cp = new CreditPayment();
	FileLib flib= new FileLib();
	@Given("user opens browser")
	public void user_opens_browser() {
	 BaseClass.initialization();
	}

	@Then("user Navigate to Application")
	public void user_navigate_to_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String title=cp.validateTitile();
		CreditPayment cc = PageFactory.initElements(driver, CreditPayment.class);
		cc.getBynow().click();
		cc.getCheckout().click();
		driver.switchTo().frame(0); //Switching to the frame
		System.out.println("********We are switched to the iframe*******");
		driver.findElement(By.xpath("//a[@class='button-main-content']")).click();
		driver.findElement(By.xpath("//div[text()='Credit Card']")).click();
		
		String Creditnumber =flib.getExcelData("credit", 1, 1);
		System.out.println(Creditnumber);
		String expirydate =flib.getExcelData("credit", 1, 2);
		System.out.println(expirydate);
		String cvv =flib.getExcelData("credit", 1, 3);
		System.out.println(cvv);
		String otp =flib.getExcelData("credit", 1, 4);
		System.out.println(otp);
		
	
	driver.findElement(By.name("cardnumber")).sendKeys(Creditnumber);
   // driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[placeholder='MM / YY']")));
    driver.findElement(By.xpath("//input[@placeholder='MM / YY']")).sendKeys("12/24");
    driver.findElement(By.xpath("//input[@placeholder='123']")).sendKeys(cvv);
	
}
}
