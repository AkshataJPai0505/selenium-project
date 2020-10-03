package Waits;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase1 {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		List<WebElement> elements=driver.findElements(By.name("sex"));
		System.out.println("The total no of elements is "+elements.size());
		for(int i=0;i<elements.size();i++)
		{
			String a=elements.get(i).getText();
			System.out.println(a);
		}
		
	}

}
