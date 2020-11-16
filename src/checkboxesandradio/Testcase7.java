package checkboxesandradio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase7 {
	public static void main(String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium jar\\webdriver 86\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		driver.manage().window().maximize();
		WebElement a=driver.findElement(By.xpath("//input[@value=\"No\"]"));
		if(a.isSelected())
		{


			System.out.println("The element is selected");
			
		}
		else
		{
			System.out.println("The element is not  selected");
		}
		Thread.sleep(5000);
		driver.close();
	}

}
