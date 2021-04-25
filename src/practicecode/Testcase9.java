package practicecode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase9 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver 89\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		WebElement b1=driver.findElement(By.xpath("//a[contains(text(),'Single Iframe ')]"));
		b1.click();
		
		WebElement b=driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		
		
		driver.switchTo().frame(b);
		WebElement b2=driver.findElement(By.xpath("//input[@type='text']"));
		b2.sendKeys("Selenium");
		driver.switchTo().parentFrame();
		
		WebElement a=driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]"));
		a.click();
		
		Thread.sleep(2000);
		driver.close();

	}

}
