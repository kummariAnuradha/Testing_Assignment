package com.qa.GermanyIsCalling.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.GermanyIsCalling.base.BaseClass;
import com.qa.GermanyIsCalling.pages.SignInPage;

import junit.framework.Assert;

public class unsuccessfulLogin extends BaseClass{
	WebDriver driver;
	SignInPage si;
	public unsuccessfulLogin() throws IOException {
		super();
	}
	
	//intialize and sets up the webpage for germany is calling
	@BeforeMethod    //executes before every test method
	public void setup(){
	    initialization();
	   si=new SignInPage();
	}
	
	//login with invalid credentials 
	@Test(priority=1)
	public void invalidCredentials() {
		si.clickonlog();
		si.loginBtn(props.getProperty("InvalidEmail"), props.getProperty("Invalidpassword"));
		String ExpectedURL="https://app.germanyiscalling.com/cv/upload/";
		String ActualURL=driver.getCurrentUrl();
		Assert.assertEquals(ActualURL, ExpectedURL);
		
	}
	
	//login with empty credentials
	@Test(priority=2)
	public void emptycredentials() {
		si.clickonlog();
		si.loginBtn(props.getProperty("email"),props.getProperty("Password"));
		String ExpectedURL="https://app.germanyiscalling.com/cv/upload/";
		String ActualURL=driver.getCurrentUrl();
		Assert.assertEquals(ActualURL, ExpectedURL);
		
	}
	
	//login with valid email and invalid password
	@Test(priority=2)
	public void credentials() {
		si.clickonlog();
		si.loginBtn(props.getProperty("Email"),props.getProperty("Password"));
		String ExpectedURL="https://app.germanyiscalling.com/cv/upload/";
		String ActualURL=driver.getCurrentUrl();
		Assert.assertEquals(ActualURL, ExpectedURL);
		
	}

}
