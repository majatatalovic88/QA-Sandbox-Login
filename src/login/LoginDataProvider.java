package login;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;



public class LoginDataProvider extends DriverSetup{
	

static WebDriver driver;


public LoginDataProvider (WebDriver driver) {
	this.driver=driver;
}
	
	@DataProvider
	
		public static Object[][] loginWrongCreds() {
	        Object[][] testdata = new Object[7][2];
	        //empty login
	        testdata[0][0] = ""; 
	        testdata[0][1] = "";
	        //wrong email
	        testdata[1][0] = "majaatalovic@live.com";
	        testdata[1][1] = "majapetar88";
	        //invalid email
	        testdata[2][0] = "majatatalovic@livecom"; 
	        testdata[2][1] = "majapetar88";
	        //invalid pass
	        testdata[3][0] = "majatatalovic@live.com";
	        testdata[3][1] = "maja";
	        //wrong pass
	        testdata[4][0] = "majatatalovic@live.com";
	        testdata[4][1] = "majapetar89";
	        //empty mail
	        testdata[5][0] = "";
	        testdata[5][1] = "majapetar88";
	        //empty pass
	        testdata[6][0] = "majatatalovic@live.com";
	        testdata[6][1] = "";
	        
	        
	        
	        
	        
	        
	   
	        
	        return testdata;
	    }
}

	

		


