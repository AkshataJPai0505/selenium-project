package Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase11 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/upload/");
		WebElement uploadElement=driver.findElement(By.xpath("//input[@id=\"uploadfile_0\"]"));
		uploadElement.sendKeys("C:\\test\\Screenshots.docx");
		
		driver.findElement(By.xpath("//input[@id=\"terms\"]")).click();
		driver.findElement(By.xpath("//button[@id=\"submitbutton\"]")).click();
		
	}

}
