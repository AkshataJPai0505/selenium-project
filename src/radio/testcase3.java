package radio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testcase3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
			
			driver.findElement(By.xpath("//input[@id=\"u_0_b\"]")).click();
			Select a=new Select(driver.findElement(By.xpath("//select[@class=\"_7-16 _5dba\"]")));
			a.selectByVisibleText("She: \"Wish her a happy birthday!\"");
            driver.findElement(By.xpath("//input[@id=\"u_0_11\"]")).sendKeys("Female");
	}

}
