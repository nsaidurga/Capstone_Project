package ebayProject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductDetails {
	WebDriver d;
	@Given("open the home page")
	public void open_the_home_page() {
		d = new ChromeDriver();
		d.get("https://www.ebay.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("select a random product for details")
	public void select_a_random_product_for_details() throws InterruptedException {
		PageClassEbay_cucumber pc=new PageClassEbay_cucumber(d);
		pc.proddetails();
	}

	@Then("close that details page")
	public void close_that_details_page() {
		System.out.println("Selected Product Details");
	    d.close();
	}

}
