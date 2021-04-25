package Actions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testcase7 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver 89\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		WebElement a=driver.findElement(By.xpath("//button[@id='windowhandling1']"));
		js.executeScript("arguments[0].scrollIntoView()",a );
		
		
		Actions ac=new Actions(driver);
		ac.moveToElement(a).click().perform();
		
		Set<String>win=driver.getWindowHandles();
		
		Iterator<String> itr=win.iterator();
		
		String parent=itr.next();
		String child=itr.next();
		
		driver.switchTo().window(child);
		
		WebElement b=driver.findElement(By.id("searchInput"));
		b.sendKeys("google");
		driver.close();
		driver.switchTo().window(parent);
		
		
		
		 Thread.sleep(4000);
		 driver.close();
		

	}

}
