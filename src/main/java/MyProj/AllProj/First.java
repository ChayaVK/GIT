package MyProj.AllProj;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Chaya/Downloads/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement TdyDeal = driver.findElement(By.linkText("Today's Deals"));
		TdyDeal.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		WebElement Chk = driver.findElement(By.className("a-label a-checkbox-label"));
		Chk.click();
	}

}
