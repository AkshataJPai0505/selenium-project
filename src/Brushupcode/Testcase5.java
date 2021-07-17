package Brushupcode;

public class Testcase5 {

	public static void main(String[] args) throws InterruptedException {
		browserclass b=new browserclass() ;
		b.browserlaunch();
		b.openurl("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		Thread.sleep(5000);
		String text=b.togettextofelementusingtags("button",2);
		System.out.println("The text is  "+text );
		Thread.sleep(5000);
		b.closebrowser();

	}

}
