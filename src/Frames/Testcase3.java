package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver 86\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Frames.html");
		
	WebElement a=	driver.findElement(By.xpath("//a[contains(text(),\"Single Iframe\")]"));
     a.click();
     
  
     driver.switchTo().frame("singleframe");
     
     
     WebElement b=	driver.findElement(By.xpath("//input[@type=\"text\"]"));  
     b.sendKeys("Akshata J Pai");
     
     driver.switchTo().parentFrame();
     
     driver.close();
     
	}

}
