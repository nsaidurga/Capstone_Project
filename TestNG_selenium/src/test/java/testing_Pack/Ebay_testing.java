package testing_Pack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import graphql.Assert;

public class Ebay_testing {
	WebDriver d;

	@BeforeTest
	public void beforeTest() throws InterruptedException {
		d = new ChromeDriver();
		d.get("https://www.ebay.com/");
		d.manage().window().maximize();
		Thread.sleep(3000);
	}

	@Test(priority = 3)
	public void search() {
		WebElement search = d.findElement(By.id("gh-ac"));
		search.clear();
		search.sendKeys("Watch");
		search.sendKeys(Keys.ENTER);
		d.navigate().refresh();
	}

	@Test(priority = 1)
	public void search1() {
		WebElement search = d.findElement(By.id("gh-ac"));
		search.clear();
		search.sendKeys("Phone");
		search.sendKeys(Keys.ENTER);
		d.navigate().refresh();
	}

	@Test(priority = 2)
	public void search2() {
		WebElement search = d.findElement(By.id("gh-ac"));
		search.clear();
		search.sendKeys("Bag");
		search.sendKeys(Keys.ENTER);
		d.navigate().refresh();
	}

	@AfterTest
	public void afterTest() {
		Assert.assertTrue(true, "Search button is not working");
		d.close();
	}

}
