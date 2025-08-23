package testing_Pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import org.testng.Assert;

public class Cross_testing {
	WebDriver d;
	
	@Test
	  public void chromebrowser() throws InterruptedException {
		  d=new ChromeDriver();
		  d.get("https://www.flipkart.com/");
		  String expectedtitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		  String actualtitle=d.getTitle();
		  Assert.assertEquals(actualtitle,expectedtitle,"Title validation fail");
		  Thread.sleep(3000);
	  }
	
	 @Test
	  public void firefoxbrowser() throws InterruptedException {
		  d=new FirefoxDriver();
		  d.get("https://www.flipkart.com/");
		  String expectedtitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		  String actualtitle=d.getTitle();
		  Assert.assertEquals(actualtitle,expectedtitle,"Title validation fail");
		  Thread.sleep(3000);
	  }
	
	@Test
	public void edgebrowser() throws InterruptedException {
		System.setProperty("webdriver.edge.driver","C:\\Users\\sai durga\\OneDrive\\Desktop\\Selenium_java\\edgedriver_win64\\msedgedriver.exe");
		d = new EdgeDriver();
		d.get("https://www.flipkart.com/");
		d.manage().window().maximize();
		String expectedtitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		String actualtitle = d.getTitle();
		Assert.assertEquals(actualtitle, expectedtitle, "Title validation fail");
		Thread.sleep(3000);
	}

//	@BeforeTest
//	public void beforeTest() {
//	}
//
//	@AfterTest
//	public void afterTest() {
//		//Assert.assertTrue(false);
//	}

}
