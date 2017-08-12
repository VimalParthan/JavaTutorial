package com.vimal;

public class Main {

	public static void main(String[] args) {
		
		ITelephone vimalsPhone;
		vimalsPhone = new DeskPhone(123456);
		vimalsPhone.powerOn();
		vimalsPhone.callPhone(123456);
		vimalsPhone.answer();
		
		vimalsPhone = new MobilePhone(24565);
		vimalsPhone.powerOn();
		vimalsPhone.callPhone(24565);
		vimalsPhone.answer();
	}

}
