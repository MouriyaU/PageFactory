package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pages.LoginPage;

public class LoginTestCase {

	public static void main(String[] args) 
	{
		//Set the chrome driver path
		System.setProperty
		("webdriver.chrome.driver", 
				"C:\\Drivers_New\\BrowserDrivers\\chromedriver_win32 (1)\\chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Open browser URL
		String url = "http://adactinhotelapp.com";
		driver.get(url);
		
		//Instantiate LoginPage
		LoginPage objLogin = PageFactory.initElements(driver, LoginPage.class);
		objLogin.LoginAction("TPillai567", "P1L618");
		
		
	}

}
