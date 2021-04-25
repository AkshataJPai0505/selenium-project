package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testcase5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver 89\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		WebElement a=driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
		js.executeScript("arguments[0].scrollIntoView()",a );
		
		WebElement b=driver.findElement(By.xpath("//input[@name=\"lastname\"]"));
		
		Actions ac=new Actions(driver);
		ac.sendKeys(a, "Akshata").sendKeys(b, "Pai").perform();
		
		 Thread.sleep(4000);
		 driver.close();


	}

}
