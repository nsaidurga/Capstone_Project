package demoPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	
	public static void login(WebDriver w,String username,String password,String status) throws InterruptedException {
		WebElement u=w.findElement(By.id("user-name"));
		u.click();
		u.sendKeys(username);
		
		WebElement p=w.findElement(By.id("password"));
		p.click();
		p.sendKeys(password);
		
		w.findElement(By.id("login-button")).click();
		w.navigate().refresh();
		//Thread.sleep(4000);
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver w=new ChromeDriver();
		w.get("https://www.saucedemo.com/");
		w.manage().window().maximize();
		Thread.sleep(4000);
		System.out.println("Welcome to login page");
		
		login(w,"35262","password","unable to login");
		login(w,"Admin2421","7463737337","unable to login");
		login(w,"36527","ngdj36356","unable to login");
		login(w,"","","unable to login");
		login(w,"username","password","unable to login");
		login(w,"standard_user","secret_sauce","login successful");
//		w.close();
	}

}
