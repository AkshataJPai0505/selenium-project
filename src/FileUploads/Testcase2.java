package FileUploads;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testcase2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium jar\\Webdriver 92\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		WebElement a=driver.findElement(By.id("uploadfile_0"));
		Actions ac=new Actions(driver);
		ac.moveToElement(a).perform();
			a.sendKeys("C:\\Users\\HP\\Desktop\\Test.txt");
			Thread.sleep(2000);
			driver.close();
		
		
		
		

	}

}
