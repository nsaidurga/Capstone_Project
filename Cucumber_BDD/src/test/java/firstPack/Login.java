package firstPack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	WebDriver d;

	@Given("login page open in browser")
	public void login_page_open_in_browser() {
		d = new ChromeDriver();
		d.get("http://zero.webappsecurity.com/login.html");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("click on username button and enter valid username")
	public void click_on_username_button_and_enter_valid_username() {
		d.findElement(By.id("user_login")).click();
		d.findElement(By.id("user_login")).sendKeys("username");
	}

	@When("adding the user password")
	public void adding_the_user_password() {
		d.findElement(By.id("user_password")).click();
		d.findElement(By.id("user_password")).sendKeys("password");
	}

	@When("click on signin button")
	public void click_on_signin_button() {
		d.findElement(By.name("submit")).click();
	}

	@Then("login successful and open home page and close")
	public void login_successful_and_open_home_page_and_close()  throws InterruptedException {
		d.navigate().back();
		Thread.sleep(2000);
		d.close();
	}

}
