package temp.product.ccart.tc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_HealthCheck {
	
	
	@Test
	
	public void t_01_cscart_search() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://community.ebay.com/t5/Archive-Payments/half-ebay-com/td-p/22703751");
		
		
		driver.findElement(By.name("messageSearchField")).sendKeys("laptop");

		driver.findElement(By.name("submitContext")).click();
		
	}
	
}
