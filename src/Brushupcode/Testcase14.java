package Brushupcode;

public class Testcase14 {

	public static void main(String[] args) throws InterruptedException {
browserclass b=new browserclass() ;
		
		b.browserlaunch();
		b.openurl("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		b.displaydropdownoptions("//select[@name=\"cars\"]");
		Thread.sleep(3000);
		b.dropdownoptionusingvalue("//select[@name=\"cars\"]","fiat");
		Thread.sleep(3000);
		b.closebrowser();

	}

}
