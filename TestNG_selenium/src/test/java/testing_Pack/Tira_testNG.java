package testing_Pack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Tira_testNG {
	WebDriver d;
	@BeforeClass
	public void beforeTest() {
		d = new ChromeDriver();
		d.manage().window().maximize();
		//d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.get("https://www.tirabeauty.com/");
		System.out.println("Opened tira");		
	}

	@Test
	public void brands() throws InterruptedException {
		
		//d.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div/div[1]/div[1]/div[1]/a")).click();
	/*	//d.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[1]/div")).click();
		//tiraloves
		d.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div[2]/img")).click();
		d.findElement(By.xpath("//*[@id=\"1imageCarousel\"]/div/div[2]/div/div[2]/div[2]/a/picture/img")).click();
		d.findElement(By.xpath("//*[@id=\"Formulation\"]/div/div[1]/div/span")).click();
		JavascriptExecutor js = (JavascriptExecutor) d;
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(2000);
		d.findElement(By.xpath("/html/body/div[1]/div/div/div[4]/div/div/div[5]/div[2]/div/div[1]/div[2]/div/div[8]/div/div[2]/div/ul/li[1]/a/div/div[2]")).click();
		JavascriptExecutor js1 = (JavascriptExecutor) d;
		js1.executeScript("window.scrollBy(0,400)");
		Thread.sleep(2000);
		d.findElement(By.partialLinkText("Lakme Xtraordin-airy Mattereal Mousse Foundation Matte Finish Has SPF8 - 04 Golden Light (25 g)")).click();
	*/
		/*
		//top brands
		Thread.sleep(2000);
		d.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div")).click();
		d.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div[3]/img")).click();
		d.findElement(By.partialLinkText("COSRX Advanced Snail 96 Mucin Power Essence (100ml)")).click();
		*/
		
		//newly added brands
		//Thread.sleep(2000);
		/* d.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[3]/div")).click();
		d.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div[7]/img")).click();
		d.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[4]/div/div/div[4]/div[2]/div[3]/a/div")).click();
		JavascriptExecutor js2 = (JavascriptExecutor) d;
		js2.executeScript("window.scrollBy(0,400)");
		Thread.sleep(2000);
		d.findElement(By.partialLinkText("La Mer The Eye Concentrate (15 ml)")).click();
		*/
		
		//featured brands
		/*
		Thread.sleep(2000);
		d.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[4]/div")).click();
		d.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div[9]/img")).click();
		*/
		
		//tira red
		/*
		Thread.sleep(1000);
		d.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[5]/div")).click();
		d.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div[10]/img")).click();
		Thread.sleep(4000);
		JavascriptExecutor js3 = (JavascriptExecutor) d;
		js3.executeScript("window.scrollBy(0,400)");
		Thread.sleep(3000);
		js3.executeScript("window.scrollBy(0,700)");
		Thread.sleep(3000);
		js3.executeScript("window.scrollBy(0,900)"); */
		
		//homegrown
		/*
		Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[6]/div")).click();
		d.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div[9]/img")).click();
		Thread.sleep(3000);
		JavascriptExecutor js4 = (JavascriptExecutor) d;
		js4.executeScript("window.scrollBy(0,400)");
		Thread.sleep(3000);
		js4.executeScript("window.scrollBy(0,700)");
		Thread.sleep(3000);
		js4.executeScript("window.scrollBy(0,900)");
		*/
		
		//Tira red 
		/*
		Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div/div[1]/div[2]/div/a")).click();

		for (int i = 0; i < 8; i++) {
		    ((JavascriptExecutor) d).executeScript("window.scrollBy(0, 500);");
		    Thread.sleep(1000);
		}
		Thread.sleep(3000);
		
		d.findElement(By.xpath("//*[@id=\"1dynamicBlockFrames\"]/div/div/div[2]/div/div[2]/div[3]/a/div/div[2]/p")).click();
		
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div/div[1]/div[2]/div/a")).click();
		for (int i = 0; i < 1; i++) {
		    ((JavascriptExecutor) d).executeScript("window.scrollBy(0, 600);");
		    Thread.sleep(1000);
		}
		d.findElement(By.xpath("//*[@id=\"1imageCarousel\"]/div/div[2]/div/div[2]/div[2]/a/picture/img")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//*[@id=\"vs2__combobox\"]/div[1]/span/div/span")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//*[@id=\"vs2__listbox\"]")).click(); 
		for (int i = 0; i < 7; i++) {
		    ((JavascriptExecutor) d).executeScript("window.scrollBy(0, 600);");
		    Thread.sleep(1000);
		}
		*/
		
		//offers
		/*
		d.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div/div[1]/div[3]/div/a")).click();
		for (int i = 0; i < 3; i++) {
		    ((JavascriptExecutor) d).executeScript("window.scrollBy(0, 600);");
		    Thread.sleep(1000);
		}
		d.findElement(By.xpath("//*[@id=\"1dynamicBlockFrames\"]/div/div/div[2]/div/div[2]/div[2]/a/div/div[1]/div/div[2]/picture/img")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//*[@id=\"vs2__combobox\"]/div[1]/span/div/span")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//*[@id=\"vs2__listbox\"]")).click(); 
		for (int i = 0; i < 7; i++) {
		    ((JavascriptExecutor) d).executeScript("window.scrollBy(0, 600);");
		    Thread.sleep(1000);
		}
		
		Thread.sleep(5000);
		d.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div/div[1]/div[3]/div/a")).click();
		for (int i = 0; i < 7; i++) {
		    ((JavascriptExecutor) d).executeScript("window.scrollBy(0, 600);");
		    Thread.sleep(1000);
		}
		d.findElement(By.xpath("//*[@id=\"3imageCarousel\"]/div/div[2]/div/div[2]/div[2]/a/picture/img")).click();
		
		Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"vs2__combobox\"]/div[1]/span/div/span")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//*[@id=\"vs2__listbox\"]")).click();
		for (int i = 0; i < 10; i++) {
		    ((JavascriptExecutor) d).executeScript("window.scrollBy(0, 600);");
		    Thread.sleep(1000);
		}
		*/
		
		//top shelf
		/*
		d.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div/div[1]/div[4]/div/a")).click();
		for (int i = 0; i < 5; i++) {
		    ((JavascriptExecutor) d).executeScript("window.scrollBy(0, 600);");
		    Thread.sleep(1000);
		}
		Thread.sleep(2000);
		d.findElement(By.xpath("//*[@id=\"tira-loves\"]/span[1]")).click();
		for (int i = 0; i < 5; i++) {
		    ((JavascriptExecutor) d).executeScript("window.scrollBy(0, 600);");
		    Thread.sleep(1000);
		}
		d.findElement(By.xpath("//*[@id=\"whats-been-up\"]/span[1]")).click();
		for (int i = 0; i < 5; i++) {
		    ((JavascriptExecutor) d).executeScript("window.scrollBy(0, 600);");
		    Thread.sleep(1000);
		}
		d.findElement(By.xpath("//*[@id=\"beauty-front-benchers\"]/span[1]")).click();
		for (int i = 0; i < 5; i++) {
		    ((JavascriptExecutor) d).executeScript("window.scrollBy(0, 600);");
		    Thread.sleep(1000);
		}
		d.findElement(By.xpath("//*[@id=\"powder-room\"]/span[1]")).click();
		for (int i = 0; i < 5; i++) {
		    ((JavascriptExecutor) d).executeScript("window.scrollBy(0, 600);");
		    Thread.sleep(1000);
		}
		d.findElement(By.xpath("//*[@id=\"rituals\"]/span[1]")).click();
		for (int i = 0; i < 5; i++) {
		    ((JavascriptExecutor) d).executeScript("window.scrollBy(0, 600);");
		    Thread.sleep(1000);
		}
		d.findElement(By.xpath("//*[@id=\"ingredient-lab\"]/span[1]")).click();
		for (int i = 0; i < 5; i++) {
		    ((JavascriptExecutor) d).executeScript("window.scrollBy(0, 600);");
		    Thread.sleep(1000);
		}
		d.findElement(By.xpath("//*[@id=\"bookmark\"]/span[1]")).click();
		*/
		
		//for you
		/*
		d.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div/div[1]/div[5]/div/a")).click();
		for (int i = 0; i < 2; i++) {
		    ((JavascriptExecutor) d).executeScript("window.scrollBy(0, 600);");
		    Thread.sleep(3000);
		}
		Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"1imageCarousel\"]/div/div[2]/div/div[2]/div[2]/a/picture/img")).click();
		for (int i = 0; i < 9; i++) {
		    ((JavascriptExecutor) d).executeScript("window.scrollBy(0, 600);");
		    Thread.sleep(1000);
		}
		*/
		
		//search
		d.findElement(By.id("search")).click();
		
		d.findElement(By.id("search")).sendKeys("men body creams");
		Thread.sleep(3000);
		d.findElement(By.id("search")).sendKeys(Keys.ENTER);
	}

	@AfterClass
	public void afterTest() throws InterruptedException {
		Thread.sleep(10000);
		d.close();
	}

}
