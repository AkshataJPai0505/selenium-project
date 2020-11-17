package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase10 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver 86\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		 WebElement ele1=driver.findElement(By.xpath("//iframe[@name=\"packageListFrame\"]"));
		 driver.switchTo().frame(ele1);
		 WebElement a=driver.findElement(By.linkText("org.openqa.selenium.chrome"));
		 a.click();
		 driver.switchTo().parentFrame();
		 
		 
		 WebElement ele2=driver.findElement(By.xpath("//iframe[@name=\"packageFrame\"]"));
		 driver.switchTo().frame(ele2);
		 WebElement b=driver.findElement(By.linkText("ChromeDriverService"));
		 b.click();
		 driver.switchTo().parentFrame();
		 
		 
		 WebElement ele3=driver.findElement(By.xpath("//iframe[@name=\"classFrame\"]"));
		 driver.switchTo().frame(ele3);
		 WebElement c=driver.findElement(By.xpath("//a[contains(text(),'org.openqa.selenium.remote.service.DriverService')]"));
		 c.click();
		 driver.switchTo().parentFrame();
   
     Thread.sleep(5000);
		 	driver.close();
   
	}

}
