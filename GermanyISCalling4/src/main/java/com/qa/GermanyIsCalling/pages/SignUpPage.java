package com.qa.GermanyIsCalling.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.GermanyIsCalling.base.BaseClass;

public class SignUpPage extends BaseClass{
	public SignUpPage() {
		PageFactory.initElements(driver,this);
	}
	
	//Locators to locate the webElement on the WebPage
	@FindBy(xpath="/html/body/div[1]/div/div[6]/button[1]") WebElement Accept;
	@FindBy(xpath="//a[normalize-space()='Login / SignUp']") WebElement logorsignup;
	@FindBy(xpath="/html/body/div/div[1]/div/div/div/form/p[2]/small/a") WebElement newUser;
	@FindBy(xpath="//input[@id='first_name']") WebElement Name;
	@FindBy(xpath="//*[@id=\"username\"]") WebElement email;
	@FindBy(xpath="//input[@id='password']") WebElement password;
	@FindBy(xpath="//button[normalize-space()='Sign Up']") WebElement signup;
	
	//Action to click on Acceptcookies
	public void AcceptClick() {
		Accept.click();
	}
	public boolean validateButton() {
		return logorsignup.isEnabled();
	}
	
	//Action to click on login Or signup button and new to germany 
	public void click() {
		logorsignup.click();
		newUser.click();
	}
	
	/*signup page with parameters un for name  and em for email and pass for password it gets it's 
	 actual values from signup.java*/
	public void signup(String un,String em,String pass) {
		Name.sendKeys(un);
		email.sendKeys(em);
		password.sendKeys(pass);
		signup.click();
		
	}
	

}
