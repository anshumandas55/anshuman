package nov3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo8 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("http://orangehrm.qedgetech.com/");
driver.manage().window().fullscreen();
	driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
Thread.sleep(2000);
driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
Thread.sleep(2000);
driver.findElement(By.className("button")).click();
Thread.sleep(2000);
//to get title of page and currntly loaded url
String currneturl= driver.getCurrentUrl();
System.out.println("currnet url of page is::"+currneturl );
String title= driver.getTitle();
System.out.println("current title of page is ::"+title);
// to print size (height and width)






	


	}

}
