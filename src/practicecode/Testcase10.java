package practicecode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase10 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver 89\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		WebElement a=driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]"));
		a.click();
		
		WebElement f1=driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
		
		driver.switchTo().frame(f1);
		
		WebElement f2=driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		
		driver.switchTo().frame(f2);
		
		WebElement b2=driver.findElement(By.xpath("//input[@type=\"text\"]"));  
		b2.sendKeys("Selenium");
		
		driver.switchTo().parentFrame();
		
		Thread.sleep(2000);
		driver.close();

	}

}
