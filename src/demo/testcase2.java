package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("http://www.uitestpractice.com/students/switchto");
		driver.switchTo().frame("iframe_a");
		driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("Akshata J Pai");
		driver.switchTo().parentFrame();
		
		driver.findElement(By.id("alert")).click();
		String a=driver.switchTo().alert().getText();
		System.out.println(a);
		driver.switchTo().alert().accept();
		
		driver.switchTo().frame("iframe_a");
		driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("Vidya J Pai");
		driver.switchTo().parentFrame();
		
		

	}

}
