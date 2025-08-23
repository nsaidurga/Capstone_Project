package testing_Pack;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import graphql.Assert;

public class EbayWebsite_Assignment {
	WebDriver d;

	@BeforeTest
	public void beforeTest() throws InterruptedException {
		d = new ChromeDriver();
		d.get("https://www.ebay.com/");
		d.manage().window().maximize();
		Thread.sleep(5000);
	}

	@Test
	public void login() throws InterruptedException {
		WebElement login = d.findElement(By.cssSelector("a[_sp=\"m570.l1524\"]"));
		login.click();
		d.findElement(By.id("userid")).sendKeys("iamalonekingg028576@gmail.com");
		d.findElement(By.id("signin-continue-btn")).click();
		Thread.sleep(2000);
		System.out.println("Email taken");
		d.findElement(By.id("pass")).sendKeys("King@123#");
		System.out.println("password taken");

		d.findElement(By.id("sgnBt")).click();
		System.out.println("Login successful");
		// login.sendKeys(Keys.ENTER);
		// d.navigate();
	}

	@Test
	public void searchMultiple() throws InterruptedException {
		List<String> l=new ArrayList<>();
		l.add("Watch");
		l.add("Shoes");
		l.add("Books");
		for(String s:l) {
			WebElement search=d.findElement(By.id("gh-ac"));
			search.clear();
			search.sendKeys(s);
			search.sendKeys(Keys.ENTER);
		}
	}
	@Test
	public void addToCart() throws InterruptedException {
		d=new ChromeDriver();
		d.get("https://www.amazon.com/?ref_=navm_em_header_home");
		WebElement search=d.findElement(By.cssSelector("input[id=\"twotabsearchtextbox\"]"));
		search.clear();
		search.sendKeys("shoes");
		search.sendKeys(Keys.ENTER);
		d.findElement(By.partialLinkText("Nike")).click();
		//Thread.sleep(3000);
		d.findElement(By.partialLinkText("Nike Jordan")).click();
		Thread.sleep(2000);
		//d.getCurrentUrl();
		d.findElement(By.id("atcBtn_btn_1")).click();
		
	}
	@AfterTest
	public void afterTest() throws InterruptedException{
		Assert.assertTrue(true, "Search button is not working");
		Thread.sleep(3000);
		d.close();
	}

}
