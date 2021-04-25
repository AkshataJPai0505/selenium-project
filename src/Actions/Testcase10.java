package Actions;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Testcase10 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver 89\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		WebElement a=driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
		js.executeScript("arguments[0].scrollIntoView()",a );
		
		
		
		Actions ac=new Actions(driver);
		Action buider=ac.sendKeys(a, "Akshata").doubleClick(a).contextClick(a).build();
		buider.perform();
		
		
		
		 Thread.sleep(4000);
		 driver.close();
	}

}
