package facebook;

import org.openqa.selenium.chrome.ChromeDriver;

import facebook.pom.login;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
public class pom2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 WebDriver driver = new ChromeDriver();
	 
	 WebDriverManager.chromedriver().setup();
	 
	 driver.get("https://www.facebook.com/");
	 
	 login loginpage = new login(driver);
	 
	 loginpage.set_username("psuryavamsi88@gmail.com");
	 
	 loginpage.set_password("Vamsi@2000");
	 
	 loginpage.click_login();
	 
	 
	}

}
