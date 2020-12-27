package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testcase8 {
	
		public static void main(String args[]) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver 86\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			JavascriptExecutor js=(JavascriptExecutor)  driver;
			driver.get("https://www.automationtestinginsider.com/2019/08/student-registration-form.html");
			
			WebElement dropdown=driver.findElement(By.id("Birthday_Month"));
			js.executeScript("arguments[0].scrollIntoView()", dropdown);
			
			Select months=new Select(dropdown);
			months.selectByValue("October");
			
			List<WebElement> bmonths=months.getOptions();
			int number=bmonths.size();
			System.out.println(number);
			
			for(int i=0;i<number;i++)
			{
				String a =bmonths.get(i).getText();
				System.out.println(a);
				if(a.equalsIgnoreCase("JUN"))
				{
					System.out.println(i);
					break;
				}
			}
			
			Thread.sleep(5000);
			driver.close();
		}

}
