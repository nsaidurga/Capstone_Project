package testing_Pack;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

public class Explicit_wait {
	@Test
	public void f() {
//	  WebDriver d=new ChromeDriver();
//	  d.get("http://zero.webappsecurity.com/login.html");
//	  
//	  WebDriverWait wait=new WebDriverWait(d,Duration.ofSeconds(5));
//	  WebElement user=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_login")));
//	  user.sendKeys("username");
//	  d.close();

		WebDriver d;
		d = new ChromeDriver();
		d.get("http://zero.webappsecurity.com/login.html");
		Wait<WebDriver> wait = new FluentWait<WebDriver>(d)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);
		WebElement user=wait.until(new Function<WebDriver,WebElement>(){
			public WebElement apply(WebDriver d) {
				return d.findElement(By.id("user_login"));
			}
		});
		
		d.close();
	}
}
