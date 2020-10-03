package Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium jar\\webdriver\\chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//a[contains(text(),\"Alert with Textbox\")] ")).click();
		driver.findElement(By.xpath("//button[contains(text(),\"click the button to demonstrate the prompt box \")]")).click();
		
	String a=driver.switchTo().alert().getText();
	System.out.println(a);
driver.switchTo().alert().sendKeys("Akshata J Pai");
driver.switchTo().alert().accept();
	}

}
