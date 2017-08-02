package com.vimal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer printer = new Printer(50,false);
		System.out.println("intital page count = " + printer.getNumberOfPagesPrinted());
		int pagesPrinted =printer.printPage(4);
		System.out.println("Pages printed was " + pagesPrinted + " new total count of pages printed "+printer.getNumberOfPagesPrinted());
		pagesPrinted =printer.printPage(2);
		System.out.println("Pages printed was " + pagesPrinted + " new total count of pages printed "+printer.getNumberOfPagesPrinted());

	}

}
