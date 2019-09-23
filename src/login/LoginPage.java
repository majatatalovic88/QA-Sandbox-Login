package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends DriverSetup {
	
static WebDriver driver;
	
	public LoginPage (WebDriver driver) {
		this.driver=driver;
	}
	
	private static WebElement btnLogin() {
		return driver.findElement(By.cssSelector("a.btn-secondary"));
	}
	
	private static WebElement email() {
		return driver.findElement(By.cssSelector("input[name=\"email\"]"));
	}
	
	private static WebElement password() {
		return driver.findElement(By.cssSelector("input[name=\"password\"]"));
		
	}
	
	private static WebElement btnSubmit() {
		return driver.findElement(By.cssSelector("button[type=\"submit\"]"));
	}
	
	private static WebElement warningMessage() {
		return driver.findElement(By.cssSelector("div.invalid-feedback"));
	}
	
	
	
	
//Actions
	public WebElement messageWarning() {
		return warningMessage();
	}
	public void clickOnLogin() {
		btnLogin().click();
	}
	
	public void sendInputEmail(String s) {
		email().sendKeys(s);
	}
	
	public void sendInputPass(String s) {
		password().sendKeys(s);
	}
	
	public void clickOnSubmit() {
		btnSubmit().click();
	}

}
