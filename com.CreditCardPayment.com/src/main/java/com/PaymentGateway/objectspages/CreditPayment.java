package com.PaymentGateway.objectspages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.CocoStore.BaseClass.BaseClass;

public class CreditPayment extends BaseClass
{

		@FindBy(xpath ="//a[@class='btn buy']" )
		private WebElement Bynow;
		
		@FindBy(xpath ="//div[@class='cart-checkout']")
		private WebElement checkout;

		public CreditPayment()
		{
			PageFactory.initElements(driver, this);
		}
	
		public WebElement getBynow() {
			return Bynow;
		}

		public void setBynow(WebElement bynow) {
			Bynow = bynow;
		}

		public WebElement getCheckout() {
			return checkout;
		}

		public void setCheckout(WebElement checkout) {
			this.checkout = checkout;
		}

		public String validateTitile()
		{
			return driver.getTitle();
		}
	}

