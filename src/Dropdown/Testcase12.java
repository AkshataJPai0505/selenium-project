package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testcase12 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver 86\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)  driver;
		driver.get("https://www.automationtestinginsider.com/2019/08/student-registration-form.html");
		
		WebElement dropdown=driver.findElement(By.id("Birthday_Year"));
		js.executeScript("arguments[0].scrollIntoView()", dropdown);
		
		Select year=new Select(dropdown);
		year.selectByValue("1995");
		
		List<WebElement> byear=year.getOptions();
		int number=byear.size();
		System.out.println(number);
		
		for(int i=0;i<number;i++)
		{
			String b=byear.get(i).getText();
			System.out.println(b);
			
			if(b.equals("2005"))
			{
				System.out.println(i);
				year.selectByIndex(i);
				
			}
		}
	Thread.sleep(5000);	
	driver.close();
}
}
