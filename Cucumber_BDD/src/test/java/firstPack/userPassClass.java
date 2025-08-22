package firstPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;

public class userPassClass {
	WebDriver d;
	userPassClass(WebDriver d){
		this.d=d;
	}
	
	By usern=By.id("user_login");
	By pass=By.id("user_password");
	public void username1_and_password1(String username1,String password1) {
		d.findElement(usern).click();
		d.findElement(usern).sendKeys(username1);
		d.findElement(pass).click();
		d.findElement(pass).sendKeys(password1);
	}
	
	By sub=By.name("submit");
	public void signinbutton(String status) {
		d.findElement(sub).click();
		System.out.println("Status of Test:"+status);
	}
}
