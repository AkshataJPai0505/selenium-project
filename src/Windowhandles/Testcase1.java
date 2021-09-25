package Windowhandles;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium jar\\Webdriver 92\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		driver.manage().window().maximize();
		
	
		
		WebElement ele=driver.findElement(By.id("windowhandling1"));
		ele.click();
		
		Set<String> winid=driver.getWindowHandles();
		Iterator<String> itr=winid.iterator();
		
		String parentid=itr.next();
		String childid=itr.next();
		
		System.out.println(parentid);
		System.out.println(childid);
		
		
		driver.switchTo().window(childid);
		driver.manage().window().maximize();
		driver.findElement(By.id("searchInput")).sendKeys("abc");
		Thread.sleep(4000);
		driver.close();
		
		driver.switchTo().window(parentid);
		
	
		
		
		driver.close();
		
		
		

	}

}
