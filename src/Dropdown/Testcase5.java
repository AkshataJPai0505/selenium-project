package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testcase5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver 86\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.automationtestinginsider.com/2019/08/student-registration-form.html");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		WebElement dropdownday=driver.findElement(By.xpath("//select[@name='Birthday_day']"));
		js.executeScript("arguments[0].scrollIntoView()", dropdownday);
		
		Select optionday=new Select(dropdownday);
		List<WebElement> days=optionday.getOptions();
		
		int a=days.size();
		System.out.println(a);
		 for(int i=0;i<a;i++)
		 {
			 String b=days.get(i).getText();
			 System.out.println(b);
		 }
		 driver.close();
	}
}
