package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;



public class TestingInvalidData extends DriverSetup{
	
	
 private static final String LOGIN_PAGE_URL="https://qa-sandbox.apps.htec.rs/login";
	
	@Test(dataProvider = "loginWrongCreds", dataProviderClass = LoginDataProvider.class)
	public void loginWrong(String username, String password) throws Exception  {
	  driver.get(LOGIN_PAGE_URL);
	  LoginDataProvider data= new LoginDataProvider (driver);
	  data.loginWrongCreds();
	  LoginPage login = new LoginPage(driver);
	  login.sendInputEmail(username);
	  Thread.sleep(10000);
	  login.sendInputPass(password);
	  Thread.sleep(10000);
	  login.clickOnSubmit();
	  Assert.assertTrue(login.messageWarning().isDisplayed());
	}	  

}
