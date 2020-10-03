package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testcase4 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Selenium jar\\webdriver\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://www.facebook.com");
		 
		 Select a= new Select(driver.findElement(By.xpath("//select[@id=\"day\"]")));
				 a.selectByIndex(14);
				 
				 Select a1= new Select(driver.findElement(By.xpath("//select[@id=\"month\"]")));
				  a1.selectByIndex(3);
				  
				  
					 Select a2= new Select(driver.findElement(By.id("year")));
					  a2.selectByIndex(55);

}
}
