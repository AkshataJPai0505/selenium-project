package Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Testcase14 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver 89\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		WebElement a=driver.findElement(By.xpath("//a[contains(text(),'About')]"));
		
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
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		Set<String> allwin=driver.getWindowHandles();
		Iterator<String>itr=allwin.iterator();
		
		String parent=itr.next();
		String child=itr.next();
		
		System.out.println("The parent window is "+parent);
		System.out.println("The child window is "+child);
		
		driver.switchTo().window(child);
		driver.get("https://www.automationtestinginsider.com/2019/08/student-registration-form.html");
		
		WebElement d=driver.findElement(By.id("Birthday_Day"));
		Select s=new Select(d);
		s.selectByIndex(5);
		
		WebElement m=driver.findElement(By.id("Birthday_Month"));
		Select s1=new Select(m);
		s1.selectByValue("May");
		
		WebElement y=driver.findElement(By.id("Birthday_Year"));
		Select s2=new Select(y);
		s2.selectByVisibleText("1995");
		
		Thread.sleep(2000);
		driver.close();
		
		driver.switchTo().window(parent);
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		WebElement ms=driver.findElement(By.id("multi-select"));
		Select s4=new Select(ms);
		s4.selectByIndex(1);
		s4.selectByValue("New York");
		s4.selectByVisibleText("Texas");
		List<WebElement> option=s4.getAllSelectedOptions();
		System.out.println("The no of option selected is "+option.size());
		
		for(int i=0;i<option.size();i++)
		{
			String text=option.get(i).getText();
			System.out.println(text);
		}
		
		s4.deselectByIndex(3);
		Thread.sleep(2000);
		driver.close();
		
	}

}
