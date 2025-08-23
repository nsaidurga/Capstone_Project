package demoPack;

import java.io.File;
import java.io.IOException;
import java.nio.file.StandardCopyOption;
import java.nio.file.Files;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class StudentForm {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver d = new ChromeDriver();
		d.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(500);
		
		d.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript("window.scrollBy(0,400)");

		WebElement fname = d.findElement(By.id("firstName"));
		fname.sendKeys("Sai");
		WebElement lname = d.findElement(By.id("lastName"));
		lname.sendKeys("Durga");

		WebElement email = d.findElement(By.id("userEmail"));
		email.sendKeys("saihds353@gmail.com");

		d.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")).click();
		
		js.executeScript("window.scrollBy(0,700)");
		
		WebElement phone = d.findElement(By.id("userNumber"));
		phone.sendKeys("9635626262");

//		WebElement dob = d.findElement(By.id("dateOfBirthInput"));
//		phone.sendKeys("11/08/2025");

		// date of birth - year
		d.findElement(By.id("dateOfBirthInput")).click();
		WebElement year = d.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"));
		Select s = new Select(year);
		//s.selectByIndex(125);
		 s.selectByValue("2025");
		//s.selectByVisibleText("2025");
		 
		// month
		WebElement month = d.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"));
		Select s1 = new Select(month);
//		s1.selectByIndex(4);
		s1.selectByValue("9");
		//s1.selectByVisibleText("February");

		// for day or date
		d.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[2]")).click();

//		WebElement subjects = d.findElement(By.id("subjectsInput"));
//		subjects.sendKeys("Maths");
//		subjects.sendKeys(Keys.ENTER);
//		subjects.sendKeys("Phy");
//		subjects.sendKeys(Keys.ENTER);
//		subjects.sendKeys("co");
//		subjects.sendKeys(Keys.ARROW_DOWN);
//		subjects.sendKeys(Keys.ENTER);
		
		//subject
		String[] subs= {"Math","phy","Eco", "Eng"};
		WebElement sub=d.findElement(By.id("subjectsInput"));
		for(String su:subs) {
			sub.sendKeys(su);
			sub.sendKeys(Keys.ENTER);
		}
		
		//checkbox
		d.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]")).click();
		d.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]/label")).click();
		
		js.executeScript("window.scrollBy(0,900)");
		//upload picture
		WebElement photo=d.findElement(By.id("uploadPicture"));
		photo.sendKeys("C:\\Users\\sai durga\\Downloads\\Selenium Practice Assignment.docx");
		
//		WebElement state=d.findElement(By.id(""));
//		state.sendKeys("NCR");
//		state.sendKeys(Keys.ENTER);
		
		
		//current address
		WebElement adress=d.findElement(By.id("currentAddress"));
		adress.sendKeys("Visakhapatnam");
		
		//submit
		d.findElement(By.id("submit")).click();
		Thread.sleep(6000);
		System.out.println("Done");
		
		//TakesScreenshot ts=(TakesScreenshot)d;
		File source=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		File dest=new File("screenshot1.png");
		Files.copy(source.toPath(), dest.toPath(),StandardCopyOption.COPY_ATTRIBUTES);
		System.out.println("Screenshot");
		d.close();
	}

}
