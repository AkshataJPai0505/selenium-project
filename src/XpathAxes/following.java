package XpathAxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class following {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium jar\\Webdriver 92\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		driver.manage().window().maximize();
		
		List<WebElement> ele=driver.findElements(By.xpath("//input[@name='actionID']/following::*"));
		System.out.println(ele.size());
		
		WebElement ele2=driver.findElement(By.xpath("//input[@name='actionID']/following::form[@id='openIDForm']"));
		System.out.println(ele2.getAttribute("action"));
		Thread.sleep(2000);
		driver.close();

	}

}
