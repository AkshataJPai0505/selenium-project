package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase1 {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://hugelearning.com/iframe-practice-page/");
		driver.switchTo().frame("iframe1");
		driver.switchTo().parentFrame();
		driver.switchTo().frame("IFrame2");
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//a[text()=\"Interview Question\"]")).click();
		
	

	}

}
