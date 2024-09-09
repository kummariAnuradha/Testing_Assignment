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
