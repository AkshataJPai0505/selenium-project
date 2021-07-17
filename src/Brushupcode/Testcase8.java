package Brushupcode;

public class Testcase8 {

	public static void main(String[] args) throws InterruptedException {
browserclass b=new browserclass() ;
		
		b.browserlaunch();
		b.openurl("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		Thread.sleep(5000);
		String attributevalue= b.togetattributevale("//button[contains(text(),'Click to Open New Browser Window')]","id");
		System.out.println("The attribute value is "+attributevalue);
			
		b.closebrowser();

	}

}
