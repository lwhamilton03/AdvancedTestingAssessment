package com.qa.AdvancedTesting;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	@FindBy(xpath = "/html/body/app-root/div[1]/nav/div/ul/li[2]/a")
	private WebElement addOwners;
	
	@FindBy (xpath = "/html/body/app-root/div[1]/nav/div/ul/li[2]/ul/li[2]/a")
	private WebElement addNew; 
	
	public void clickAddOwners()
	{
		addOwners.click();
		addNew.click();
	}
}
