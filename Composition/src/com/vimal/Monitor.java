package com.vimal;

public class Monitor {
	private String model;
	private String manufacturer;
	private int size;
	private Resolution nativeResotion;
	public Monitor(String model, String manufacturer, int size, Resolution nativeResotion) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.size = size;
		this.nativeResotion = nativeResotion;
	}
	
	public void drawPrixelAt(int x,int y,String color){
		System.out.println("Drawing pixel at "+x + ","+ y+" in colour "+ color);
	}
	
	public String getModel() {
		return model;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public int getSize() {
		return size;
	}
	public Resolution getNativeResotion() {
		return nativeResotion;
	}
	
	
	
}
