package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.AutomationAssignment_UriaBonen.HomePage;

public class WhatsAppButton  {

	@Test
	public void clickOnWhatsAppButton() {
		System.setProperty("webdriver.chrome.driver","C:\\eclipse\\Selenium\\chromeDriver_\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://automation.herolo.co.il/");
		driver.manage().window().maximize();

		HomePage homePage=new HomePage(driver);
		homePage.clickOnWhatsAppButton();
	}

	@Test
	public void whatsAppIconeIsStuck() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\eclipse\\Selenium\\chromeDriver_\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://automation.herolo.co.il/");
		driver.manage().window().maximize();
		HomePage homePage=new HomePage(driver);
		homePage.whatsAppIconIsStuck();
	}

}
