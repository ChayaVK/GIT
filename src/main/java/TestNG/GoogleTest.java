package TestNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

public class GoogleTest {
	WebDriver driver;
	@BeforeMethod
	public void setup()//1
	{
		System.out.println("Setup system property for chrome");
	}

}
