package keyboardandmouseaction;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class testcase8 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver 83\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		WebElement link=driver.findElement(By.xpath("//a[contains(text(),\"Forgotten account?\")]"));
		Actions action = new Actions(driver);
		action.moveToElement(link).contextClick(link).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
//				Thread.sleep(5000);
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
