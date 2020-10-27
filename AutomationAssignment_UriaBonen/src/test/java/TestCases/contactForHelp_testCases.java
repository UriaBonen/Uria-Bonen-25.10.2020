package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pages.AutomationAssignment_UriaBonen.contactForHelpPage;
import Pages.AutomationAssignment_UriaBonen.contactingCompanies;

public class contactForHelp_testCases {
	
	@Test
	public void sendProperContacting() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\eclipse\\Selenium\\chromeDriver_\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://automation.herolo.co.il/");
		driver.manage().window().maximize();
		contactForHelpPage conForHelp=new contactForHelpPage(driver);
		conForHelp.enterProperValues("a","a@a.co.il", "0506712354");
		conForHelp.clickOnSendButton();	
		conForHelp.isThankYouPage();
	}

	@Test
	public void sendInvalidContacting() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\eclipse\\Selenium\\chromeDriver_\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://automation.herolo.co.il/");
		driver.manage().window().maximize();
		contactForHelpPage conForHelp=new contactForHelpPage(driver);
		conForHelp.enterProperValues("test","test@test.co.","05061");	
		conForHelp.clickOnSendButton();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);				
		driver.close();
	}


}
