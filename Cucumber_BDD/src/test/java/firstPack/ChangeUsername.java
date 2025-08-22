package firstPack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ebayProject.PageClassEbay_cucumber;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ChangeUsername {
	WebDriver d;
	@Given("Make sure home open")
	public void make_sure_home_open() {
		d = new ChromeDriver();
		d.get("https://www.ebay.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("Updating the username")
	public void updating_the_username() throws InterruptedException {
		PageClassEbay_cucumber pc=new PageClassEbay_cucumber(d);
		//pc.changename();
		System.out.println();
		
	}

	@Then("close and open home page")
	public void close_and_open_home_page() {
		System.out.println("Upadte uername successfully");
	    d.close();
	}


}
