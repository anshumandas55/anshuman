package nov3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.Page;

public class Demo4 {

	public static void main(String[] args) {
	
WebDriver driver= new ChromeDriver();
driver.get("http://primusbank.qedgetech.com/");
driver.manage().window().maximize();
String strtitle= driver.getTitle();
System.out.println("page title is::"+strtitle);
System.out.println("title lenghth is::"+strtitle.length());
/* print URL of The page and length of URL*/
String strtitle1= driver.getCurrentUrl();
System.out.println("url of the page::"+strtitle1);
System.out.println("url length of page::"+strtitle1.length());
driver.close();



	}

}
