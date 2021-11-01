package com.testingshastra.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile1 {
	public static String getProperty(String fileName,String key) {
		 String dir=System.getProperty("user.dir");
		 String value="";
		 try {
	    	 FileInputStream fis=new FileInputStream(dir+fileName);
	    	 Properties prop=new Properties();
	    	 prop.load(fis);
	    	 value=prop.getProperty(key);
	     }catch(FileNotFoundException e) {
	    	 e.printStackTrace();
	     } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return value;
       
	}
	/*
	 * This method return the value of locator mention in objectRepostory
	 * @param key
	 */

	public static String getObject(String key) {
		return getProperty("/src/test/resources/objectRepository.properties", key);

	}

}
