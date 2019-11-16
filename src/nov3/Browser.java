package nov3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static void main(String[] args) {
		/* System.setProperty("webdriver.chrome.driver", "‪F:\\chromedriver.exe"); */
	
	WebDriver driver=new ChromeDriver();

	driver.get("https://facebook.com");
   driver.findElement(By.id("u_0_m")).sendKeys("Geeta");
   driver.findElement(By.id("u_0_o")).sendKeys("Pradhan");
   driver.findElement(By.id("u_0_r")).sendKeys("7008709247");
   driver.findElement(By.id("u_0_w")).sendKeys("9778997225");
  driver.findElement(By.id("day")).sendKeys("12");
 driver.findElement(By.id("month")).sendKeys("Nov");
  driver.findElement(By.id("year")).sendKeys("1990");
   driver.findElement(By.id("u_0_7")).click();
 driver.findElement(By.id("u_0_13")).click();
 
	
	
	
	

	
	
		/*
		 * WebDriver dri=new InternetExplorerDriver(); WebDriver d=new FirefoxDriver();
		 */

	}

}
