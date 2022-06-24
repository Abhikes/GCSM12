package com.framework.testcases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.framework.genricLib.BaseTest;
@Listeners(com.framework.genricLib.ListnerClass.class)
public class TestCase1 extends BaseTest {
	@Test
	public void tc1() throws Throwable
	{
		driver.findElement(By.id("taskSearchControl_field")).sendKeys(e.FetchExcelData("Sheet1", 1, 1));
	}

}
