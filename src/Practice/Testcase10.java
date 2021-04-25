package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testcase10 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver 89\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
		WebElement opt=driver.findElement(By.id("multi-select"));
		
		Select s=new Select(opt);
		s.selectByIndex(1);
		s.selectByVisibleText("New York");
		s.selectByValue("Ohio");
		
		WebElement first=s.getFirstSelectedOption();
		System.out.println("The first selected option is "+first.getText());
		Thread.sleep(3000);
		driver.close();

	}

}
