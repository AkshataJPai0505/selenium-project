package ScrollFunction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase2 {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver 86\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.automationtestinginsider.com/2020/02/different-ways-of-scrolling-in-selenium.html");
	
	driver.manage().window().maximize();
	JavascriptExecutor js=(JavascriptExecutor) driver;
	Thread.sleep(5000);
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//button[text()=\"Simple Alert\"]")).click();
//	Thread.sleep(2000);
//	String a=driver.switchTo().alert().getText();
//	Thread.sleep(2000);
//	System.out.println(a);
//	Thread.sleep(2000);
//	driver.switchTo().alert().accept();
Thread.sleep(2000);
	driver.close();
}
}


