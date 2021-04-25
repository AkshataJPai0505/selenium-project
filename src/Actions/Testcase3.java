package Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase3 {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver 89\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
	
	
	driver.navigate().to("https://www.facebook.com/");
	
	String text=driver.getCurrentUrl();
	System.out.println(text);
	
	driver.navigate().back();
	
	String title=driver.getTitle();
	System.out.println(title);
	
	driver.close();
	}

}
