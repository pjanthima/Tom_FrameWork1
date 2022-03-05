package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import drivers.Driver;

public class HomePage {
	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "//div[@id='n2-ss-6-arrow-next']")
	public WebElement arrowButton;
}
