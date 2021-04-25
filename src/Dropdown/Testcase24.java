package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testcase24 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver 86\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
         
		WebElement options=driver.findElement(By.id("select-demo"));
		Select days=new Select(options);
		List<WebElement> a=days.getOptions();
		int count=a.size();
		System.out.println("The Total no of options in a dropdown is " +count);	
		
		for(int i=0;i<count;i++)
		{
			String value=a.get(i).getText();
			System.out.println(i+"->"+value);
			if(value.equalsIgnoreCase("sunday"))
			{
				System.out.println(i);
				break;
			}
		}
		
		driver.close();
}
}
