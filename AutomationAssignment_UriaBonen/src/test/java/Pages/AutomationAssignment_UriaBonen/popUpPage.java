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
	private By sendButton =By.xpath("//*[@class='onUnloadPopup__Button-v34ylr-19 cUxvnt']");


	public popUpPage(WebDriver driver4) {
		super();
		this.driver4 = driver4;
	}

	public void sendProperContact() throws InterruptedException {
		driver4.findElement(By.xpath("//*[@class='callUsWhatsapp__BtnWhatsapp-rkzbui-0 cjunrQ']")).click();
		ArrayList<String> tabs2 = new ArrayList<String> (driver4.getWindowHandles());
		driver4.switchTo().window(tabs2.get(1));
		driver4.get("https://www.google.co.il/");
		driver4.findElement(By.name("q")).sendKeys("blabla");
		Thread.sleep(20000);
		driver4.switchTo().window(tabs2.get(0));
		driver4.findElement(name).sendKeys("Test");
		driver4.findElement(email).sendKeys("test@test.co.il");
		driver4.findElement(phone).sendKeys("0506123456");
		driver4.findElement(sendButton).click();
	}

}
