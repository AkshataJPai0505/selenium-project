package Waits;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium jar\\webdriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		List<WebElement> elements=driver.findElements(By.xpath("//input[@class=\"inputtext _58mg _5dba _2ph-\"]"));
		System.out.println(elements.size());
		for(int i=0;i<elements.size();i++)
		{
			System.out.println(elements.get(i).getAttribute("Value"));
		}
	}

}
