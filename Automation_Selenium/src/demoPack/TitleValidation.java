package demoPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleValidation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://www.selenium.dev");
		
		String expectedtitle="Selenium";
		String actualtitle=d.getTitle();
		
		System.out.println("Expected Title: "+expectedtitle);
		System.out.println("Actual Title: "+actualtitle);
		
		d.manage().window().maximize();
		Thread.sleep(500);
		
		if(expectedtitle.equals(actualtitle)) {
			System.out.println("Title validation successful");
		}
		else {
			System.out.println("Title validation fail");
		}
		System.out.println("Page load successfully");
		d.close();
	}

}
