package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testcase14 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver 89\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
		WebElement opt=driver.findElement(By.id("select-demo"));
		
		Select s=new Select(opt);
		s.selectByIndex(1);
		
		WebElement a= s.getFirstSelectedOption();
		System.out.println(a.getText());
		 List<WebElement> option=s.getOptions();
		 System.out.println("The size of the list is "+option.size());
		 
		 for(int i=0;i<option.size();i++)
		 {
			 String value=option.get(i).getText();
			 System.out.println(value);
		 }
		
		Thread.sleep(3000);
		driver.close();

	}

}
