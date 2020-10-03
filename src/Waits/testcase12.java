package Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase12 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/upload/");
		WebElement a=driver.findElement(By.xpath("//input[@class=\"upload_txt\"]"));
		a.sendKeys("C:\\Users\\HP\\Desktop\\Selenium\\Class 3\\Seleniumbatch_October2019-master\\Seleniumbatch_October2019-master\\Constructors in Java.docx");
driver.findElement(By.xpath("//input[@class=\"field_check\"]")).click();
driver.findElement(By.xpath("//button[@class=\"btn buttoncolor has-spinner\"]")).click();
	}

}
