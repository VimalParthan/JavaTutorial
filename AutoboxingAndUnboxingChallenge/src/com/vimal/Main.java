package com.vimal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new Bank("National Australia Bank");
		bank.addBranch("Adelaide");
		bank.addCustomerToBranch("Adelaide", "Tim", 50.05);
		bank.addCustomerToBranch("Adelaide", "Mike", 2111.21);
		bank.addCustomerToBranch("Adelaide", "Percy", 211.2121);
	
		bank.addBranch("Sydney");
		bank.addCustomerToBranch("Adelaide", "Tim", 2121.0);
		
		bank.addCustomerTransaction("Adelaide", "Tim", 322.2);
		bank.addCustomerTransaction("Adelaide", "Tim", 3232.32);
		bank.addCustomerTransaction("Adelaide", "Mike", 43242.54);
		
		bank.listCustomer("Adelaide", true);
		
	}

}
