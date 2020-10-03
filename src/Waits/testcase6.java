package Waits;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testcase6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium jar\\webdriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@id=\"u_0_8\"]")).click();
		Select a=new Select(driver.findElement(By.xpath("//select[@class=\"_7-16 _5dba\"]")));
		List<WebElement> e=a.getOptions();
		System.out.println(e.size());
		for(int i=0;i<e.size();i++)
		{
			String value=e.get(i).getText();
			System.out.println(i+"->"+value);
			if(value.equals("She: \"Wish her a happy birthday!\""))
			{
				System.out.println(i);
				break;
			}
		}
		
		
	}

}
