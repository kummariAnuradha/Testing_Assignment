package com.qa.GermanyIsCalling.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.qa.GermanyIsCalling.base.BaseClass;
import com.qa.GermanyIsCalling.pages.SignUpPage;

public class signup extends BaseClass{
	WebDriver driver; //creates a webdriver object
	SignUpPage sp;  //creates a signup page object
	public signup() throws IOException {
		super();   //constructor to call super class
	}
	
	@BeforeClass
	public void setup(){
	    initialization();
	   sp=new SignUpPage();
	}
	
	//calls the method AcceptClick from SignUPPage
	@Test(priority=0)
	public void acc() {
		sp.AcceptClick();
	}
	@Test(priority=1)
	public void validate() {
		boolean flag=sp.validateButton();
		Assert.assertTrue(flag);
	}
	
	//Calls the Method click from signup page
	@Test(priority=2)
	public void button() {
		sp.click();
	}
	
	//Calls the method signup with all the actual parameters from signuppage
	@Test(priority=3)
	public void validatesignup() {
		sp.signup(props.getProperty("Name"),props.getProperty("Email"),props.getProperty("password"));
	}
	

}
