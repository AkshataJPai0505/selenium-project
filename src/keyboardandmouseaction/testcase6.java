package keyboardandmouseaction;

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

public class testcase6 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver 83\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		WebElement link=driver.findElement(By.xpath("//a[contains(text(),\"Forgotten account?\")]"));
		Actions a=new Actions(driver);
		
		Action builder=a.moveToElement(link).contextClick(link).build();
	
		builder.perform();
		
		Robot r =new Robot();
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		
		Set<String> windowid =driver.getWindowHandles();
		Iterator<String> itr =windowid.iterator();
		
		String mainwindow=itr.next();
		String childwindow=itr.next();
		System.out.println("The mainwindow id is "+mainwindow);
		System.out.println("The childwindow id is "+childwindow);
		driver.switchTo().window(childwindow);
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.close();
		
		
		
		
		
	}

}

