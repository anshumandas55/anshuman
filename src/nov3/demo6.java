package nov3;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo6 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.get("https://facebook.com");
	driver.findElement(By.id("email")).sendKeys("anshumandas55@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("9861948044");
	driver.findElement(By.id("u_0_b")).click();
	Thread.sleep(3000);
	driver.close();
	
	
	
		

	}

}
