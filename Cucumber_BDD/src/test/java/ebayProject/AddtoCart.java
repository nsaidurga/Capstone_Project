package ebayProject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddtoCart {
	WebDriver d;
	@Given("Select a product")
	public void select_a_product() {
		d = new ChromeDriver();
		d.get("https://www.ebay.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("click on add to cart button")
	public void click_on_add_to_cart_button() throws InterruptedException {
		PageClassEbay_cucumber pc=new PageClassEbay_cucumber(d);
		pc.addCart();
	}

	@Then("Added products")
	public void added_products() {
		System.out.println("Product added");
	    d.close();
	}
}
