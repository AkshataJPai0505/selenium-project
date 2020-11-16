package Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase7 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium jar\\webdriver 86\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id=\"confirmationAlert\"]")).click();
		Thread.sleep(5000);
		String a=driver.switchTo().alert().getText();
		Thread.sleep(5000);
		System.out.println(a);
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		driver.close();
		
}
}
