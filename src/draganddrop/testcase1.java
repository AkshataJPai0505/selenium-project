package draganddrop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class testcase1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		Actions a= new Actions(driver);
		WebElement e1=driver.findElement(By.xpath("//h1[contains(text(),\"Block 1\")]"));
		WebElement e2=driver.findElement(By.xpath("//h1[contains(text(),\"Block 3\")]"));
		Thread.sleep(5000);
		a.dragAndDrop(e1,e2).perform();

	}

}
