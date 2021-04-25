package practicecode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver 89\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
driver.get("http://demo.automationtesting.in/Frames.html");
		
		WebElement b1=driver.findElement(By.xpath("//a[contains(text(),'Single Iframe ')]"));
		
		b1.click();

		driver.switchTo().frame(0);
		WebElement b2=driver.findElement(By.xpath("//input[@type='text']"));
		
		
		b2.sendKeys("Akshata");
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		driver.close();
	}

}
