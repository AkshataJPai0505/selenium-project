package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testcase11 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver 86\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)  driver;
		driver.get("https://www.automationtestinginsider.com/2019/08/student-registration-form.html");
		
		WebElement dropdown=driver.findElement(By.id("Birthday_Day"));
		js.executeScript("arguments[0].scrollIntoView()", dropdown);
		
		Select days=new Select(dropdown);
		days.selectByIndex(5);
		
		List<WebElement>bdays=days.getOptions();
		int number=bdays.size();
		System.out.println(number);
		
		for(int i=0;i<number;i++)
		{
			String a=bdays.get(i).getText();
			System.out.println(a);
			
			if(a.equals("21"))
			{
				System.out.println(i);
				break;
				
			}
			
		}
		Thread.sleep(5000);
		driver.close();

	}

}
