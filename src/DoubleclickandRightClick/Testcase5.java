package DoubleclickandRightClick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testcase5 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver 86\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement source=driver.findElement(By.linkText("Forgotten password?"));
		Actions a=new Actions(driver);
		Thread.sleep(2000);
		a.moveToElement(source).contextClick().perform();
		
		String message=driver.getTitle();
		System.out.println(message);
		Thread.sleep(2000);
		driver.close();
	
	}
}
