package javaPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestWebDriverManager {

	@Test
	public void a() {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.paytm.com");
		
		System.out.println("First Change");

	}

}

/*

What is WebDriverManager?

WebDriverManager is a Java library that automates the management of browser drivers. 
It downloads the correct driver version, sets the system path, and eliminates the need for manual driver setup.

*/