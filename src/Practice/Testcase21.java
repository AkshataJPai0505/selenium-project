package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ByIdOrName;


public class Testcase21{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver 89\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		WebElement opt=driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]"));
		Actions a=new Actions(driver);
		a.moveToElement(opt);
		String title=opt.getAttribute("title");
		System.out.println(title);
		
		
		
		
		Thread.sleep(7000);
		driver.close();

	}

}

	

	

