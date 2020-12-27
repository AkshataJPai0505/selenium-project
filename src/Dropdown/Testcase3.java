package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testcase3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver 86\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.automationtestinginsider.com/2019/08/student-registration-form.html");
	JavascriptExecutor js=(JavascriptExecutor) driver;	
	WebElement dropdownday=	driver.findElement(By.xpath("//select[@name='Birthday_day']"));
	js.executeScript("arguments[0].scrollIntoView()",dropdownday);
	
	//option to select day
	Select optionday =new Select(dropdownday);
	optionday.selectByIndex(14);
	WebElement selectedday=optionday.getFirstSelectedOption();
	System.out.println(selectedday.getText());
	
	
	//option to select month
	WebElement dropdownmonth=	driver.findElement(By.xpath("//select[@name='Birthday_Month']"));
	Select optionmonth =new Select(dropdownmonth);
	optionmonth.selectByValue("March");
	WebElement selectedmonth=optionmonth.getFirstSelectedOption();
	System.out.println(selectedmonth.getText());
	
	//option to select year
	WebElement dropdownyear=driver.findElement(By.xpath("//select[@name='Birthday_Year']"));
	Select optionyear=new Select(dropdownyear);
	optionyear.selectByVisibleText("1995");
	WebElement selectedyear=optionyear.getFirstSelectedOption();
	System.out.println(selectedyear.getText());
	
	
     Thread.sleep(5000);
     driver.close();
  
    
     
	}

}
