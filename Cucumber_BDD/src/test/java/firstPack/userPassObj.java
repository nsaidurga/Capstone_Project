package firstPack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class userPassObj {
	WebDriver d;
	@Given("login page should be open")
	public void login_page_should_be_open() {
		d = new ChromeDriver();
		d.get("http://zero.webappsecurity.com/login.html");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("^click on login enter (.*) and (.*)$")
	public void click_on_login_enter_username1_and_password1(String username1,String password1) {
		userPassClass pg=new userPassClass(d);
		pg.username1_and_password1(username1,password1);
	}

	@And("^click the signin button check (.*)$")
	public void click_the_signin_button_check_status(String status) {
		userPassClass pg=new userPassClass(d);
		pg.signinbutton(status);
	}

	@Then("login successfulll")
	public void login_successfulll() throws InterruptedException {
		Thread.sleep(2000);
		d.close();
	}



}
