package Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Testcase13 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver 89\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		WebElement a=driver.findElement(By.xpath("//a[contains(text(),'Advertising')]"));
		
		Actions ac=new Actions(driver);
		
		ac.moveToElement(a).contextClick(a).perform();
		
		Robot r=new Robot();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_UP);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_UP);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_UP);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_UP);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_UP);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_UP);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		
		Set<String>allwin=driver.getWindowHandles();
		Iterator<String> itr=allwin.iterator();
		
		
		String parent=itr.next();
		String child=itr.next();
		System.out.println("The parent window id is "+parent);
		System.out.println("The child window id is "+parent);
		
		
		driver.switchTo().window(child);
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		WebElement a1=driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
		js.executeScript("arguments[0].scrollIntoView()",a1 );
		
		
		
		
		Action buider=ac.sendKeys(a1, "Akshata").doubleClick(a1).contextClick(a1).build();
		buider.perform();
		
		Thread.sleep(4000);
		 driver.close();
		
		 driver.switchTo().window(parent);
		 WebElement a2=driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]"));
			
			
			
			ac.moveToElement(a2).perform();
			
			String text=a2.getAttribute("title");
			
			System.out.println("The tool tip message is "+text);
			
			 Thread.sleep(4000);
			 driver.close();
		
		
		
		
	}
}
		