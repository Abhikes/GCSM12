package com.framework.genricLib;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.framework.genricLib.BaseTest;
import com.google.common.io.Files;

//import org.testng.ITestNGListener;

public class ListnerClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("TestCase Started"+result.getName(),true);
		}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("TestCase Executed"+result.getName(),true);
			
	}

	@Override
	public void onTestFailure(ITestResult result) {
		TakesScreenshot sh = (TakesScreenshot)BaseTest.driver;
		File src=sh.getScreenshotAs(OutputType.FILE);
		File dist=new File("D:\\GCCA22\\Sceenshot\\"+result.getName()+".png");
		try {
			Files.copy(src, dist);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	
	
	
	

}
