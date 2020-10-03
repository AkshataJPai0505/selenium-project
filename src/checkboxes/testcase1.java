package checkboxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/radio.html");
		
		//Selection of CheckBoxes//Selection of CheckBoxes
		driver.findElement(By.xpath("//input[@id=\"vfb-6-0\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"vfb-6-1\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"vfb-6-2\"]")).click();
		
		//Deselection of CheckBoxes
		;
		driver.findElement(By.xpath("//input[@id=\"vfb-6-0\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"vfb-6-1\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"vfb-6-2\"]")).click();

	}

}
