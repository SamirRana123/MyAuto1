package com.actitime.Generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseCase1 {
	
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	WebDriver driver;
	@BeforeClass
		public void openBrowser()
		{
		 driver=new ChromeDriver();
		 driver.get("https://demo.actitime.com/");
		}
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(3000);
		
		driver.close();
	}
	@BeforeMethod
	public void login()
	{
		driver.findElement(By.name("username")).sendKeys("admin");
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	}
	@AfterMethod
	public void logout() throws InterruptedException
	{
	Thread.sleep(3000);
		driver.findElement(By.id("logoutLink")).click();
	}

	}

