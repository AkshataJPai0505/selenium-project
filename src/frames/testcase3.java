package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor) driver;

		driver.get("http://webdriveruniversity.com/");
		driver.switchTo().frame("udemy-promo-video");
		driver.findElement(By.xpath("//div[@class=\"fullscreen-icon\"]")).click();
		driver.findElement(By.xpath("//div[@class=\"unfullscreen-icon\"]")).click();
		driver.switchTo().parentFrame();
		js.executeScript("window.scrollBy(0,500)");
		driver.getWindowHandles();
		driver.findElement(By.xpath("//h1[text()=\"LOGIN PORTAL\"]")).click();
		driver.getWindowHandles();
		
				driver.findElement(By.xpath("driver.findElement(By.xpath(\"//h1[text()=\\\"LOGIN PORTAL\\\"]))")).click();
				driver.findElement(By.xpath("driver.findElement(By.xpath(\"//h1[text()=\\\"LOGIN PORTAL\\\"]))")).sendKeys("AKSHATA J PAI");
				
		
		

	}

}
