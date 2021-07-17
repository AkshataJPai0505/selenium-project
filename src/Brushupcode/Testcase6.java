package Brushupcode;

public class Testcase6 {
	public static void main(String[] args) throws InterruptedException {
	browserclass b=new browserclass() ;
	
	b.browserlaunch();
	b.openurl("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
	Thread.sleep(5000);
	b.toentertextelementusingtags("input",2,"Akshata");
	b.tocheckelementusingtags("button",3);
	Thread.sleep(5000);
	b.closebrowser();
}
}
