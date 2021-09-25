package NonHTMLPOPUp;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basicmethod {
	public static void main(String[] args) throws MalformedURLException, IOException, InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium jar\\Webdriver 92\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println("The title of the page is "+title);
		driver.close();
		
		
		

}
}