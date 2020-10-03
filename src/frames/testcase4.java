package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		driver.get("https://www.toolsqa.com/iframe-practice-page/");
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		driver.switchTo().frame("iframe1");
		driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[2]/ul/li[1]/a/span/span")).click();
		driver.switchTo().parentFrame();
		
	}

	private static WebElement Testing(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
