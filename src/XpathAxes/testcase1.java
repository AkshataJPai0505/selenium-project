package XpathAxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium jar\\Webdriver 92\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		driver.manage().window().maximize();

		WebElement ele=driver.findElement(By.xpath("//div[@id=\"logInPanelHeading\"]/ancestor::form[@id=\"frmLogin\"]"));
		String text=ele.getAttribute("action");
		System.out.println(text);
		System.out.println(ele.getAttribute("method"));
		System.out.println("*****************");
		
		WebElement ele1=driver.findElement(By.xpath("//div[@id=\"logInPanelHeading\"]/parent::*"));
		System.out.println(ele1.getCssValue("color"));
		System.out.println("*****************");
		
		WebElement ele2=driver.findElement(By.xpath("//div[@id='divUsername']/descendant::span[@class='form-hint']"));
		System.out.println(ele2.getText());
		System.out.println("*****************");
		
		WebElement ele3=driver.findElement(By.xpath("//div[@id=\"divLoginButton\"]/descendant::a"));
		System.out.println(ele3.getAttribute("href"));
		System.out.println(ele3.getText());
		System.out.println("*****************");
		
		
		
		driver.close();
		
}
}
