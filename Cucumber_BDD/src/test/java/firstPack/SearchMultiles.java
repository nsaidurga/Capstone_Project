package firstPack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchMultiles {
	WebDriver d;
	@Given("loged userr and searchbutton available or not")
	public void loged_userr_and_searchbutton_available_or_not() {
		d = new ChromeDriver();
		d.get("http://zero.webappsecurity.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("clicking on the search button")
	public void clicking_on_the_search_button() {
		d.findElement(By.id("searchTerm")).click();
	}

	@And("^enter (.*)$")
	public void enter_input(String input) {
		d.findElement(By.id("searchTerm")).sendKeys(input);
		d.findElement(By.id("searchTerm")).sendKeys(Keys.ENTER);
	}

	@Then("give the matched results")
	public void give_the_matched_results() {
	    d.close();
	}

}
