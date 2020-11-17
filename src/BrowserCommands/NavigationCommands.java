package BrowserCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver 86\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.automationtesting.in/Frames.html");
	
	//navigate command
	driver.navigate().to("https://www.facebook.com/");
	
	//back command
	driver.navigate().back();
	
	//forward command
	driver.navigate().forward();
	
	//Refresh command
	driver.navigate().refresh();
	
	//Close command
	driver.close();
}
}
