package Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase10 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium jar\\webdriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.edureka.co/");
		String a=driver.getTitle();
		System.out.println(a);
		
		driver.findElement(By.xpath("//i[@class=\"icon-logo edu-logo-style\"]")).click();
		String b=driver.getTitle();
		System.out.println(b);
		if(a.equals(b))
		{
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println("Test case fail");

		}

	}

}
