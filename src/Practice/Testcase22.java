package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Testcase22{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver 89\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		WebElement opt=driver.findElement(By.xpath("//select[@id=\"searchDropdownBox\"]"));
		
		
	
		Actions act=new Actions(driver);
		act.moveToElement(opt).perform();
		String title=opt.getAttribute("title");
		System.out.println(title);
		
		
		
		Thread.sleep(3000);
		driver.close();

	}

}

	

	
