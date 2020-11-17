package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver 86\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Frames.html");
		
	WebElement a=	driver.findElement(By.xpath("//a[contains(text(),\"Iframe with in an Iframe\")]"));
     a.click();
     
     			Thread.sleep(2000);
     			 WebElement b=	driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));  
     		     driver.switchTo().frame(b);
     			
     		    WebElement c=	driver.findElement(By.xpath("/html/body/section/div/div/iframe"));  
    		     driver.switchTo().frame(c);	
     			
     			
     WebElement d=	driver.findElement(By.xpath("//input[@type=\"text\"]"));  
     Thread.sleep(2000);
     d.sendKeys("Akshata J Pai");
     Thread.sleep(2000);
     d.clear();
     
     driver.switchTo().parentFrame();
  
 
     	WebElement ele=driver.findElement(By.linkText("Single Iframe"));
     	if(ele.isDisplayed())
     	{
     		ele.click();
     		driver.switchTo().frame(0);
     	     WebElement f=	driver.findElement(By.xpath("//input[@type=\"text\"]"));  
     	     f.sendKeys("Vidya J Pai");
     	}
     	else {
     		
     		System.out.println("Element not found");
     	}
     	driver.switchTo().parentFrame();
     driver.close();
     
	}

}
