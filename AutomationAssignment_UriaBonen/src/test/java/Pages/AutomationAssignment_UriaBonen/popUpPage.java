package Pages.AutomationAssignment_UriaBonen;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class popUpPage {
	WebDriver driver4;
	private By name =By.xpath("//*[@class='onUnloadPopup__InputDiv-v34ylr-14 icGXdP']");
	private By email =By.xpath("//*[@class='onUnloadPopup__Input-v34ylr-18 kCHUMm']");
	private By phone =By.xpath("//*[@class='onUnloadPopup__Input-v34ylr-18 kCHUMm']");
	private By whatsAppButton =By.xpath("//*[@class='callUsWhatsapp__BtnWhatsapp-rkzbui-0 cjunrQ']");


	public popUpPage(WebDriver driver4) {
		super();
		this.driver4 = driver4;
	}

	public void sendProperContact() throws InterruptedException {
		driver4.findElement(name).sendKeys("anl");
		driver4.findElement(email).sendKeys("anl");
		driver4.findElement(phone).sendKeys("anl");

		//onUnloadPopup__Button-v34ylr-19 cUxvnt
	}

}
