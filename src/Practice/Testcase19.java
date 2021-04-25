package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Testcase19{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver 89\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		
		WebElement opt=driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[3]/div[2]/button"));
		opt.click();
		String text=driver.switchTo().alert().getText();
		System.out.println("The alert message is "+text);
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("Akshata J Pai");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		
		
		Thread.sleep(7000);
		driver.close();

	}

}

	

	
