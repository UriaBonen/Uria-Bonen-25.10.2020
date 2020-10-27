package Pages.AutomationAssignment_UriaBonen;

import java.util.ArrayList;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HomePage {


	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	WebDriver driver;
	private By sendButton =By.xpath("//*[@class='Footer__Button-sc-159s1ql-7 kOOAFW']");
	private By whatsAppButton =By.xpath("//*[@class='callUsWhatsapp__BtnWhatsapp-rkzbui-0 cjunrQ']");
	private String whatsAppURL="https://api.whatsapp.com/send?phone=972544945333";
	private By pageUpButton =By.xpath("//*[@class='backToTop__BtnGoUp-z83xj1-0 huPgzm']");

	public void clickOnWhatsAppButton() {
		driver.findElement(whatsAppButton).click();
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		boolean isURLCorrect=false;
		if( driver.getCurrentUrl().equals("https://api.whatsapp.com/send?phone=972544945333")) isURLCorrect=true;
		Assert.assertTrue(isURLCorrect);
		driver.close();
		driver.switchTo().window(tabs2.get(0));
		driver.close();
	}

	public void whatsAppIconIsStuck() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(4000);
		int i=0;
		while(i<=6) {
			boolean isWhatsAppIconExist=driver.findElement(By.xpath("//*[@class='callUsWhatsapp__BtnWhatsapp-rkzbui-0 cjunrQ']")).isDisplayed();
			Assert.assertTrue(isWhatsAppIconExist);
			js.executeScript("window.scrollBy(0,600)");
			Thread.sleep(2000);
			i++;
		}
		driver.close();
	}

	public void clickOnPageUpButton() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		boolean isPageUpDispalyed=false;
		while(isPageUpDispalyed==false) {
			try {
				isPageUpDispalyed=driver.findElement(pageUpButton).isDisplayed();
			}
			catch(NoSuchElementException ignord){
				js.executeScript("window.scrollBy(0,600)");
			}
		}
		driver.findElement(pageUpButton).click();	
	}
}
