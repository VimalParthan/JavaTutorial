package com.vimal;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BankAccountTest {
	
	private BankAccount bankAccount;
	private static int count;
	
	@BeforeClass
	public static void beforeClass(){
		System.out.println("this executes before any test cases"+count++);
	}
	
	@Before
	public void setup(){
		bankAccount = new BankAccount("Vimal", "Parthan", 1000.00, BankAccount.CHECKING);
		System.out.println("Running a test ....");
	}
	
	@Test
	public void deposit() throws Exception{
		double balance = bankAccount.deposit(200.00,true);
		assertEquals(1200.00, balance,0);
	}
	@Test
	public void withdraw_branch() throws Exception{
		double balance= bankAccount.withdraw(600.0, true);
		assertEquals(400.00, balance,0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void withdraw_notbranch() throws Exception{
		
		bankAccount.withdraw(600.0, false);
		fail("Should have thrown illegalArgumentException");
	}
	
	@Test
	public void getBalance_deposit() throws Exception{
		bankAccount.deposit(200.00, true);
		assertEquals(1200.00, bankAccount.getBalance(),0);
	}
	
	@Test
	public void getBalance_withdraw() throws Exception{
		bankAccount.withdraw(200.00, true);
		assertEquals(800.00, bankAccount.getBalance(),0);
	}
	
	@Test
	public void isChecking_true() throws Exception{
		assertTrue("The account is not a check ing account",bankAccount.isChecking());
	}
	
	@AfterClass
	public static void afterClass(){
		System.out.println("This executes after any test cases "+count++);
	}
	@After
	public void teardown(){
		System.out.println("Count "+ count++);
	}
}
