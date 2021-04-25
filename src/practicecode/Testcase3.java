package practicecode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testcase3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver 89\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
driver.get("https://demoqa.com/droppable/");
		
		WebElement b1=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement b2=driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions a=new Actions(driver);
		Thread.sleep(2000);
		a.clickAndHold(b1).moveToElement(b2).release().perform();
		Thread.sleep(7000);
		driver.close();


	}

}
