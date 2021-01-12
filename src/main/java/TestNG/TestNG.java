/*
@BeforeSuite - Setup system property for chrome
@BeforeTest - LaunchBrowser Chrome
@BeforeClass - Login to App
@BeforeMethod - Enter URL
@Test - Google title test
@AfterMethod - Logout from App
@BeforeMethod - Enter URL
@Test - PasteData
@AfterMethod - Logout from App
@BeforeMethod - Enter URL
@Test - SearchTest
@AfterMethod - Logout from App
@AfterClass - Close Browser
@AfterTest - delete Cookies
*/

package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
	//Pre Conditions Annotations
	@BeforeSuite
	public void setup()//1
	{
		System.out.println("Setup system property for chrome");
	}
	@BeforeTest
	public void LaunchBrowse()//2
	{
		System.out.println("LaunchBrowser Chrome"); 
	}
	@BeforeClass
	public void Login()
	{
		System.out.println("Login to App");
	}
	
	@BeforeMethod
	public void EnterURL()
	{
		System.out.println("Enter URL");
	}
	//Test Case Annotation
	@Test
	public void GoogleTitleTest()
	{
		System.out.println("Google title test");
	}
	@Test
	public void SearchTest()
	{
		System.out.println("SearchTest");
	}
	@Test
	public void PasteData()
	{
		System.out.println("PasteData");
	}
	//Post Condition Annotations
	@AfterMethod
	public void Logout()
	{
		System.out.println("Logout from App");
	}
	@AfterTest
	public void deleteCookies()
	{
		System.out.println("delete Cookies");
	}
	@AfterClass
	public void CloseBrowser()
	{
		System.out.println("Close Browser");
	}
	@AfterSuite
	public void GenerateTestReport()
	{
		System.out.println("GenerateTestReport");
	}

}
