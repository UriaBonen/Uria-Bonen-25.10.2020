package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pages.AutomationAssignment_UriaBonen.HomePage;
import Pages.AutomationAssignment_UriaBonen.thankYouPage;

public class ThankYouPages_testCases {

	@Test
	public void clickOnBankButton() {
		System.setProperty("webdriver.chrome.driver","C:\\eclipse\\Selenium\\chromeDriver_\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://automation.herolo.co.il/thank-you/");
		driver.manage().window().maximize();
		thankYouPage thankYou=new thankYouPage(driver);
		thankYou.backButton();
	}

	public void clickOnBankToTheSiteButton() {
		System.setProperty("webdriver.chrome.driver","C:\\eclipse\\Selenium\\chromeDriver_\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://automation.herolo.co.il/thank-you/");
		driver.manage().window().maximize();
		thankYouPage thankYou=new thankYouPage(driver);
		thankYou.backButton();
	}
	
}
