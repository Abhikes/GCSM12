package com.framework.genricLib;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

//import java.time.Duration;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

public class Assertion_Data {
	@Test
	public void assetdata() throws Throwable
	{
		String ExpResult="actiTIME - Enter Time-Track";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\QSPJSP\\GCCA22\\Online_Batch\\src\\browsers_Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		
		
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
		
		Thread.sleep(3000);
		
		String actalResult=driver.getTitle();
		System.out.println(ExpResult);
		System.out.println(actalResult);
		
		Assert.assertEquals(actalResult,ExpResult);
		System.out.println("Pass");
		
	}

}
