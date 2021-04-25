package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Testcase1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver 89\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		
		WebElement a=driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
		
		Actions ac=new Actions(driver);
		
		ac.keyDown(Keys.SHIFT).sendKeys(a,"akshata").keyUp(Keys.SHIFT).perform();
		
		Thread.sleep(2000);
		driver.close();
		
		
		
		

	}

}
