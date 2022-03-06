package practice_Automation_Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import drivers.Driver;
import methods.CommonMethods;
import utilities.PropertiesReader;

public class HomePageTC extends CommonMethods {
	@BeforeMethod
	public void beforeTest() {
//	1) Open the browser
//	2) Enter the URL “http://practice.automationtesting.in/”
		Driver.getDriver();
	}

	@Test(enabled = false)
	public void threeSlidersOnly() throws InterruptedException {
//	3) Click on Shop Menu
		cp.shopTab.click();
//	4) Now click on Home menu button
		cp.homeTab.click();
//	5) Test whether the Home page has Three Sliders only
		myHPage.arrowButton.click();
		Thread.sleep(2000);
		myHPage.arrowButton.click();
		Thread.sleep(2000);
		myHPage.arrowButton.click();
		Thread.sleep(2000);
//	6) The Home page must contains only three sliders
		List<WebElement> numOfSliders = Driver.getDriver()
				.findElements(By.xpath(PropertiesReader.getProperty("numberOfSlider")));
		int actualNumOfSlider = numOfSliders.size();
		System.out.println("Number of slider are " + actualNumOfSlider);
		Assert.assertTrue(actualNumOfSlider == 3, "Please check sliders size");

	}

	@Test
	public void threeArrivalsOnly() throws InterruptedException {
//	3) Click on Shop Menu
		cp.shopTab.click();
//	4) Now click on Home menu button
		cp.homeTab.click();
//	5) Test whether the Home page has Three Arrivals only
		scrollDown(700);
		Thread.sleep(3000);
//	6) The Home page must contains only three Arrivals
		List<WebElement> list = Driver.getDriver()
				.findElements(By.xpath(PropertiesReader.getProperty("numberOfArrivals")));
		int numOfArrivals = list.size();
		System.out.println("Number of Arrival are " + numOfArrivals);
		Assert.assertTrue(numOfArrivals == 3, "Please verify arrivals size");
	}
}
