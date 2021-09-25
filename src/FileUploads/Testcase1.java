package FileUploads;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Testcase1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium jar\\Webdriver 92\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		driver.manage().window().maximize();
		
//		
		WebElement a=driver.findElement(By.xpath("//input[@id='fileupload1']"));
		
		Actions ac=new Actions(driver);
		
		ac.moveToElement(a).perform();
		a.sendKeys("C:\\Users\\HP\\Desktop\\Test.txt");
		
		Thread.sleep(7000);
		 driver.close();
		

	}

}
