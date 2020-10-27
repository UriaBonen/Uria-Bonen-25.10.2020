package TestCases;

import static org.testng.Assert.assertThrows;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import Pages.AutomationAssignment_UriaBonen.HomePage;
import Pages.AutomationAssignment_UriaBonen.*;
public class contactForCompanies {

	@Test
	public void sendProperContacting() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\eclipse\\Selenium\\chromeDriver_\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://automation.herolo.co.il/");
		driver.manage().window().maximize();
		contactingCompanies contaCompanies =new contactingCompanies(driver);
		contaCompanies.enterProperValues("test","test@test.co.il","0506123456","HEROLO");	
		contaCompanies.clickOnSendButton();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);				
		contaCompanies.isThankYouPage();
		driver.close();
		
		
		
	}

	@Test
	public void sendInvalidContacting() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\eclipse\\Selenium\\chromeDriver_\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://automation.herolo.co.il/");
		driver.manage().window().maximize();
		contactingCompanies contaCompanies =new contactingCompanies(driver);
		contaCompanies.enterProperValues("test","test@test.co.","05061","HEROLO");	
		contaCompanies.clickOnSendButton();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);				
		driver.close();
	}


}
