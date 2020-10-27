package Pages.AutomationAssignment_UriaBonen;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class contactingCompanies {
	WebDriver driver2;

	public contactingCompanies(WebDriver driver2) {
		super();
		this.driver2 = driver2;
	}

	private By _name =By.id("name");
	private By _email =By.id("email");
	private By _phone =By.id("telephone");
	private By _company =By.id("company");
	private By sendButton=By.xpath("//*[@class='commun__Button-zi6nvq-0 commun__ButtonContact-zi6nvq-1 form__ButtonContact-y0ft28-1 llCdxe']");


	public void enterProperValues(String name, String email, String telephone, String company) throws Exception {
		WebElement wb= driver2.findElement(By.id("section-inputs"));
		wb.findElement(_name).sendKeys(name);
		wb.findElement(_email).sendKeys(email);
		wb.findElement(_phone).sendKeys(telephone);
		wb.findElement(_company).sendKeys(company);
		int numOfInvalid=wb.findElements(By.xpath("//*[@class='commun__ErrorText-zi6nvq-6 bDkbFh']")).size();
		if(numOfInvalid>0)  throw new Exception("There are invalid values");

	}

	public void clickOnSendButton() {
		driver2.findElement(sendButton).click();
	}

	public void isThankYouPage() throws InterruptedException {
		Thread.sleep(4000);
		boolean isThankYouPage=driver2.findElement(By.xpath("//*[@class='thankYou__button-avz2fr-9 fIeAdZ']")).isDisplayed();
		assertTrue(isThankYouPage);
	}

}
