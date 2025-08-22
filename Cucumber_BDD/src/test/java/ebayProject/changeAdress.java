package ebayProject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class changeAdress {
	WebDriver d;
	@Given("Open the account page")
	public void open_the_account_page() {
		d = new ChromeDriver();
		d.get("https://www.ebay.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("Updating the delivery address")
	public void updating_the_delivery_address() throws InterruptedException {
		PageClassEbay_cucumber pc=new PageClassEbay_cucumber(d);
		pc.changeadress();
	}

	@Then("after update open front page")
	public void after_update_open_front_page() {
	    d.close();
	}
}
