package ebayProject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignOut {
	WebDriver d;
	@Given("Login the account page")
	public void login_the_account_page() {
		d = new ChromeDriver();
		d.get("https://www.ebay.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("click on sign out")
	public void click_on_sign_out() throws InterruptedException {
		PageClassEbay_cucumber pc=new PageClassEbay_cucumber(d);
		pc.signout();
	}

	@Then("sign out successful")
	public void sign_out_successful() {
		System.out.println("log out successful");
	    d.close();
	}
}
