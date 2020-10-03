package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("http://www.uitestpractice.com/students/switchto");
		driver.switchTo().frame("iframe_a");
		driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("Akshata J Pai");
		driver.findElement(By.xpath("//input[@id=\"name\"]")).clear();
		driver.switchTo().parentFrame();
		
		driver.findElement(By.xpath("//button[@id=\"prompt\"]")).click();
		String a=driver.switchTo().alert().getText();
		System.out.println(a);
		driver.switchTo().alert().sendKeys("Vidya");
		driver.switchTo().alert().dismiss();
		
		driver.switchTo().frame("iframe_a");
		driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("Jayanth v Pai");
		driver.switchTo().parentFrame();


	}

}
