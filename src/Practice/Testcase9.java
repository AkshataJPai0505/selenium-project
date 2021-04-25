package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testcase9 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver 89\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.automationtestinginsider.com/2019/08/student-registration-form.html");
		WebElement day=driver.findElement(By.id("Birthday_Month"));
		
		Select bmonth=new Select(day);
		List<WebElement> a=bmonth.getOptions();
		
		for(int i=0;i<a.size();i++) {
			String value=a.get(i).getText();
			System.out.println(i+"->"+value);
			
			if(value.equalsIgnoreCase("may"))
			{
				System.out.println("The month may is present at index " +i);
			}
		}
		

	}

}
