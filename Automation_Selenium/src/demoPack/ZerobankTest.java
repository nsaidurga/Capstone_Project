package demoPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZerobankTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("http://zero.webappsecurity.com/login.html");
		System.out.println("Welcome to Zero bank Login page");
		{
			System.out.println("Manual test::-->Check user is unable to login with" + "invalid username and valid password");
		}
		//locating username text field
		d.navigate();
		d.findElement(By.id("user_login")).click();
		d.findElement(By.id("user_login")).sendKeys("252415");
		//locating password text field
		d.findElement(By.id("user_password")).click();
		d.findElement(By.id("user_password")).sendKeys("password");
		
		//click on sign in button
		d.findElement(By.name("submit")).click();
		Thread.sleep(5000);
		System.out.println("Login unsuccessfull");
		
		
		{
			System.out.println("Manual test::-->Check user is unable to login with" + "valid username and invalid password");
		}
		//locating username text field
		d.findElement(By.id("user_login")).click();
		d.findElement(By.id("user_login")).sendKeys("saidurga");
		//locating password text field
		d.findElement(By.id("user_password")).click();
		d.findElement(By.id("user_password")).sendKeys("1423425242");
		
		//click on sign in button
		d.findElement(By.name("submit")).click();
		Thread.sleep(6000);
		System.out.println("Login unsuccessfull");
		
		
		{
			System.out.println("Manual test::-->Check user is unable to login with" + 
								"invalid username and valid password");
		}
		//locating username text field
		d.findElement(By.id("user_login")).click();
		d.findElement(By.id("user_login")).sendKeys("@adsfh4132");
		//locating password text field
		d.findElement(By.id("user_password")).click();
		d.findElement(By.id("user_password")).sendKeys("Sai@12fsda");
		
		//click on sign in button
		d.findElement(By.name("submit")).click();
		Thread.sleep(6000);
		System.out.println("Login unsuccessfull");
		
		
		{
			System.out.println("Manual test::-->Check user is unable to login with" + 
								"invalid username and invalid password");
		}
		//locating username text field
		d.findElement(By.id("user_login")).click();
		d.findElement(By.id("user_login")).sendKeys("");
		//locating password text field
		d.findElement(By.id("user_password")).click();
		d.findElement(By.id("user_password")).sendKeys("");
		
		//click on sign in button
		d.findElement(By.name("submit")).click();
		Thread.sleep(6000);
		System.out.println("Login unsuccessfull");
		
		
		{
			System.out.println("Manual test::-->Check user is able to login with" + 
								"valid username and valid password");
		}
		//locating username text field
		d.findElement(By.id("user_login")).click();
		d.findElement(By.id("user_login")).sendKeys("username");
		//locating password text field
		d.findElement(By.id("user_password")).click();
		d.findElement(By.id("user_password")).sendKeys("password");
		
		//click on sign in button
		d.findElement(By.name("submit")).click();
		Thread.sleep(6000);
		System.out.println("Login unsuccessfull");
		
		d.close();
	}

}
