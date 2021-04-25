package DoubleclickandRightClick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testcase4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver 86\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		
	WebElement source=driver.findElement(By.id("doubleClickBtn"));
	
	Actions a=new Actions(driver);
	Thread.sleep(2000);
	a.moveToElement(source).doubleClick().perform();
	
	String message=driver.switchTo().alert().getText();
	System.out.println(message);
	
	driver.switchTo().alert().accept();
	
	Thread.sleep(2000);
	driver.close();
	

}
}