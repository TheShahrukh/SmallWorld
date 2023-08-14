package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	By txt_username = By.xpath("//input[@placeholder=\"Username\"]");
	By txt_password = By.xpath("//input[@placeholder=\"Password\"]");
	By loginButton = By.xpath("//input[@name=\"login-button\"]");
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	
	public void enterUsername(String username) {
		driver.findElement(txt_username).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		driver.findElement(txt_password).sendKeys(password);
	}
	
	public void clickLoginButton(){
		driver.findElement(loginButton).click();
	}

}
