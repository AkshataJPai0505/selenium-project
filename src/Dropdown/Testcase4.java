package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testcase4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver 86\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.automationtestinginsider.com/2019/08/student-registration-form.html");
		
		WebElement dropdownmonth=driver.findElement(By.xpath("//select[@id='Birthday_Month']"));
		
		Select optionmonth=new Select(dropdownmonth);
		optionmonth.selectByValue("May");
		WebElement selectedmonth=optionmonth.getFirstSelectedOption();
		System.out.println(selectedmonth.getText());
		Thread.sleep(2000);
		optionmonth.selectByVisibleText("Nov");
		WebElement selectedmonth2=optionmonth.getFirstSelectedOption();
		System.out.println(selectedmonth2.getText());
		
		Thread.sleep(4000);
		driver.close();
}
}

