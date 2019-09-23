package login;


import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestValidLogin extends DriverSetup {
	String url="https:/qa-sandbox.apps.htec.rs/";
	
	@Test
	public void validLogIn() throws Exception {
		driver.get("https:/qa-sandbox.apps.htec.rs/");
		LoginPage login= new LoginPage(driver);
		login.clickOnLogin();
		login.sendInputEmail("majatatalovic@live.com");
		Thread.sleep(3000);
		login.sendInputPass("majapetar88");
		Thread.sleep(3000);
		login.clickOnSubmit();
		Thread.sleep(3000);
		Assert.assertFalse(url.contentEquals(driver.getCurrentUrl()));
}
}
