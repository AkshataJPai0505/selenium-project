package keyboardandmouseaction;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class testcase4 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver 83\\chromedriver_win32 (1)chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement a1=driver.findElement(By.xpath("//input[@id=\"email\"]"));
		
		WebElement a2=driver.findElement(By.xpath("//input[@id=\"pass\"]"));
		
		Actions obj=new Actions(driver);
		
		Action series=obj.moveToElement(a1).click().keyDown(a1,Keys.SHIFT).sendKeys(a1,"akshata").keyUp(a1, Keys.SHIFT).doubleClick(a1).build();
		series.perform();
		
		Robot r=new Robot();
		 r.keyPress(KeyEvent.VK_DELETE);
		 r.keyRelease(KeyEvent.VK_DELETE);
         
         
         
         
         
         
	}

}
