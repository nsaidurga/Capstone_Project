package ebayProject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class MultipleSearch {
	WebDriver d;

	@Given("button search worked or not")
	public void button_search_worked_or_not() {
		d = new ChromeDriver();
		d.get("https://www.ebay.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("clicked button Add the searching word")
	public void clicked_button_add_the_searching_word() {
		PageClassEbay_cucumber pc = new PageClassEbay_cucumber(d);
		pc.search();
	}

	@And("matched result")
	public void matched_result() {
		System.out.println("Multiple products selected");
		d.close();
	}
}
