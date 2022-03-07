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
	@FindBy(xpath = "//div[@id='text-22-sub_row_1-0-2-2-0']/div/ul/li/a/img")
	public WebElement imageClickable;
	@FindBy(xpath = "//form[@class='cart']/button")
	public WebElement addToBasketButton;
	@FindBy(xpath = "//div[@id=\"content\"]/div[1]")
	public WebElement addBasketMessage;
	@FindBy(xpath = "//li[@class='reviews_tab']")
	public WebElement reviewTab;
	@FindBy(xpath = "//li[@class='description_tab']")
	public WebElement descriptionTab;
	@FindBy(xpath = "//div[@id='tab-description']")
	public WebElement productDescription;
	@FindBy(xpath = "//div[@id='comments']")
	public WebElement productReviews;

}
