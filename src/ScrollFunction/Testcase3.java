package ScrollFunction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase3 {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver 86\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
	
	driver.manage().window().maximize();
	Thread.sleep(5000);
	WebElement a=driver.findElement(By.xpath("//input[@id='fileupload1']"));
	Thread.sleep(5000);
	JavascriptExecutor js=(JavascriptExecutor) driver;
	Thread.sleep(5000);
	js.executeScript("arguments[0].scrollIntoView();",a);
	Thread.sleep(5000);
	if(a.isDisplayed())
	{
	System.out.println("Element is present");
}
	else
	{
		System.out.println("Element is not present");
}
	Thread.sleep(5000);
	driver.close();
	}
}