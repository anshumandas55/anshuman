package nov3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo5 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://gmail.com/");// get url
	String expectedtitle= "gmail";
	String actualtitle= driver.getTitle();
	if(expectedtitle.equals(actualtitle))
	{
		System.out.println("title is matching::" +expectedtitle+ "      "  + actualtitle+ "");

	}
	else
		
	{
	System.out.println("title is not matching::"+ expectedtitle+  "         " + actualtitle);
	}
	
	Thread.sleep(3000);		
	
	driver.close();
	
			

	}

}
