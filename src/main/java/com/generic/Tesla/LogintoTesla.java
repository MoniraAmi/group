package com.generic.Tesla;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.util.Tesla.BaseConfig;
import com.util.Tesla.Highlighter;
import com.util.Tesla.Screenshoot;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LogintoTesla {
	
	public void getlogin() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	
		driver.navigate().to(BaseConfig.getConfigValue("QA_URL"));
		driver.manage().window().maximize();
		

		
		
		TeslaPageFactory tpf = new TeslaPageFactory(driver);
		Highlighter.addColor(driver, tpf.getLogintoautomation());
		tpf.getLogintoautomation().click();
		
		Highlighter.addColor(driver, tpf.getEmail());
		tpf.getEmail().sendKeys(BaseConfig.getConfigValue("email"));
		
		Highlighter.addColor(driver, tpf.getPassword());
		tpf.getPassword().sendKeys(BaseConfig.getConfigValue("password"));
		
		Highlighter.addColor(driver, tpf.getClick());
		tpf.getClick().click();
		//tpf.getLogout().click();
	
		Screenshoot.getScreenShot(driver, "Homepage_AfterLogin");
	 
	if(tpf.getLogout().isDisplayed()) {
		System.out.println("Login Successful");
		
	}else {
		System.out.println("Login Failed");
	}

	}

}
