package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class printlastrow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium jar\\Webdriver 94\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/table-sort-search-demo.html");
		driver.manage().window().maximize();
		List<WebElement> ele=driver.findElements(By.xpath("//table/tbody/tr[last()]/td"));
		System.out.println(ele.size());
		  
		for(int i=0;i<ele.size();i++)
		{
			String text=ele.get(i).getText();
			System.out.print(text+" ");
		}
		System.out.println();
		for(int i=1;i<=ele.size();i++)
		{
			String text =driver.findElement(By.xpath("//table/tbody/tr[last()]/td["+i+"]")).getText();
			System.out.print(text+" ");
		}
		Thread.sleep(1000);
		driver.close();
	}

}
