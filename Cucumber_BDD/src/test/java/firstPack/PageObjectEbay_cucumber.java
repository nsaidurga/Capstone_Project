package firstPack;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ebayProject.PageClassEbay_cucumber;
import io.cucumber.java.en.Given;

public class PageObjectEbay_cucumber {
	WebDriver d;
	PageClassEbay_cucumber pg;
	
	@Given("user opens the home page in browser")
	public void user_opens_the_home_page_in_browser() {
		d = new ChromeDriver();
		d.get("https://www.ebay.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		pg=new PageClassEbay_cucumber(d);
	}

	@Given("user logsin with valid credentials")
	public void user_logsin_with_valid_credentials() {
		//PageClassEbay_cucumber pg=new PageClassEbay_cucumber(d);
		pg.email_in();
		pg.password();
	}

	@Given("user searches for a products")
	public void user_searches_for_a_products() {
		PageClassEbay_cucumber pg=new PageClassEbay_cucumber(d);
		pg.search();
	}

	@Given("user adds the product to the cart")
	public void user_adds_the_product_to_the_cart() throws InterruptedException {
		PageClassEbay_cucumber pg=new PageClassEbay_cucumber(d);
		pg.addCart();
	}

	@Given("user deletes a product from the cart")
	public void user_deletes_a_product_from_the_cart() throws InterruptedException {
		PageClassEbay_cucumber pg=new PageClassEbay_cucumber(d);
		pg.deletecart();
	}

	@Given("user changes the username")
	public void user_changes_the_username() throws InterruptedException {
		PageClassEbay_cucumber pg=new PageClassEbay_cucumber(d);
		pg.changename();
	}

	@Given("user updates the delivery address")
	public void user_updates_the_delivery_address() throws InterruptedException {
		PageClassEbay_cucumber pg=new PageClassEbay_cucumber(d);
		pg.changeadress();
	}

	@Given("user selects a product category")
	public void user_selects_a_product_category() throws InterruptedException {
		PageClassEbay_cucumber pg=new PageClassEbay_cucumber(d);
		pg.selectcategory();
	}

	@Given("user select a random product for details")
	public void user_select_a_random_product_for_details() throws InterruptedException {
		PageClassEbay_cucumber pg=new PageClassEbay_cucumber(d);
		pg.proddetails();
	}

	@Given("user Selecting all categories option")
	public void user_selecting_all_categories_option() throws InterruptedException {
		PageClassEbay_cucumber pg=new PageClassEbay_cucumber(d);
		pg.selbyall();
	}

	@Given("user changes the language")
	public void user_changes_the_language() throws InterruptedException {
		PageClassEbay_cucumber pg=new PageClassEbay_cucumber(d);
		pg.chnglanguage();
	}

	@Given("user log out from eBay")
	public void user_log_out_from_e_bay() {
		PageClassEbay_cucumber pg=new PageClassEbay_cucumber(d);
		
	}

	@Given("user closes the website page")
	public void user_closes_the_website_page() {
	    d.close();
	}


}
