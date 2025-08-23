package demoPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("This is my first application");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\sai durga\\OneDrive\\Desktop\\Selenium_java\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		try {
		d.get("https://www.youtube.com/");
		d.manage().window().maximize();
		Thread.sleep(500);
		
		d.close();
		
		}catch(Exception e) {
			System.out.println("Unable to open Url "+e);
		}
	}

}
/*
String expectedurl="https://www.youtube.com/";
String actualurl="https://www.youtube.com/";
if(expectedurl.equals(actualurl)) {
	System.out.println();
}System.out.println("Page load succeddfully");*/