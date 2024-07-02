package task_15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class First_Script {
	
	public static void main(String args[]) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.id("APjFqb")).sendKeys("Selenium Browser Driver");
		
		driver.findElement(By.name("btnK")).click();
		
		System.out.println("Successfully executed");
		
		driver.close();
	}
}
