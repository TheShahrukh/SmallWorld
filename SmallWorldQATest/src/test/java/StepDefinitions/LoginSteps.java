package StepDefinitions;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginSteps {
	
	WebDriver driver = null;
	LoginPage loginPage;
	
	@Given("browser is open")
	public void browser_is_open() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bashisha\\eclipse-workspace\\SmallWorldQATest\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
	}
	
	@And("user is on login page")
	public void user_is_on_login_page() {
		driver.navigate().to("https://www.saucedemo.com/");
		loginPage = new LoginPage(driver);
	
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		loginPage.enterUsername("standard_user");
		loginPage.enterPassword("secret_sauce");
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
		loginPage.clickLoginButton();
	}

	@Then("user is navigated to homepage.")
	public void user_is_navigated_to_homepage() {
		String currentURL = driver.getCurrentUrl();
		String expectedURL = "https://www.saucedemo.com/inventory.html";
		assertEquals(expectedURL, currentURL);
	}


}
