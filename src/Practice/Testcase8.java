package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testcase8 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver 89\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.automationtestinginsider.com/2019/08/student-registration-form.html");
		WebElement day=driver.findElement(By.id("Birthday_Month"));
		
		Select bmonth=new Select(day);
		bmonth.selectByValue("March");
		Thread.sleep(3000);
		
		bmonth.selectByVisibleText("Jan");
		Thread.sleep(3000);
		
		bmonth.selectByIndex(12);
		
		Thread.sleep(3000);
		driver.close();
		
		

	}

}
