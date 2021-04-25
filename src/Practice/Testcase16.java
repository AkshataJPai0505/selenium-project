package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testcase16{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver 89\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		
		WebElement opt=driver.findElement(By.xpath("//button[@class=\"btn btn-default\"]"));
		opt.click();
		String text=driver.switchTo().alert().getText();
		System.out.println("The alert message is "+text);
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		
		
		Thread.sleep(3000);
		driver.close();

	}

}