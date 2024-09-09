package com.qa.GermanyIsCalling.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.GermanyIsCalling.base.BaseClass;
import com.qa.GermanyIsCalling.pages.SignInPage;


public class SignIn extends BaseClass{
	//creates a webdriver object
	WebDriver driver;
	
	//Creates signin Page object
	SignInPage si;
	
	//constructor to call super class 
	public SignIn() throws IOException {
		super();
	}
	//intialize and sets up the webpage for germany is calling
	@BeforeClass    //executes before any test methods in the current class
	public void setup(){
	    initialization();
	   si=new SignInPage();
	}
	
	//calls the clickonlog metod from signinpage
	@Test(priority=1)
	public void AcceptandLog() {
		si.clickonlog();
	}
	
	//calls the loginbtn method from signinPage with actual parameters
	@Test(priority=2)
	public void enter() {
		si.loginBtn(props.getProperty("Email"), props.getProperty("password"));
	}

}
