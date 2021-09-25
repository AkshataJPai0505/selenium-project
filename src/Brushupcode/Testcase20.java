package Brushupcode;

public class Testcase20 {
	
	public static void main(String[] args) throws InterruptedException {
		browserclass b=new browserclass() ;
		
		b.browserlaunch();
		b.openurl("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		Thread.sleep(5000);
		b.switchtoframeusingindex(2);
		 b.clickonelementbyidandsenddata("searchInput","google");
		 b.switchtoparentframe();
		String value=b.togetattributevale("//button[@id=\"doubleClickBtn\"]","ondblclick");
		System.out.println("The value of attribute is "+value);
			Thread.sleep(2000);
			
		b.closebrowser();
	}
	

}
