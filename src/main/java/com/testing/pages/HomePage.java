package com.testing.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
	
	WebDriver driver;
	
	public  HomePage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	// web elements
	@FindBy(id="user_login")
	WebElement username;
	
	@FindBy(how=How.ID,using="user_pass") 
	WebElement password;
	
	@FindBy(how=How.ID,using="wp-submit")
	WebElement submit;
	
	
	public void login_wordpress(String uid,String pass)
	
	{
		username.sendKeys(uid);
		password.sendKeys(pass);
		submit.click();
	}

}
