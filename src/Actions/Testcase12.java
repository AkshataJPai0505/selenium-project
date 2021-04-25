package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testcase12 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver 89\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		WebElement a=driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]"));
		
		Actions ac=new Actions(driver);
		
		ac.moveToElement(a).perform();
		
		String text=a.getAttribute("title");
		
		System.out.println("The tool tip message is "+text);
		
		 Thread.sleep(4000);
		 driver.close();

	}

}
