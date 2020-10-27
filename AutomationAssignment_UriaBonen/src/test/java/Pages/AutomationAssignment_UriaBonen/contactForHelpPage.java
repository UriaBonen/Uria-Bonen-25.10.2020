package Pages.AutomationAssignment_UriaBonen;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class contactForHelpPage {
	WebDriver driver5;
	private By _name =By.name("name");
	private By _email =By.name("email");
	private By _phone =By.name("phone");
	private By sendButton=By.xpath("//*[@class='Footer__Button-sc-159s1ql-7 kOOAFW']");

	public contactForHelpPage(WebDriver driver5) {
		super();
		this.driver5 = driver5;
	}

	public void enterProperValues(String name, String email, String telephone) throws Exception {
		WebElement wb= driver5.findElement(By.id("footer"));
		wb.findElement(_name).sendKeys(name);
		wb.findElement(_email).sendKeys(email);
		wb.findElement(_phone).sendKeys(telephone);
		int numOfInvalid=wb.findElements(By.xpath("//*[@class='commun__ErrorText-zi6nvq-6 bDkbFh']")).size();
		if(numOfInvalid>0)  throw new Exception("There are invalid values");

	}

	public void clickOnSendButton() {
		driver5.findElement(sendButton).click();
	}

	public void isThankYouPage() throws InterruptedException {
		Thread.sleep(4000);
		boolean isThankYouPage=driver5.findElement(By.xpath("//*[@class='thankYou__button-avz2fr-9 fIeAdZ']")).isDisplayed();
		assertTrue(isThankYouPage);
	}


}
