package ebayProject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ChangeLanguage {
	WebDriver d;
	@Given("Scroll down page to lower")
	public void scroll_down_page_to_lower() {
		d = new ChromeDriver();
		d.get("https://www.ebay.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("Changing the Language")
	public void changing_the_language() throws InterruptedException {
		PageClassEbay_cucumber pc=new PageClassEbay_cucumber(d);
		pc.chnglanguage();
	}

	@Then("closing the page after change")
	public void closing_the_page_after_change() {
	    d.close();
	}

}
