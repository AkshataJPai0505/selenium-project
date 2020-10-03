package keyboardandmouseaction;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class testcase3 {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium jar\\webdriver 83\\chromedriver_win32 (1)chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement alink=driver.findElement(By.xpath("//a[contains(text(),\"Forgotten account?\")]"));
		Actions a=new Actions(driver);
		
		Action series=a.moveToElement(alink).contextClick(alink).build();
		series.perform();
		Robot rob=new Robot();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);

}
}
