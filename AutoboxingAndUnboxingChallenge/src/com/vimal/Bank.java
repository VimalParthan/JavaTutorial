package com.vimal;

import java.util.ArrayList;

public class Bank {

	private String bankName;

	private ArrayList<Branch> branches;

	public Bank(String bankName) {
		super();
		this.bankName = bankName;
		this.branches = new ArrayList<Branch>();
	}

	public String getBankName() {
		return bankName;
	}

	public ArrayList<Branch> getBranches() {
		return branches;
	}

	public boolean addBranch(String branchName) {
		Branch branch = getBranch(branchName);
		if (branch==null) {
			this.branches.add(new Branch(branchName));
			return true;
		} else {
			return false;
		}
	}

	public boolean addCustomerToBranch(String branchName, String customerName,double initialAmount) {

		Branch branch = getBranch(branchName);
		if (branch != null) {
			return branch.newCustomer(customerName, initialAmount);
		} else {
			return false;
		}
	}

	public boolean addCustomerTransaction(String branchName, String customerName, double transactionAmount) {

		Branch branch = getBranch(branchName);
		if (branch !=null) {
			return branch.addCustomerTransaction(customerName, transactionAmount);
		} else {
			return false;
		}
	}
	
	public boolean listCustomer(String branchName,boolean showTransactions){
		Branch branch = getBranch(branchName);
		if(branch!=null){
			System.out.println("Customer details for branch " + branch.getBranchName());
			ArrayList<Customer> branchCustomers = branch.getCustomers(); 
			for(int i=0;i<branchCustomers.size();i++){
				Customer branchCustomer = branchCustomers.get(i);
				System.out.println("Customer: " +branchCustomer.getCustomerName()+" ["+i+"]");
				if(showTransactions){
					System.out.println("Transactions");
					ArrayList<Double> transactions = branchCustomer.getTransactions();
					for(int j=0;j<transactions.size();j++){
						System.out.println("["+(j+1)+"] Amount "+transactions.get(j));
					}
				}
			}
			return true;
		}else{
			return false;
		}
		
	}

	private Branch getBranch(String branchName) {
		for (int i = 0; i < this.branches.size(); i++) {
			Branch checkedBranch = branches.get(i); 
			if (checkedBranch.getBranchName().equalsIgnoreCase(branchName)) {
				return checkedBranch;
			}
		}
		return null;
	}

	
	
}
