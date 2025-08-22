package ebayProject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AllCategoriesProds {
	WebDriver d;
	@Given("click on the search bar page")
	public void click_on_the_search_bar_page() {
		d = new ChromeDriver();
		d.get("https://www.ebay.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("choose all categories option and click search")
	public void choose_all_categories_option_and_click_search() throws InterruptedException {
		PageClassEbay_cucumber pc=new PageClassEbay_cucumber(d);
		pc.selbyall();
	}

	@Then("close the personalized recommended products page")
	public void close_the_personalized_recommended_products_page() {
		System.out.println("All categories of products");
	    d.close();
	}
}
