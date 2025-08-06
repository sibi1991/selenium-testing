package org.blazee;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class blazzeclas extends Baseclss{
//	@Given("To launch browser  and maximize window")
//	public void to_launch_browser_and_maximize_window() {
//	   launchBrowser();
//	   windowMaximize();
//	}

	@When("To launch the URL")
	public void to_launch_the_URL() {
		launchUrl("https://www.demoblaze.com/");
	    
	}

	@Then("Click on sign up")
	public void click_on_sign_up() throws InterruptedException {
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//a[text( )='Sign up']")).click();
	}
	@Then("Enter Username")
	public void enter_Username() throws InterruptedException {
		Thread.sleep(3000);
	    driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("cibivarughese7@gmail.com");
	}

	@Then("Enter Password")
	public void enter_Password() throws InterruptedException {
		Thread.sleep(3000);
	   driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Password@123");
	}

	@Then("click on the sign up")
	public void click_on_the_sign_up() {
		driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
	    
	}


}
