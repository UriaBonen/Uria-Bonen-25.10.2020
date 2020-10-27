package TestCases;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Pages.AutomationAssignment_UriaBonen.popUpPage;

public class popUpPage_testCases {

	@Test
	public void sendProperContact() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\eclipse\\Selenium\\chromeDriver_\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://automation.herolo.co.il/");
		driver.manage().window().maximize();
		popUpPage pUpPage =new popUpPage(driver);
		pUpPage.sendProperContact();
    	driver.close();
	}
}



