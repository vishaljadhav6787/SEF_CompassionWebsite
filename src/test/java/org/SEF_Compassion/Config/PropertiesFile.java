package org.SEF_Compassion.Config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile {
	public static Properties prop = new Properties();
	public static void  readproperties() {
		
		try {
			FileInputStream input = new FileInputStream(System.getProperty("user.dir") + "/src/test/java/org/SEF_Compassion/Config/Config.properties");
			
			prop.load(input);
		
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
		
		public static void writeproperties() {
			
			try {
				
				OutputStream output = new FileOutputStream(System.getProperty("user.dir") + "/src/test/java/org/SEF_Compassion/Config/Config.properties");
				
				prop.setProperty("dev", "https://services.compassionuk.org/sef/");   
			//	prop.setProperty("stage", "https://cukwebsite.co.uk/");
				
				prop.store(output, null);
			
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		public static String Devurl() {
			String developmenturl = "";
		try {
			FileInputStream input = new FileInputStream(System.getProperty("user.dir") + "/src/test/java/org/SEF_Compassion/Config/Dev.properties");
			
			prop.load(input);
			prop.getProperty("dev");
			developmenturl = prop.getProperty("dev");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return developmenturl;
	}
		
}

	
	
	
	
		
		
		
		
		
	
	

