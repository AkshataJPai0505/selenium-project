package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.navigate().to("https://www.gmail.com");
		driver.navigate().refresh();
		driver.navigate().back();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("973185917");
		
		
	}

}
