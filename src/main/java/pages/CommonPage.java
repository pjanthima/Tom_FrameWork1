package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import drivers.Driver;

public class CommonPage {
	public CommonPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "//li[@id='menu-item-40']/a")
	public WebElement shopTab;
	@FindBy(xpath = "//li[@id='menu-item-50']/a")
	public WebElement myAccountTab;
	@FindBy(xpath = "//nav[@class='woocommerce-breadcrumb']/a")
	public WebElement homeTab;

}
