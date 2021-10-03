package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class particularcellvalue {
	
	static WebDriver  driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium jar\\Webdriver 94\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/table-sort-search-demo.html");
		driver.manage().window().maximize();
		particularcellvalue p=new particularcellvalue();
		p.cellvalue(4, 3);
		Thread.sleep(1000);
		driver.close();

	}
	
	void cellvalue(int i,int j)
	{
		WebElement ele=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]"));
		System.out.println(ele.getText());
	}

}
