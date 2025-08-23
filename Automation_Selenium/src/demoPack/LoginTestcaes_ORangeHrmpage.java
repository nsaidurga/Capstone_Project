package demoPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestcaes_ORangeHrmpage {
	public static void login(WebDriver w,String user,String password,String testexecute) throws InterruptedException {
		System.out.println("Manual test--> "+testexecute);
		
		WebElement user1=w.findElement(By.name("username"));
		user1.click();
		user1.sendKeys(user);
		
		WebElement pass=w.findElement(By.name("password"));
		pass.click();
		pass.sendKeys(password);
		
		w.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(3000);
		
		w.navigate().refresh();
		Thread.sleep(2000);
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver w=new ChromeDriver();
		w.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		System.out.println("Welcome to OrangeHRM login page");
		
		login(w,"865645","admin","unable to login");
		login(w,"Admin","7463737337","unable to login");
		login(w,"36527jhfjd","ngdj36356","unable to login");
		login(w,"","","unable to login");
		login(w,"sai1422","3535sfadst@a","unable to login");
		login(w,"Admin","admin123","login successful");
		w.close();
	}

}
