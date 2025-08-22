package ebayProject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteCart {
	WebDriver d;
	@Given("open the cart page")
	public void open_the_cart_page() {
		d = new ChromeDriver();
		d.get("https://www.ebay.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("delete the product from cart")
	public void delete_the_product_from_cart() throws InterruptedException {
		PageClassEbay_cucumber pc=new PageClassEbay_cucumber(d);
		pc.deletecart();
	}

	@Then("close the cart page")
	public void close_the_cart_page() {
		System.out.println("Product deleted");
	    d.close();
	}


}
