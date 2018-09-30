package com.qa.AdvancedTesting;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddOwnerPage
{

	@FindBy(xpath = "//*[@id=\'firstName\']")
	private WebElement firstNameBox; 
	
	@FindBy(xpath = "//*[@id=\'lastName\']")
	private WebElement lastNameBox;
	
	@FindBy(xpath = "//*[@id='address']")
	private WebElement address;
	
	@FindBy(xpath = "//*[@id=\'city\']")
	private WebElement city;
	
	@FindBy(xpath = "//*[@id=\'telephone\']")
	private WebElement telephone;
	
	@FindBy(xpath = "/html/body/app-root/app-owner-add/div/div/form/div[7]/div/button[2]")
	private WebElement submitButton; 

	public void addOwner(String name, String lName, String addressTxt, String cityTxt, String phone)
	{
		firstNameBox.click();
		firstNameBox.sendKeys(name);
		lastNameBox.click();
		lastNameBox.sendKeys(lName);
		address.click();
		address.sendKeys(addressTxt);
		city.click();
		city.sendKeys(cityTxt);
		telephone.click();
		telephone.sendKeys(phone);
		submitButton.click();
	}
}
