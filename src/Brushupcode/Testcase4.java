package Brushupcode;

public class Testcase4 {
	public static void main(String[] args) throws InterruptedException {
		browserclass b=new browserclass() ;
		
		b.browserlaunch();
		b.openurl("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		Thread.sleep(5000);
		b.clickonelementusingtags("button",5);
		Thread.sleep(5000);
		String a=b.readalertmessage();
		System.out.println("The alert message is "+a);
		Thread.sleep(5000);
		b.toentermessageinalertbox("Akshata J Pai");
		Thread.sleep(5000);
		b.clickoncancelinalert();
		Thread.sleep(5000);
		b.closebrowser();
	}
}
