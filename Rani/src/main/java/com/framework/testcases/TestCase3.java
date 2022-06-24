package com.framework.testcases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.framework.genricLib.BaseTest;
@Listeners((com.framework.genricLib.ListnerClass.class) )
public class TestCase3 extends BaseTest {
	@Test
	public void tc3() throws Throwable
	{
		driver.findElement(By.xpath("//span[text()='New']")).click();
		driver.findElement(By.className("[class='inputFieldWithPlaceholder']")).sendKeys(e.FetchExcelData("Sheet1", 1, 1));
	}

}
