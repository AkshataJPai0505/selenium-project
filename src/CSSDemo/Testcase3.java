package CSSDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium jar\\Webdriver 92\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		
WebElement ele1=driver.findElement(By.cssSelector("[type='submit'][value='Submit']"));
		
		System.out.println("The attribut value is "+ele1.getTagName());
		
WebElement ele2=driver.findElement(By.cssSelector("input[value='Yes']"));
		
		System.out.println(ele2.isSelected());
		
		
WebElement ele3=driver.findElement(By.cssSelector("input[value='Checkbox1']"));
		
		System.out.println(ele3.isSelected());
		driver.close();


	}

}
