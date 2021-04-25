package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testcase23 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver 89\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/tooltip.html");
		WebElement opt=driver.findElement(By.id("download_now"));
		Actions a=new Actions(driver);
		a.moveToElement(opt).perform();
		
		WebElement l1=driver.findElement(By.xpath("//*[@id=\"demo_content\"]/div/div/div/a"));
		String text1=l1.getText();
		System.out.println(text1);
		
		WebElement l2=driver.findElement(By.xpath("//*[@id=\"demo_content\"]/div/div/div/table/tbody/tr[3]/td[1]"));
		String text2=l2.getText();
		System.out.println(text2);
		
		
		Thread.sleep(3000);
		driver.close();
		
	}
	
}
