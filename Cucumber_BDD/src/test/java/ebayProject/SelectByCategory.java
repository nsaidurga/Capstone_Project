package ebayProject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SelectByCategory {
	WebDriver d;
	@Given("Open the home page for searching")
	public void open_the_home_page_for_searching() {
		d = new ChromeDriver();
		d.get("https://www.ebay.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("click on select by a customized category option")
	public void click_on_select_by_a_customized_category_option() throws InterruptedException {
		PageClassEbay_cucumber pc=new PageClassEbay_cucumber(d);
		pc.selectcategory();
	}

	@Then("close page after selection")
	public void close_page_after_selection() {
		System.out.println("You selected a particular category");
	    d.close();
	}



}
