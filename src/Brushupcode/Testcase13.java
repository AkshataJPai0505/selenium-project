package Brushupcode;

public class Testcase13 {

	public static void main(String[] args) throws InterruptedException {
browserclass b=new browserclass() ;
		
		b.browserlaunch();
		b.openurl("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		b.displaydropdownoptions("//select[@class=\"form-control\"]");
		Thread.sleep(3000);
		b.dropdownoptionusingtext("//select[@class=\"form-control\"]","Friday");
		Thread.sleep(3000);
		b.closebrowser();

	}

}
