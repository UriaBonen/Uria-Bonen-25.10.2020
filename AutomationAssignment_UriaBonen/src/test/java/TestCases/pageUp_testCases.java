package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pages.AutomationAssignment_UriaBonen.HomePage;

public class pageUp_testCases {
	
	@Test
	public void pageUpButtonCheck() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\eclipse\\Selenium\\chromeDriver_\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://automation.herolo.co.il");
		driver.manage().window().maximize();
		HomePage hp=new HomePage(driver);
		hp.clickOnPageUpButton();
	    driver.close();
	}

	
	

}
