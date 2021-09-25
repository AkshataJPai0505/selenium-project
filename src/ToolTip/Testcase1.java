package ToolTip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testcase1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver 92\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		WebElement mousehover=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		Actions a=new Actions(driver);
		a.moveToElement(mousehover).perform();
		String tooltipmsg=mousehover.getAttribute("title");
	
		System.out.println("The tooltip message is "+tooltipmsg);
		Thread.sleep(2000);
		driver.close();
		
		
		
		

}
}