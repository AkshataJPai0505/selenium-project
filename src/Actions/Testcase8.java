package Actions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Testcase8 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver 89\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Windows.html");
		
		
		WebElement a=driver.findElement(By.xpath("//button[@class=\'btn btn-info\']"));
		
		a.click();
		
		Set<String>win=driver.getWindowHandles();
		
		Iterator<String> itr=win.iterator();
		String parent=itr.next();
		String child=itr.next();
		
		driver.switchTo().window(child);
		driver.navigate().to("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement a1=driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
		js.executeScript("arguments[0].scrollIntoView()",a1 );
		
		WebElement b=driver.findElement(By.xpath("//input[@name=\"lastname\"]"));
		
		WebElement c=driver.findElement(By.xpath("//input[@value=\'No\']"));
		
		Actions ac=new Actions(driver);
		Action buider=ac.sendKeys(a1, "Akshata").sendKeys(b, "Pai").click(c).build();
		buider.perform();
		Thread.sleep(4000);
		 driver.close();
		 
		 driver.switchTo().window(parent);
		 Thread.sleep(4000);
		 driver.close();
		 
		 
	}

}
