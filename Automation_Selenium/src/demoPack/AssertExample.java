package demoPack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.Assert;

public class AssertExample {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://www.ebay.com/");
		Thread.sleep(5000);
		d.manage().window().maximize();
		
		//WebElement search=d.findElement(By.id("gh-ac"));
		Assert.assertTrue(true, "No, search button is not available on page");
		
		WebElement search1=d.findElement(By.id("gh-ac"));
		search1.sendKeys("Watch");
		search1.sendKeys(Keys.ENTER);
	}

}
