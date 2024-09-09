package com.qa.GermanyIsCalling.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.GermanyIsCalling.base.BaseClass;

public class SignInPage extends BaseClass{
	public SignInPage() {
		PageFactory.initElements(driver,this);
	}
	
	//Locators are used to identify the WebElements
	@FindBy(xpath="/html/body/div[1]/div/div[6]/button[1]") WebElement Ac;
	@FindBy(xpath="//a[normalize-space()='Login / SignUp']") WebElement log;
	@FindBy(xpath="//*[@id=\"username\"]") WebElement Emaillog;
	@FindBy(xpath="//*[@id=\"password\"]") WebElement Passwordlog;
	@FindBy(xpath="/html/body/div/div[1]/div/div/div/form/div[3]/button") WebElement logClick;
	
	//click action is performed to accept cookies and click on login or signup button
	public void clickonlog() {
		Ac.click();
		log.click();
	}
	
	/*signin page with parameters and en for email and pass for password it gets it's 
	 actual values from signin.java*/
	public void loginBtn(String en, String pass) {
    	Emaillog.sendKeys(en);
    	Passwordlog.sendKeys(pass);
    	logClick.click();
    }

}
