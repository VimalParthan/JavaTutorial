package com.vimal;

import java.util.ArrayList;

public class MobilePhone {

	private String phoneNumber;

	private ArrayList<Contact> contacts;

	public MobilePhone(String phoneNumber) {
		super();
		this.phoneNumber = phoneNumber;
		this.contacts = new ArrayList<Contact>();
	}
	
	

	public String getPhoneNumber() {
		return phoneNumber;
	}



	public void printOptions(){
		System.out.println("1. Please enter 1 to view options");
		System.out.println("2. Please enter 2 print list of contacts");
		System.out.println("3. Please enter 3 to add new contact");
		System.out.println("4. Please enter 4 to update existing contact");
		System.out.println("5. Please enter 5 to remove contact");
		System.out.println("6. Please enter 6 to search for a contact");
		System.out.println("7. Please enter 7 to quit");
	
	}
	
	public void addContact(String contactName, String phoneNumber) {

		if (contactExist(contactName)) {
			Contact contact = new Contact(contactName, phoneNumber);
			this.contacts.add(contact);
			System.out.println("Contact of name : " + contactName + " and phoneNumber : " + phoneNumber + " added");

		} else {
			System.out.println("Contact already exists");
		}
	
	}

	public void modifyContact(String existingContactName, String newContactName, String newContactNumber) {
		int contactIndex = contactIndex(existingContactName);

		if (contactIndex >= 0) {
			modifyContact(new Contact(newContactName, newContactNumber), contactIndex);
			
			System.out.println("Contact Updated");
		} else {
			System.out.println("Contact already Exists");
		}
		
	}

	private void modifyContact(Contact contact, int contactIndex) {
		this.contacts.set(contactIndex, contact);
	}

	public void queryContact(String contactName) {

		int contactIndex = contactIndex(contactName);
		if (contactIndex >= 0) {
			System.out.println("Conatact name " + contacts.get(contactIndex).getName() + " cantact phone number: "
					+ this.contacts.get(contactIndex).getPhoneNumber());
		} else {
			System.out.println("Contact not found");

		}

	}

	public void removeContact(String contactName) {
		int contactIndex = contactIndex(contactName);

		if (contactIndex >= 0) {
			contacts.remove(contactIndex);
		} else {
			System.out.println("Contact does not exist");
		}
	
	}

	public void printcontactList() {
		if (contacts != null && !contacts.isEmpty()) {
		
			for (int i = 0; i < this.contacts.size(); i++) {
				System.out.println("Contanct name: " + contacts.get(i).getName() + "\nContact number: "
						+ contacts.get(i).getPhoneNumber());
				
			}
		} else {
			System.out.println("No contacts yet");
		}

	}

	private int contactIndex(String contactName) {
		int index = 0;
		for (int i = 0; i < this.contacts.size(); i++) {
			if (this.contacts.get(i).getName().equalsIgnoreCase(contactName)) {
				index = i;
				break;
			}
		}
		return index;
	}

	private boolean contactExist(String contactName) {
		if (contactIndex(contactName) >= 0) {
			return true;
		} else {
			return false;
		}
	}
	
	
}
