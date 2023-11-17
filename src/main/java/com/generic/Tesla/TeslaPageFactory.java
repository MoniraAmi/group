package com.generic.Tesla;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TeslaPageFactory {
	
	public TeslaPageFactory(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@class='fa fa-lock']")
	private WebElement logintoautomation;

	public WebElement getLogintoautomation() {
		return logintoautomation;
	}
	
	@FindBy(xpath = "//*[@name='email'][1]")
	private WebElement email;

	public WebElement getEmail() {
		return email;
	}
	@FindBy(xpath = "//*[@name='password']")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}

	@FindBy(xpath="//*[text()='Login']")
	private WebElement click;

	public WebElement getClick() {
		return click;
	}

	public WebElement getLogout() {
		return logout;
	}

	@FindBy(xpath = "//*[contains(text(),'Logout')]")
	private WebElement logout;

}
