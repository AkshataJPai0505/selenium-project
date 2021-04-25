package practicecode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver 89\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement b1=driver.findElement(By.xpath("//*[@id=\"u_0_2_qe\"]"));
		WebElement b2=driver.findElement(By.xpath("//input[@id='u_e_b_d/']"));
		
		b1.click();
		Thread.sleep(2000);
		b2.sendKeys("Akshata");
		Thread.sleep(2000);
		driver.close();
		

	}

}
