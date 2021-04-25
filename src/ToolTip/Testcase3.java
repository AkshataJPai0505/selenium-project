package ToolTip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testcase3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver 89\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/tooltip.html");
		
		WebElement mousehover=driver.findElement(By.id("download_now"));
		Actions a=new Actions(driver);
		a.moveToElement(mousehover).perform();
		WebElement option=driver.findElement(By.xpath("//*[@id=\"demo_content\"]/div/div/div/table/tbody/tr[2]/td[1]"));
		System.out.println(option.getText());
		System.out.println(option.getLocation());
		Thread.sleep(2000);
		driver.close();
		
		
		
		

}
}