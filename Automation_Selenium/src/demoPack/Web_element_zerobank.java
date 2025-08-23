package demoPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_element_zerobank {
	public static void loginStep(WebDriver d,String user1,String pass1,String testexecution) throws InterruptedException {
		System.out.println("Manual Test-->"+testexecution);
		WebElement user=d.findElement(By.id("user_login"));
		user.sendKeys(user1);
		
		WebElement pass=d.findElement(By.id("user_password"));
		//pass.click();
		pass.sendKeys(pass1);
		
		d.findElement(By.name("submit")).click();
		Thread.sleep(5000);
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/login.html");
		System.out.println("Welcome to Zero bank Login page");
		
		loginStep(driver,"45635","password","unable to login");
		loginStep(driver,"username","837364","unable to login");
		loginStep(driver,"Saidurgannnn","Sai#sai123325","unable to login");
		loginStep(driver,"653$saidurga","hdgsh12345","unable to login");
		loginStep(driver,"","","unable to login");
		loginStep(driver,"username","password","able to login");
		driver.close();
	}

}
