BaseClass.java
This base class helps with common setup and teardown tasks for your tests, including:
This base class helps with common setup and teardown tasks for your tests, including:

Reading configuration properties from a file.
Initializing the WebDriver based on the browser specified in the config file.
Maximizing the browser window.
Setting implicit wait time.
Navigating to the base URL.
Closing the browser after test execution.
Prerequisites:

Java installed.
Selenium WebDriver libraries downloaded and configured in your project.
GermanyIsCalling/
   src/
      main/
         java/
            com/
               qa/
                  GermanyIsCalling/
                     base/
                        BaseClass.java
                     config/
                        config.properties (Optional)
BaseClass.java
This class provides the following functionalities:

Properties:
props: A static Properties object used to store configuration values from the config file.
driver: A static WebDriver object used to interact with the browser.
Constructor:
Reads configuration properties from config.properties file located in the config folder.
initialization() method:
Sets up the WebDriver based on the browser name specified in the config file.
Maximizes the browser window.
Sets implicit wait time.
Navigates to the base URL specified in the config file.
@AfterClass teardown() method:
Closes the browser after test execution.
Configuration File (Optional)
The config.properties file (located in the config folder) can be used to store configuration values such as base URL and browser name. This allows for easy configuration changes without modifying the code itself.

Example config.properties:
browser=chrome
url=https://www.germany-is-calling.com/

Usage
Extend the BaseClass in your test classes.
Override the initialization() method if you need to customize the setup process.
Use the driver object in your test methods to interact with the browser.

Running Tests:

Use a testing framework like TestNG to run your test classes. The @AfterClass teardown method in the BaseClass will ensure the browser is closed after each test execution.

SignInPage.java:
This file contains the SignInPage class, which represents the Sign In page within the GermanyIsCalling application. It utilizes the Page Object Model (POM) design pattern for efficient and maintainable test automation.

Dependencies

Selenium WebDriver (version not specified, but assumed to be compatible)
BaseClass.java (assumed to be a custom base class for common WebDriver functionalities)
Class Structure

Constructor:
Initializes the SignInPage object using PageFactory.initElements.
Locators:
WebElements are identified using @FindBy annotations with XPath expressions.
Ac: Button to accept cookies (if present)
log: Login/Signup button
Emaillog: Email input field
Passwordlog: Password input field
logClick: Login button
Methods:
clickonlog(): Accepts cookies (if applicable) and clicks the Login/Signup button.
loginBtn(String en, String pass): Performs login with provided email (en) and password (pass).
SignInPage sip = new SignInPage(); // Create an instance of SignInPage

// Assuming en and pass are valid email and password credentials
sip.clickonlog();
sip.loginBtn(en, pass);
Consider using a more robust locator strategy (e.g., combining XPath with CSS selectors) for increased element identification reliability.
If applicable, explore using a framework like Page Factory for managing Page Objects.
Employ proper logging mechanisms (e.g., using a logger class) to track actions and errors during test execution.
Adhere to best practices for test automation code structure, readability, and maintainability.

signUppage.java
This document outlines the functionalities of the SignUpPage.java class within the com.qa.GermanyIsCalling.pages package. This class interacts with the elements on the Signup webpage of the GermanyIsCalling application.
Dependencies

BaseClass.java - This class likely contains common methods and functionalities used across all page objects.
Selenium WebDriver - A library for automating web browser interactions.
Locators

The class utilizes XPath expressions to locate web elements on the Signup webpage. Here's a breakdown of the locators used:

Accept: Targets the button to accept cookies.
logorsignup: Locates the Login/Signup button.
newUser: Identifies the link for new users to register.
Name: Finds the input field for the user's name.
email: Locates the input field for the user's email address.
password: Identifies the input field for the user's password.
signup: Targets the button to submit the signup form.
Actions

The SignUpPage.java class provides several methods to interact with the Signup webpage elements:

AcceptClick(): Clicks the button to accept cookies.
validateButton(): Checks if the Login/Signup button is enabled. Returns a boolean value.
click(): Clicks the Login/Signup button and then the New User link.
signup(String un, String em, String pass): Fills the Signup form with provided parameters for name (un), email (em), and password (pass). Then, clicks the Signup button.This example demonstrates how to accept cookies, validate the Login/Signup button, navigate to the signup form, and fill in the signup details using the provided methods.

TestCases: To call Methods from Pages and to validate functions:
The project consists of three main packages:

com.qa.GermanyIsCalling.base: This package contains the base class BaseClass which provides common functionalities like WebDriver initialization and property file loading.
com.qa.GermanyIsCalling.pages: This package contains page objects for different pages of the Germany Is Calling application, such as SignInPage and SignUpPage. These page objects encapsulate elements and functionalities specific to each page.
com.qa.GermanyIsCalling.testcases: This package contains test cases for various functionalities of the application. These test cases extend the BaseClass and interact with page objects to perform actions and verify results.
Test Cases:

The provided code snippets showcase three test cases:

SignIn.java:
This test case performs the following actions:
Accepts cookies (if any) on the login page.
Clicks on the login button.
Enters valid email and password for login (credentials are retrieved from a property file).
signup.java:
This test case performs the following actions:
Accepts cookies (if any) on the signup page.
Verifies the presence of the signup button.
Clicks on the signup button.
Enters valid details (name, email, password) for signup (credentials are retrieved from a property file).
unsuccessfulLogin.java:
This test case performs login attempts with different scenarios:
Login with invalid credentials (both email and password are wrong).
Login with empty credentials (both email and password fields are empty).
Login with valid email and invalid password (only password is wrong).
Running the Tests:

To run the test cases, you'll need the following:

Java installed
TestNG framework installed
Selenium WebDriver libraries
Project files with necessary code
Once you have these prerequisites, you can execute the test cases using a TestNG runner tool.

