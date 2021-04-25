package DragandDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testcase9 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver 86\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable/");
		
	WebElement source=driver.findElement(By.xpath("//div[contains(text(),'Drag me')]"));
	WebElement destination=driver.findElement(By.xpath("//div[@id='droppable']"));
	
	Actions a=new Actions(driver);
	Thread.sleep(2000);
	a.dragAndDrop(source, destination).perform();
	
	Thread.sleep(2000);
	driver.close();
	
	
	}
}
