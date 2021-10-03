package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class particularcolumn {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium jar\\Webdriver 94\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/table-sort-search-demo.html");
		driver.manage().window().maximize();
		List<WebElement> ele=driver.findElements(By.xpath("//table//tbody/tr"));
		System.out.println(ele.size());
		int j=3;
		
		  
		for(int i=1;i<=ele.size();i++)
		{
			
				WebElement a=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]"));
				System.out.print(a.getText()+" ");
				
				
		
			System.out.println();
			System.out.println();
		}
		Thread.sleep(3000);
		driver.close();

	}

}
