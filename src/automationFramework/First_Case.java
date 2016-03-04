package automationFramework;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;

public class First_Case {
	
	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		driver.close();
	}

}
