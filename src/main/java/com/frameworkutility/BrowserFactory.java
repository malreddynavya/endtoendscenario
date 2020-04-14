package com.frameworkutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	
	static WebDriver driver;
	
	public static  WebDriver startBrowser(String Browsername,String url)
	{
		if(Browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\AutomationProjects\\NewSeleniumPractice\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if (Browsername.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
	
	driver.manage().window().maximize();
	driver.get(url);
	return driver;
}
}

