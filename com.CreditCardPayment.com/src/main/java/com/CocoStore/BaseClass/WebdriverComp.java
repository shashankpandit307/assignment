package com.CocoStore.BaseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebdriverComp extends BaseClass {

	static int PAGE_LOAD_TIMEOUT =20;
	static int IMPLICIT_WAIT =30;
	
	
	public void frames(WebElement element ,int value)
	{
		driver.switchTo().frame(value);
  
	}
	
}
