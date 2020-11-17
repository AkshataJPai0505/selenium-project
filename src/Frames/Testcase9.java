package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase9 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver 86\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		 driver.switchTo().frame("packageListFrame");
		 WebElement a=driver.findElement(By.linkText("org.openqa.selenium.devtools"));
		 a.click();
		 driver.switchTo().parentFrame();
		 
		 
		 driver.switchTo().frame("packageFrame");
		 WebElement b=driver.findElement(By.linkText("ConverterFunctions"));
		 b.click();
		 driver.switchTo().parentFrame();
		 
		 
		 driver.switchTo().frame("classFrame");
		 WebElement c=driver.findElement(By.xpath("//a[contains(text(),'Static Methods')]"));
		 c.click();
		 driver.switchTo().parentFrame();
   
     Thread.sleep(5000);
		 	driver.close();
     
	}

}
