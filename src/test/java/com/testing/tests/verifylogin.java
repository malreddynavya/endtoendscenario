package com.testing.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.frameworkutility.BrowserFactory;
import com.testing.pages.HomePage;

public class verifylogin {
	
	
	@Test
	public void checkvaliduser(){
		
		WebDriver driver=BrowserFactory.startBrowser("chrome", "http://demosite.center/wordpress/wp-login.php");
		HomePage Home_page=PageFactory.initElements(driver,HomePage.class);
		Home_page.login_wordpress("admin", "demo123");
	}

}
