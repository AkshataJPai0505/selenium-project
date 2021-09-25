package Brushupcode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class browserclass {
	WebDriver driver;
	
	//to launch browser
	void browserlaunch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\webdriver 91\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	//to open url
	void openurl(String url)
	{
		driver.get(url);
	}
	
	//to close browser
	void closebrowser()
	{
		driver.close();
		}
	
	//to click on element based on id
	void clickonelementbyid(String id)
	{
	driver.findElement(By.id(id)).click();
	}
	
	//to click on element based on id and send data
		void clickonelementbyidandsenddata(String id,String text)
		{
		driver.findElement(By.id(id)).sendKeys(text);
		}	
	
	//to click on OK in Alert
	void clickonokinalert()
	{
	   driver.switchTo().alert().accept();	
	}
	
	//to click on Cancel in Alert
		void clickoncancelinalert()
		{
		   driver.switchTo().alert().dismiss();	
		}
		
		//to read message  in Alert
				String readalertmessage()
				{
				  String message= driver.switchTo().alert().getText();	
				   return message;
				}
				//to enter message  in Alert Box
				void toentermessageinalertbox(String message)
				{
				   driver.switchTo().alert().sendKeys(message);	
				   
				}
				
// to click on elements with given occurrences
				void clickonelementusingtags(String tag,int index)
				{
					List<WebElement> a=driver.findElements(By.tagName(tag));
					
					
						a.get(index).click();
					
				}
//to get the text of a particular element
				String togettextofelementusingtags(String tag,int index)
				{
					List<WebElement> a=driver.findElements(By.tagName(tag));
					
					
						String text=a.get(index).getText();
						return text;
					
				}
				
				// to enter on elements with given occurrences
				void toentertextelementusingtags(String tag,int index,String text)
				{
					List<WebElement> a=driver.findElements(By.tagName(tag));
					
					
						a.get(index).sendKeys(text);
					
				}				
	
		//to check the element
				// to enter on elements with given occurrences
				void tocheckelementusingtags(String tag,int index)
				{
					List<WebElement> a=driver.findElements(By.tagName(tag));
					
					for(int i=0;i<a.size();i++)
					{
						String m =a.get(i).getText();
						
						if(i==index)
						{
							System.out.println(m);
						}
					}
						
					
				}			
				
//to get the attribute value from xpath
				
				String  togetattributevale(String xpath,String value)
				{
				String a=driver.findElement(By.xpath(xpath)).getAttribute(value);
				return a;
				}
// function to hover the mouse on element
				void tohoverovertheelement(String element)
				{
					WebElement e=driver.findElement(By.xpath(element));
					Actions a=new Actions(driver);
					a.moveToElement(e).perform();
				}	
//to display all the options of dropdown
				void displaydropdownoptions(String dropdown)
				{
					WebElement a=driver.findElement(By.xpath(dropdown));
					Select s= new Select(a);
					List<WebElement>opt=s.getOptions();
					for(int i=0;i<opt.size();i++)
					{
						String text=opt.get(i).getText();
						System.out.println(text);
					}
				}
					
//to select drop down option using id		
					void dropdownoptionusingid(String dropdown,int index)
					{
						WebElement a=driver.findElement(By.xpath(dropdown));
						Select s= new Select(a);
						s.selectByIndex(index);
					}
				
//to select drop down using visible text
					void dropdownoptionusingtext(String dropdown,String text)
					{
						WebElement a=driver.findElement(By.xpath(dropdown));
						Select s= new Select(a);
						s.selectByVisibleText(text);
					}
//to select drop down using value 
					void dropdownoptionusingvalue(String dropdown,String text)
					{
						WebElement a=driver.findElement(By.xpath(dropdown));
						Select s= new Select(a);
						s.selectByValue(text);
					}	
//to deselect drop down all value 
					void deselectalldropdownoptions(String dropdown)
					{
						WebElement a=driver.findElement(By.xpath(dropdown));
						Select s= new Select(a);
						s.deselectAll();
					}	
//to deselect drop down option using id		
					void deselectdropdownoptionusingid(String dropdown,int index)
					{
						WebElement a=driver.findElement(By.xpath(dropdown));
						Select s= new Select(a);
						s.deselectByIndex(index);
					}
//to deselect drop down using visible text
					void deselectdropdownoptionusingtext(String dropdown,String text)
					{
						WebElement a=driver.findElement(By.xpath(dropdown));
						Select s= new Select(a);
						s.deselectByVisibleText(text);
					}									
				
//to deselect drop down using value 
					void deselectdropdownoptionusingvalue(String dropdown,String text)
					{
						WebElement a=driver.findElement(By.xpath(dropdown));
						Select s= new Select(a);
						s.deselectByValue(text);
					}	
//to switch to frame using index
					void switchtoframeusingindex(int index)
					{
						driver.switchTo().frame(index);
					}
//to switch to frame using id or name
					void switchtoframeusingidorname(String text)
					{
						driver.switchTo().frame(text);
					}	
//to switch to parent frame	
					void switchtoparentframe()
					{
						driver.switchTo().parentFrame();
					}	
				
				
				
				
				
				
				
				
				
				
				
				
				

}
