package demoPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrlValidation {

	public static void main(String[] args) throws InterruptedException {		
		WebDriver d=new ChromeDriver();
		d.get("https://www.selenium.dev");
		
		String expectedurl="https://www.selenium";
		String actualurl=d.getCurrentUrl();
		
		System.out.println("Expected URL: "+expectedurl);
		System.out.println("Actual URL: "+actualurl);
		
		d.manage().window().maximize();
		Thread.sleep(500);
		
		if(expectedurl.equals(actualurl)) {
			System.out.println("Url validation successful");
		}
		else {
			System.out.println("Url validation fail");
		}
		System.out.println("Page load successfully");
		d.close();
	}

}
