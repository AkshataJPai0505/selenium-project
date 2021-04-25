package practicecode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlink {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver 89\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("The no of links is "+links.size());
		
		List<WebElement> image=driver.findElements(By.tagName("img"));
		System.out.println("The no of image links is "+image.size());
		
		links.addAll(image);
		
		System.out.println("The no of links is "+links.size());
		for(int i=0;i<links.size();i++)
		{
			String value=links.get(i).getText();
//			System.out.println(value);
			
			if(value!=" " && value!=null)
			{
				System.out.println(value);
			}
		}
		Thread.sleep(2000);
		driver.close();
		
		

	}

	

}
