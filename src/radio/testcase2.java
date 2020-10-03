package radio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
			driver.findElement(By.xpath("//input[@id=\"u_0_9\"]")).click();
			driver.findElement(By.xpath("//input[@id=\"u_0_a\"]")).click();
			driver.findElement(By.xpath("//input[@id=\"u_0_b\"]")).click();
		

	}

}
