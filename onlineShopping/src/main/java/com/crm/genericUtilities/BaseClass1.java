package com.crm.genericUtilities;
/**
 * 
 * @author SanjayBabu
 *
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass1 
{
	public static WebDriver sdriver;
	public WebDriver driver;
	public DataBaseUtility dLib=new DataBaseUtility();
	public ExcelUtility eLib=new ExcelUtility();
	public FileUtility fLib=new FileUtility();
	public WebDriverUtility  wLib=new WebDriverUtility();
	public JavaUtility jLib=new JavaUtility();

	
	/**
	 * launching the browser
	 * @throws Throwable
	 */
	//@Parameters("BROWSER")
	
	public void launchTheBrowser()
	{  
		String BROWSER = null;
		try {
			BROWSER = fLib.getPropertKeyValue("browser");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println(BROWSER);
		String URL = null;
		try {
			URL = fLib.getPropertKeyValue("url");
		} catch (Throwable e) {
			e.printStackTrace();
		}

		if(BROWSER.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}else if(BROWSER.equalsIgnoreCase("chrome"))
		{
			//	ChromeOptions chromeOptions=new ChromeOptions();
			//	chromeOptions.setBinary("C:\\Users\\SanjayBabu\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
			//	driver=new ChromeDriver(chromeOptions);
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else {
			driver=new ChromeDriver();
		}

		System.out.println("Browser successfully launched");
		//implicitly wait
		sdriver=driver;
		wLib.waitForPageToLoad(driver);
		//enter the URL of the Application
		sdriver.get(URL);
		//maximize the screen
		driver.manage().window().maximize();
		

	}
	
	
}









//
//
//
///**
// * connecting to database
// */
//@BeforeSuite
//public void dbConfig()
//{
//	dLib.connectToDB();
//}
//
///**
// * close the browser
// */
//@AfterClass
//public void closeTheBrowser()
//{
//	driver.quit();
//	System.out.println("Browser successfully closed");
//}
///**
// * close database configuration
// */
//@AfterSuite
//public void closeDBconfig()
//{
//	dLib.closeDB();
//}
//
//
///**
// * login to application
// */
//@BeforeMethod
//public void loginToAppln()
//{
//	String USERNAME = null;
//	try {
//		USERNAME = fLib.getPropertKeyValue("username");
//	} catch (Throwable e) {
//		e.printStackTrace();
//	}
//	String PASSWORD = null;
//	try {
//		PASSWORD = fLib.getPropertKeyValue("password");
//	} catch (Throwable e) {
//		e.printStackTrace();
//	}

//	LoginPage lpage=new LoginPage(driver);
//	HomePage homePage = new HomePage(driver);
//	homePage.getLoginLink().click();
//	lpage.getEmailTextEdt().sendKeys(USERNAME);
//	lpage.getPasswordTxtEdt().sendKeys(PASSWORD);
//	//lpage.loginToApplication(USERNAME, PASSWORD);
//	lpage.getSubmitBtn().click();
//	System.out.println("Login successful");
//}
///**
// * logout from application
// */
//@AfterMethod
//public void logoutFromAppln()
//{
//	HomePage hpage=new HomePage(driver);
//	//hpage.logout(driver);
//	System.out.println("Logout successful");
//}
//
//
//
//
