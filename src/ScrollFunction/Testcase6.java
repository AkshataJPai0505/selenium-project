package ScrollFunction;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase6 {
public static void main(String args[]) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver 86\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();
	
	JavascriptExecutor js=(JavascriptExecutor) driver;
	Thread.sleep(5000);
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	Thread.sleep(5000);
	driver.close();
	
}
}
