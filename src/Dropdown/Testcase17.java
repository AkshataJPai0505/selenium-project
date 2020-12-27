package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testcase17 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver 86\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
		WebElement multidropdown=driver.findElement(By.id("multi-select"));
		
		Select city=new Select(multidropdown);
		city.selectByIndex(0);
		city.selectByValue("New York");
		city.selectByVisibleText("Texas");
		
		WebElement firstselect=city.getFirstSelectedOption();
		System.out.println(firstselect.getText());
		
		city.deselectByIndex(0);
		WebElement firstselect1=city.getFirstSelectedOption();
		System.out.println(firstselect1.getText());
		
		city.deselectByValue("New York");
		WebElement firstselect2=city.getFirstSelectedOption();
		System.out.println(firstselect2.getText());
		
		city.deselectByVisibleText("Texas");
		
		
		Thread.sleep(5000);
		driver.close();
		
	}
}
