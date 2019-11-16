package nov3;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 {

public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.navigate().to("http://primusbank.qedgetech.com/");
Thread.sleep(3000);
driver.manage().window().maximize();

/* if we want to perform many operation on a text box or 
 list box then we have to store it in an variable*/
WebElement username=driver.findElement(By.xpath("//input[@id='txtuId']"));
username.clear();
username.sendKeys("Admin");
WebElement password= driver.findElement(By.xpath("//input[@id='txtPword']"));
password.clear();
password.sendKeys("Admin");
Thread.sleep(2000);
driver.findElement(By.className("style7")).click();
Thread.sleep(3000);
driver.close();

 
 
 

 
 




	}

}
