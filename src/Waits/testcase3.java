package Waits;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium jar\\webdriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.uitestpractice.com/students/switchto");
		List<WebElement> elements=driver.findElements(By.tagName("iframe"));
		System.out.println(elements.size());
		

	}

}
