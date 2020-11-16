package Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testcase9 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Selenium jar\\Firefox Driver\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
	
	driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@id=\"promptAlert\"]")).click();
	Thread.sleep(5000);
	String a= driver.switchTo().alert().getText();
	Thread.sleep(5000);
	System.out.println(a);
	Thread.sleep(5000);
	
	driver.switchTo().alert().sendKeys("yes");
	Thread.sleep(5000);
	
	driver.switchTo().alert().accept();
	Thread.sleep(5000);
	
	driver.close();
	
	
	
	

	}

}
