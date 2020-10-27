package Pages.AutomationAssignment_UriaBonen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class thankYouPage {
	WebDriver driver3;

	private By ThankYouButton =By.xpath("//*[@class='thankYou__button-avz2fr-9 fIeAdZ']");
	private By backButton =By.xpath("//*[@class='thankYou__backLink-avz2fr-10 bBzcJF']");
	
	public thankYouPage(WebDriver driver3) {
		super();
		this.driver3 = driver3;
	}

	public void backToTheSite() {
		driver3.findElement(ThankYouButton).click();
	}
	
	public void backButton() {
		driver3.findElement(backButton).click();
	}
	
	
	
}
