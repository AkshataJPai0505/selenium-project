package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://wwww.facebook.com");
		String pagesource=driver.getPageSource();
		System.out.println("The page source  is"+pagesource);
		String actualtitle=driver.getTitle();
		System.out.println("The title pf the page is"+actualtitle);
		String current=driver.getCurrentUrl();
		System.out.println("The current url  is"+current);
		driver.quit();

	}

}
