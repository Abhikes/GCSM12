package com.framework.genricLib;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.framework.dataDriven.ExcelFetch;
import com.framework.keywordDriven.PropFtech;

public class BaseTest {
	public static WebDriver driver;
	public PropFtech f = new PropFtech();
	public ExcelFetch e = new ExcelFetch();
	//@Parameters("browser")
	@BeforeClass
	public void openBrow() throws Throwable
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\QSPJSP\\GCCA22\\Framework\\src\\browsers_Jars\\chromedriver.exe");
	    driver = new ChromeDriver();
		
		    driver.get(f.fetchpro("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Parameters({"un","pw"})
	@BeforeMethod
	public void login(String un,String pw) throws Throwable
	{
		driver.findElement(By.id("username")).sendKeys(un,Keys.TAB,pw,Keys.ENTER);
		
		
	}
	
	
	@AfterMethod
	public void logOut()
	{
		driver.findElement(By.id("logoutLink")).click();
	}

}
