package com.framework.keywordDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropFtech {
	public String fetchpro(String key) throws Throwable
	{
		FileInputStream fis = new FileInputStream("D:\\GCCA22\\actiLoginData.PROPERTIES");
		Properties pobj = new Properties();
		pobj.load(fis);
	String data=	pobj.getProperty(key);
	 return data;
	}

}
