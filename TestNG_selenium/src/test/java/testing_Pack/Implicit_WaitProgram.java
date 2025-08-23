package testing_Pack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;

public class Implicit_WaitProgram {
	WebDriver d;

	@BeforeTest
	public void implicitwait() {
		d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	public void openpage() {
		d.get("https://www.flipkart.com/");
		d.manage().window().maximize();
		String expectedtitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		String actualtitle = d.getTitle();
		Assert.assertEquals(actualtitle, expectedtitle, "Title validation fail");
		
		WebElement search=d.findElement(By.name("q"));
		search.sendKeys("Watch");
		search.sendKeys(Keys.ENTER);
		System.out.println("Search button available");
		
//		WebElement add=d.findElement(By.name("gf"));
//		add.click();
		d.close();
	}


}
