package keyboardandmouseaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class testcase1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium jar\\webdriver 83\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement alink=driver.findElement(By.xpath("//a[contains(text(),\"Forgotten account?\")]"));
		Actions a=new Actions(driver);
		
		Action series=a.moveToElement(alink).contextClick(alink).build();
		series.perform();
		
	}

}
