package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testcase1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.driver", "C:\\Selenium jar\\Firefox Driver\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		
		driver.get("http://www.uitestpractice.com/students/switchto");
		driver.switchTo().frame("iframe_a");
		driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("Akshata J Pai");
		driver.switchTo().parentFrame();
	}

}
