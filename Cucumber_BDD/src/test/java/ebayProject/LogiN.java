package ebayProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogiN {
	WebDriver d;
	@Given("home page for login")
	public void home_page_for_login() {
		d = new ChromeDriver();
		d.get("https://www.ebay.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("username click enter username")
	public void username_click_enter_username() {
		PageClassEbay_cucumber pc=new PageClassEbay_cucumber(d);
		pc.email_in();
	}

	@And("added your password")
	public void added_your_password() {
		PageClassEbay_cucumber pc=new PageClassEbay_cucumber(d);
		pc.password();
	}

	@And("signin option button click")
	public void signin_option_button_click() {
		System.out.println("Login successful");
	}

	@Then("closed the page")
	public void closed_the_page() {
		System.out.println("you are loged in");
	    d.close();
	}

}
