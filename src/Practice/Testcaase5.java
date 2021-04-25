package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testcaase5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver 89\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		WebElement ele=driver.findElement(By.name("cars"));
		Select s=new Select(ele);
		List<WebElement> elements=s.getOptions();
		System.out.println(elements.size());
		for(int i=0;i<elements.size();i++)
		{
			String value=elements.get(i).getText();
			System.out.println(i+"->"+value);
			if(value.equals("Fiat"))
			{
				System.out.println(i);
				
			}
		}
		Thread.sleep(5000);
		driver.close();
		

	}

}