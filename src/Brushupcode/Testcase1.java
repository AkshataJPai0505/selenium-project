package Brushupcode;

public class Testcase1 {
	
	public static void main(String[] args) throws InterruptedException {
		browserclass b=new browserclass() ;
		
		b.browserlaunch();
		b.openurl("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		Thread.sleep(5000);
		 b.clickonelementbyid("simpleAlert");
			String a=b.readalertmessage();
			System.out.println("The alert message is "+a);
			Thread.sleep(2000);
			b.clickonokinalert();
		b.closebrowser();
	}
	

}
