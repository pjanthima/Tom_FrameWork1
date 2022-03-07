package practice_Automation_Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import drivers.Driver;
import methods.CommonMethods;
import utilities.PropertiesReader;

public class HomePageTC extends CommonMethods {
	private WebDriverWait wait;

	@BeforeMethod
	public void beforeTest() {
//	1) Open the browser
//	2) Enter the URL “http://practice.automationtesting.in/”
		Driver.getDriver();
		wait = new WebDriverWait(Driver.getDriver(), 30);
	}

	@Test(enabled = false)
	public void TC001_threeSlidersOnly() throws InterruptedException {
//	3) Click on Shop Menu
		cp.shopTab.click();
//	4) Now click on Home menu button
		cp.homeTab.click();
//	5) Test whether the Home page has Three Sliders only
		myHPage.arrowButton.click();
		Thread.sleep(2000);// visual purpose
		myHPage.arrowButton.click();
		Thread.sleep(2000);
		myHPage.arrowButton.click();
		Thread.sleep(2000);
//	6) The Home page must contains only three sliders
		int actualNumberOfSlider = Driver.getDriver()
				.findElements(By.xpath(PropertiesReader.getProperty("numberOfSlider"))).size();

		int expectedNumberOfSliders = 3;

		Assert.assertTrue(actualNumberOfSlider == expectedNumberOfSliders, "Please check sliders size");
		System.out.println("TEST PASSED : Number of slider are " + actualNumberOfSlider);
	}

	@Test(enabled = false)
	public void TC002_threeArrivalsOnly() throws InterruptedException {
//	3) Click on Shop Menu
		cp.shopTab.click();
//	4) Now click on Home menu button
		cp.homeTab.click();
//	5) Test whether the Home page has Three Arrivals only
//	6) The Home page must contains only three Arrivals
		scrollDown(700);
		Thread.sleep(3000);// visual purpose
		verifyThreeArrivals();
	}

	@Test(enabled = false)
	public void TC003_imageArrivalsShouldNavigate() throws InterruptedException {
//	3) Click on Shop Menu
		cp.shopTab.click();
//	4) Now click on Home menu button
		cp.homeTab.click();
//	5) Test whether the Home page has Three Arrivals only
//	6) The Home page must contains only three Arrivals
		scrollDown(700);
		Thread.sleep(3000);// visual purpose
		verifyThreeArrivals();
//	7) Now click the image in the Arrivals
		myHPage.imageClickable.click();
//	8) Test whether it is navigating to next page where the user can add that book into his basket.
//	9) Image should be clickable and shoul navigate to next page where user can add that book to his basket
		Assert.assertTrue(myHPage.addToBasketButton.isDisplayed());
		System.out.println("TEST PASSED : " + myHPage.addToBasketButton.getText());

	}

	@Test(enabled = false)
	public void TC004_arrivalsImagesDescription() throws InterruptedException {
//	3) Click on Shop Menu
		cp.shopTab.click();
//	4) Now click on Home menu button
		cp.homeTab.click();
//	5) Test whether the Home page has Three Arrivals only
//	6) The Home page must contains only three Arrivals
		scrollDown(700);
		verifyThreeArrivals();
//	7) Now click the image in the Arrivals
		myHPage.imageClickable.click();
//	8) Test whether it is navigating to next page where the user can add that book into his basket.
//	9) Image should be clickable and shoul navigate to next page where user can add that book to his basket
		Assert.assertTrue(myHPage.addToBasketButton.isDisplayed());
		System.out.println("TEST PASSED : " + myHPage.addToBasketButton.getText());
//	10) Click on Description tab for the book you clicked on.
		scrollDown(700);
		myHPage.reviewTab.click();
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(PropertiesReader.getProperty("descriptionTab"))));

		myHPage.descriptionTab.click();
//	11) There should be a description regarding that book the user clicked on
		Thread.sleep(2000); // visual purpose
		Assert.assertTrue(myHPage.productDescription.isDisplayed());
		System.out.println("TEST PASS : " + myHPage.productDescription.getText());

	}

	@Test(enabled = false)
	public void TC005_arrivalsImagesReview() {
//	3) Click on Shop Menu
		cp.shopTab.click();
//	4) Now click on Home menu button
		cp.homeTab.click();
//	5) Test whether the Home page has Three Arrivals only
//	6) The Home page must contains only three Arrivals
		scrollDown(700);
		verifyThreeArrivals();
//	7) Now click the image in the Arrivals
		myHPage.imageClickable.click();
//	8) Test whether it is navigating to next page where the user can add that book into his basket.
//	9) Image should be clickable and shoul navigate to next page where user can add that book to his basket
		Assert.assertTrue(myHPage.addToBasketButton.isDisplayed());
		System.out.println("TEST PASSED : " + myHPage.addToBasketButton.getText());
		scrollDown(700);
//	10) Now clock on Reviews tab for the book you clicked on.
		myHPage.reviewTab.click();
//	11) There should be a Reviews regarding that book the user clicked on
		Assert.assertTrue(myHPage.productReviews.isDisplayed());
		System.out.println("TEST PASSED : " + myHPage.productReviews.getText());
	}

	public void verifyThreeArrivals() {
		List<WebElement> list = Driver.getDriver()
				.findElements(By.xpath(PropertiesReader.getProperty("numberOfArrivals")));
		int numOfArrivals = list.size();
		int expectedNumOfArrivals = 3;
		Assert.assertTrue(numOfArrivals == expectedNumOfArrivals, "Please verify arrivals size");
		System.out.println("Number of Arrival are " + numOfArrivals);
	}
}
