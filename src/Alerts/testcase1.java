package Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
//		JavascriptExecutor js=(JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,300)");
		
		driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]")).click();
		driver.switchTo().alert().accept();
//		driver.close();
		
	}

}
