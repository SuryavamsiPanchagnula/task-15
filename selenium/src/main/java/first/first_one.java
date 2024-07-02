package first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class first_one {
	public static void main(String args[]) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en.wikipedia.org/wiki/Mahesh_Babu");
		
		driver.manage().window().maximize();
		
		Thread.sleep(10000);
		
		driver.close();
	}

}
