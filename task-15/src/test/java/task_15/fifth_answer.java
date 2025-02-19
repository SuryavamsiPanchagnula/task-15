package task_15;//package declaration

import org.openqa.selenium.By; // method to locate elements
import org.openqa.selenium.WebDriver; //this will help to interact with browser
import org.openqa.selenium.chrome.ChromeDriver;// library for webdriver setup

import io.github.bonigarcia.wdm.WebDriverManager;

public class fifth_answer {
	
	public static void main(String args[]) throws InterruptedException {
		
		//Setup of Web driver
		WebDriverManager.chromedriver().setup();
		
		//initialize Chrome driver
		WebDriver driver = new ChromeDriver();
		
		//Open Chrome with the below URL site
		driver.get("https://www.google.com/");
		
		//maximize window
		driver.manage().window().maximize();
		
		//Find input search element name q and type the input as Mahesh babu
		driver.findElement(By.name("q")).sendKeys("Mahesh babu");
		
		//wait for 3 seconds and continue execution
		Thread.sleep(3000);
		
		//Find the button with name btnk and click on it
		driver.findElement(By.name("btnK")).click();
		
		Thread.sleep(3000);
		
		//close the driver
		driver.close();
		
	}

}
