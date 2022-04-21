package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

//import test.TestNGDemo;


public class PropertiesFile {

	public static Properties prop = new Properties();
	static String projectPath = System.getProperty("user.dir");
	public static void main(String[] args) {
		getProperties();
		setProperties();
	

	}
	public static void getProperties() {
		
	try {
		
		InputStream input = new FileInputStream(projectPath+"/src/main/java/config/config.properties");
		prop.load(input);
		String browser = prop.getProperty("broswer");
		System.out.println(browser);
		
		}catch(Exception e)
		{
			System.out.println(e);
		}	
	}
	
	public static void setProperties()
	{
		try {
			OutputStream output = new FileOutputStream(projectPath+"/src/main/java/config/config.properties");
			prop.setProperty("browser", "chrome");
			prop.store(output, "chrome");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
