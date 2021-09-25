package Windowhandles;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;



public class Testcase2 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium jar\\Webdriver 92\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement a=driver.findElement(By.xpath("//a[contains(text(),'Advertising')]"));
		
		Actions ac=new Actions(driver);
		Action builder=ac.moveToElement(a).contextClick().build();
		builder.perform();
		
		
		Robot r=new Robot();
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
		
		 Set<String> winid=driver.getWindowHandles();
		 Iterator<String> itr=winid.iterator();
		 
		 String parentid=itr.next();
		 String childid=itr.next();
		 
		 driver.switchTo().window(childid);
		 
		 driver.navigate().to("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		 
		 driver.switchTo().frame("iframe01");
		 Thread.sleep(2000);
		 WebElement b=driver.findElement(By.id("searchInput"));
		 Thread.sleep(2000);
		 b.sendKeys("abc");
		 Thread.sleep(2000);
		 driver.switchTo().parentFrame();
		 driver.close();
		 Thread.sleep(2000);
		 driver.switchTo().window(parentid);
		 Thread.sleep(2000);
		 driver.close();
		 
		 
		 
		 
		
		
		
		

	}

}
