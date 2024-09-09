package com.qa.GermanyIsCalling.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class BaseClass {
	public static Properties props;
	public static WebDriver driver;
	
	public BaseClass() {
		props=new Properties();
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\HOME\\eclipse-workspace1\\GermanyIsCalling\\src\\main\\java\\com\\qa\\GermanyIsCalling\\config\\config.properties");
		props.load(fis);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initialization() {
		String browserName=props.getProperty("browser");
		if(browserName.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browserName.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(props.getProperty("url"));
	}
	@AfterClass
	public void teardown() {
		driver.quit();
	}

}
