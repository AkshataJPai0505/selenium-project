package checkboxesandradio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase3 {
	public static void main(String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium jar\\webdriver 86\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		driver.manage().window().maximize();
		WebElement a=driver.findElement(By.xpath("//input[@name=\"Checkbox3\"]"));
		if(a.isEnabled())
		{


			System.out.println("The element is present");
			Thread.sleep(5000);
			a.click();
			
		}
		else
		{
			System.out.println("The element is not  present");
		}
		Thread.sleep(5000);
		driver.close();
	}

}
