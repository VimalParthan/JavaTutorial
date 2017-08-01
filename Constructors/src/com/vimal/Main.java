package com.vimal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount bobsAccount = new BankAccount("12345",0.00,"Bob  Brown","bob@gmail.com","0091 50 8653003");
		
		
		bobsAccount.withdrawFunds(1000);
		
		bobsAccount.deposit(50);
		bobsAccount.withdrawFunds(100);
		
		bobsAccount.deposit(51);
		bobsAccount.withdrawFunds(100);
	
		VipCustomer person1 = new VipCustomer();
		System.out.println(person1.getName());
		
		VipCustomer person2 = new VipCustomer("Bob",25000);
		System.out.println(person2.getName());
		
		VipCustomer person3 = new VipCustomer("Tim",100.00,"tim@gmail.com");
		System.out.println(person3.getName());
		System.out.println(person3.getEmailAddress());
	}

}
