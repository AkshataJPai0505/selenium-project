
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class brokenlink {
	public static void main(String[] args) throws MalformedURLException, IOException {
		int validlink=0;
		int invalidlink=0;
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium jar\\Webdriver 92\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		List<WebElement> alllinks=driver.findElements(By.tagName("a"));
		
		List<WebElement> imglink=driver.findElements(By.tagName("img"));
		 alllinks.addAll(imglink);
		 
		 System.out.println("The total no of links "+alllinks.size());
		 
		 HttpURLConnection con=null;
		 
		 for(int i=0;i<alllinks.size();i++)
		 {
			 String url=alllinks.get(i).getAttribute("href");
			 
			 if(url!=null && !url.contains("javascript"))
			 {
				 con=(HttpURLConnection)(new URL(url)).openConnection();
				 con.connect();
				 con.setReadTimeout(3000);
				 
				 int rescode=con.getResponseCode();
				 
				 if(rescode>=400)
				 {
					 System.out.println("The status code of "+url+" ="+rescode);
					 invalidlink=invalidlink+1;
					 
				 }
				 else
				 {
					 System.out.println("The status code of "+url+" ="+rescode);
					 validlink=validlink+1;
				 }
			 }
			
			 
 }
		 
		 System.out.println("The total no of valid link is "+validlink);
		 System.out.println("The total no of invalid link is "+invalidlink);
		 driver.close();
	}

}
