package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testcase1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver 86\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
	JavascriptExecutor js=(JavascriptExecutor) driver;	
	WebElement dropdown=	driver.findElement(By.xpath("//select[@name=\"cars\"]"));
	js.executeScript("arguments[0].scrollIntoView()",dropdown);
	Select option =new Select(dropdown);
	option.selectByIndex(3);
	WebElement selectedoption=option.getFirstSelectedOption();
	System.out.println(selectedoption.getText());
     Thread.sleep(5000);
     driver.close();
  
    
     
	}


}
