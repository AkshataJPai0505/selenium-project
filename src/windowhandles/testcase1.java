package windowhandles;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase1 {
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Windows.html");
		WebElement bttn=driver.findElement(By.xpath("//button[@class=\"btn btn-info\"]"));
		for(int i=1;i<=2;i++)
		{
			bttn.click();
		}
		
		Set<String> windowid =driver.getWindowHandles();
		Iterator<String> itr =windowid.iterator();
				String parentwin=itr.next();
				String childwin1=itr.next();
				String childwin2=itr.next();
				
				System.out.println("The parent id is"+parentwin);
				System.out.println("The Child 1 id is"+childwin1);
				System.out.println("The Child 2 id is"+childwin2);
				driver.get("https://www.edureka.co");
		driver.switchTo().window(childwin2);
		driver.get("https://www.facebook.com/");
		driver.switchTo().window(childwin1);
		driver.get("https://www.instagram.com/");
		
		driver.switchTo().window(parentwin);
		driver.close();
		 driver.switchTo().window(childwin1);
		 Thread.sleep(5000);
		 driver.quit();
		
	}

}
