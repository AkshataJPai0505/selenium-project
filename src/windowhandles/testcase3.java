package windowhandles;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Windows.html");
		WebElement bttn=driver.findElement(By.xpath("//button[@class=\"btn btn-info\"]"));
		for(int i=1;i<=2;i++)
		{
			bttn.click();
		}
		
		String parentwindow=driver.getWindowHandle();
		System.out.println("The parent window id="+parentwindow);
		
		Set<String> windowid=driver.getWindowHandles();
		String lastid="";
		for (String winno : windowid) {
			System.out.println("The tab ids is"+winno);
			driver.switchTo().window(winno);
			driver.get("https://www.facebook.com/");
			lastid=winno;	
		}
		driver.switchTo().window(parentwindow);
		driver.get("https://www.edureka.com");
		
		driver.switchTo().window(lastid);
		driver.get("https://www.instagram.com");
		
		driver.switchTo().window(parentwindow);
		driver.close();
		
		driver.switchTo().window(lastid);
				
		
		

	}

}
