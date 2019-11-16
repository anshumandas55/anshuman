package nov3;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) throws Throwable {
	WebDriver driver= new ChromeDriver();
	driver.get("https://facebook.com/");
driver.manage().window().maximize();
Thread.sleep(3000);
driver.findElement(By.id("email")).sendKeys("9090441142");
driver.findElement(By.id("pass")).sendKeys("9861948044");
Thread.sleep(4000);
driver.findElement(By.id("u_0_2")).sendKeys(Keys.ENTER);
	}
	
	

}
