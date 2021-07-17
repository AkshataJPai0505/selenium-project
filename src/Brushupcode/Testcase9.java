package Brushupcode;

public class Testcase9 {

	public static void main(String[] args) {
		browserclass b=new browserclass();
		b.browserlaunch();
		b.openurl("https://www.google.com/");
		b.tohoverovertheelement("//input[@name=\"q\"]");
		String attributevalue=b.togetattributevale("//input[@name=\"q\"]", "title");
		System.out.println("The attribute value is "+attributevalue);
		b.closebrowser();

	}

}
