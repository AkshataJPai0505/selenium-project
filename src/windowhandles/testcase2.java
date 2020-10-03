package windowhandles;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("//a[contains(text(),\"Open New Seperate Windows\")]")).click();
		WebElement bttn=driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]"));
				for(int i=1;i<=2;i++)
				{
					bttn.click();
				}
				
				Set<String> winid=driver.getWindowHandles();
				Iterator<String> itr=winid.iterator();
				
				String mainwin=itr.next();
				String child1=itr.next();
				String child2=itr.next();
				System.out.println("The parent window is"+mainwin);
				System.out.println("The Child window1 is"+child1);
				System.out.println("The Child window2 is"+child2);
				driver.get("https://www.edureka.co");
				driver.switchTo().window(child1);
				driver.get("https://wwww.facebook.com");
				
				driver.switchTo().window(child2);
				driver.get("https://www.instagram.com");
				
				driver.switchTo().window(mainwin);
				driver.close();
				driver.switchTo().window(child2);
				
				

	}

}
