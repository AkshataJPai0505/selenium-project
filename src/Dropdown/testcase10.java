package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class testcase10 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		
		driver.findElement(By.xpath("//a[@class=\"dropdown-toggle\"]")).click();
		driver.findElement(By.xpath("//a[contains(text(),\"Flash Movie Demo\")]")).click();
		String a=driver.getCurrentUrl();
		System.out.println(a);
String b=driver.getTitle();
System.out.println(b);
	}

}
