package Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Testcase3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver 86\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=\"Alert with OK & Cancel \"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),\"click the button to display a confirm box \")]")).click();
		Thread.sleep(2000);
		String a=driver.switchTo().alert().getText();
		Thread.sleep(2000);
		System.out.println(a);
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		driver.close();
		
		

	}

}