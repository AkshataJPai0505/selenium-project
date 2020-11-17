package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver 86\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Frames.html");
		
	WebElement a=	driver.findElement(By.xpath("//a[contains(text(),\"Single Iframe\")]"));
     a.click();
     
  
     WebElement b=	driver.findElement(By.xpath("//iframe[@name='SingleFrame']"));  
     driver.switchTo().frame(b);
     
     
     WebElement c=	driver.findElement(By.xpath("//input[@type=\"text\"]"));  
     c.sendKeys("Akshata J Pai");
     
     driver.switchTo().parentFrame();
     
     Thread.sleep(5000);
     driver.close();
     
	}

}
