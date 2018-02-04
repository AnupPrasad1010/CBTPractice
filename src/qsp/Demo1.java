package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo1 {

		@Test
		public void testA()
		{
			System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.quit();
		}
}
