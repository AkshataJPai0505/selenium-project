package windowhandles;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase4 {

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
		
		String mainwindow=driver.getWindowHandle();
		System.out.println("The mai window id is"+mainwindow);
		
		Set<String> allwindow=driver.getWindowHandles();
		String lastwindow="";
		for (String windowid : allwindow) {
			System.out.println("The cuurent window id is"+windowid);
			driver.switchTo().window(windowid);
			driver.get("https://www.facebook.com");
			lastwindow=windowid;
		}
		driver.switchTo().window(mainwindow);
		driver.get("https://www.edureka.co");
		
		driver.switchTo().window(lastwindow);
		driver.navigate().back();
		
		
		
		
		

	}

}
