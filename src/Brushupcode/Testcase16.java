package Brushupcode;

public class Testcase16 {

	public static void main(String[] args) throws InterruptedException {
browserclass b=new browserclass() ;
		
		b.browserlaunch();
		b.openurl("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		b.displaydropdownoptions("//select[@id=\"multi-select\"]");
		Thread.sleep(3000);
		b.dropdownoptionusingid("//select[@id=\"multi-select\"]",3);
		Thread.sleep(3000);
		b.dropdownoptionusingtext("//select[@id=\"multi-select\"]", "Florida");
		Thread.sleep(3000);
		b.dropdownoptionusingvalue("//select[@id=\"multi-select\"]", "Pennsylvania");
		Thread.sleep(3000);
		b.deselectalldropdownoptions("//select[@id=\"multi-select\"]");
		Thread.sleep(3000);
		b.closebrowser();

	}

}