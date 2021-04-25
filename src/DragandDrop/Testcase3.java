package DragandDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testcase3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver 86\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		
	WebElement source=driver.findElement(By.xpath("//h1[contains(text(),'Block 1')]"));
	WebElement destination=driver.findElement(By.xpath("//h1[contains(text(),'Block 3')]"));
	WebElement destination1=driver.findElement(By.xpath("//h1[contains(text(),'Block 2')]"));
	WebElement destination2=driver.findElement(By.xpath("//h1[contains(text(),'Block 4')]"));
	
	Actions a=new Actions(driver);
	Thread.sleep(2000);
	a.dragAndDrop(source,destination).perform();
	
	Thread.sleep(2000);
	a.dragAndDrop(destination,destination1).perform();
	
	Thread.sleep(2000);
	a.dragAndDrop(destination1,destination2).perform();
	
	Thread.sleep(2000);
	driver.close();
	}

}
