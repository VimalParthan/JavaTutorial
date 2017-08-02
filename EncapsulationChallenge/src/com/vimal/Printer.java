package com.vimal;

public class Printer {
	
	private int tonerLevel =100;
	private int numberOfPagesPrinted;
	private boolean duplexPrinter;
	
	public Printer(int tonerLevel,boolean duplexPrinter) {
		super();
		if(tonerLevel>=0&&tonerLevel<=100){
			this.tonerLevel = tonerLevel;
		}else{
			this.tonerLevel = -1;
		}
		this.numberOfPagesPrinted = 0;
		this.duplexPrinter = duplexPrinter;
	}
	
	public int fillUpToner(int fillUpPercentage) {
		if((fillUpPercentage+this.tonerLevel)<=100&&fillUpPercentage>0){
			this.tonerLevel += fillUpPercentage;
			return this.tonerLevel;
		}else{
			return -1;
		}
		
	}
	
	public int printPage(int pages){
		int pagesToPrint = pages;
		if(this.duplexPrinter){
			pagesToPrint /=2;
			System.out.println("Printing in duplex mode");
		}
		this.numberOfPagesPrinted+=pagesToPrint;
		return pagesToPrint;
		
	}

	public int getNumberOfPagesPrinted() {
		return numberOfPagesPrinted;
	}

	
	
	
	
	
}
