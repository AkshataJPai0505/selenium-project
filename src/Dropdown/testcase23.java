package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase23 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver 86\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.automationtestinginsider.com/2019/12/bootstrap-dropdown-example_12.html");
         
		WebElement options=driver.findElement(By.xpath("//button[contains(text(),'BOOTSTRAP DROPDOWN')]"));
		
	    

		Thread.sleep(2000);
		options.click();
		
		WebElement firstoption=driver.findElement(By.linkText("ABOUT US"));
		firstoption.click();
		
		String a=driver.getTitle();
		System.out.println(a);
		Thread.sleep(2000);
		driver.close();
}
}
