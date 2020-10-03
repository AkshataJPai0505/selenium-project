package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testcase8 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium jar\\webdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		Select a= new Select(driver.findElement(By.xpath("//select[@id=\"month\"]")));
		List <WebElement> elementCount=a.getOptions();
		int lsize=elementCount.size();
		System.out.println(lsize);
		
		for(int i=0;i<lsize;i++)
		{
	String value=elementCount.get(i).getText();
	System.out.println(value);
		
		if(value.equals("May"))
		{
			System.out.println(i);
			break;
		}
		}
	}

}
