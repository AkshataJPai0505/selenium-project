package ScrollFunction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver 86\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[text()=\"Simple Alert\"]")).click();
//		Thread.sleep(2000);
//		String a=driver.switchTo().alert().getText();
//		Thread.sleep(2000);
//		System.out.println(a);
//		Thread.sleep(2000);
//		driver.switchTo().alert().accept();
//		Thread.sleep(2000);
	driver.close();
}
}
