package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class browserDemo {

	@Test
	public void broserInit()
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Assert.assertTrue(true);
		

	}

}
