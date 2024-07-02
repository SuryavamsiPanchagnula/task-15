package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pom {
	
	public class login{
		
		private WebDriver driver = null;
		
		private By emailfield = By.id("email");
		private By passwordfield = By.id("pass");
		private By loginbutton = By.name("login");
		
		public login(WebDriver driver) {
			
			this.driver=driver;
		}
		
		public void set_username(String email) {
			
			driver.findElement(emailfield).sendKeys(email);
		}
		public void set_password(String password) {
			
			driver.findElement(passwordfield).sendKeys(password);
		}
		
		public void click_login() {
			driver.findElement(loginbutton).click();
		}
		
		
		
		
	}

}
