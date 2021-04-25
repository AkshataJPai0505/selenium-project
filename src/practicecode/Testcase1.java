package practicecode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testcase1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver 89\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		
		WebElement b1=driver.findElement(By.xpath("//*[@id=\"block-1\"]/h1"));
		WebElement b2=driver.findElement(By.xpath("//*[@id=\"block-4\"]/h1"));
		
		Actions a=new Actions(driver);
		Thread.sleep(2000);
		a.dragAndDrop(b1,b2).perform();
		Thread.sleep(7000);
		driver.close();
		

	}

}
