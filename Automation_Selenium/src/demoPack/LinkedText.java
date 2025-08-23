package demoPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedText {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://www.youtube.com/results?search_query=rhymes");
		
		d.findElement(By.linkText("Rain Rain Go Away with Zoo Animals + More Lalafun Nursery Rhymes & Kids Songs")).click();
		d.findElement(By.partialLinkText("Lalafun")).click();
		
	}

}
