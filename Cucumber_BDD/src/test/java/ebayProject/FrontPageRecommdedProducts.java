package ebayProject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FrontPageRecommdedProducts {
	WebDriver d;
	@Given("Open the home page of eBay")
	public void open_the_home_page_of_e_bay() {
		d = new ChromeDriver();
		d.get("https://www.ebay.com/giftcards");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("recommended all typeof products")
	public void recommended_all_typeof_products() throws InterruptedException {
		PageClassEbay_cucumber pc=new PageClassEbay_cucumber(d);
		pc.scrollbyend();
	}

	@Then("closing the scroll page")
	public void closing_the_scroll_page() {
	    d.close();
	}
}
