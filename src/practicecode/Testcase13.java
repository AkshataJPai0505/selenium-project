package practicecode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase13 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver 89\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		
		
		WebElement f1=driver.findElement(By.xpath("//iframe[@name='iframe_a']"));
		driver.switchTo().frame(f1);
		
		WebElement f2=driver.findElement(By.id("dropdownButton"));
		f2.click();
		
		driver.switchTo().parentFrame();
		
		WebElement f3=driver.findElement(By.xpath("//iframe[@id='iframe01']"));
		driver.switchTo().frame(f3);
		
		WebElement f4=driver.findElement(By.id("searchInput"));
		f4.sendKeys("selenium");
		
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		
		driver.close();

	}

}
