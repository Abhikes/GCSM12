package com.framework.genricLib;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_data {
@DataProvider
public Object getData()
{
	Object[][] obj = new Object[2][2];
	obj[0][0]="admin";
	obj[0][1]="manager";
	
	obj[1][0]="admin1";
	obj[1][1]="manager1";
	return obj;
	
}
@Test(dataProvider ="getData")
public void checkInfo(String un,String pw)
{
	System.out.println(un + "    "+pw);
}







}
