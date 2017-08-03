package com.vimal;

import java.util.ArrayList;

public class Contacts {

	private ArrayList<Contact> contacts =new ArrayList<Contact>();;

	public void addContact(String contactName, String phoneNumber) {

		if (contactExist(contactName)) {
			Contact contact = new Contact(contactName, phoneNumber);
			this.contacts.add(contact);
			System.out.println("Contact of name : " + contactName + "and phoneNumber : " + phoneNumber + "added");

		} else {
			System.out.println("Contact already exists");
		}
	}

	public void modifyContact(String existingContactName, String newContactName, String newContactNumber) {
		int contactIndex = contactIndex(existingContactName);

		if (contactIndex >= 0) {
			modifyContact(new Contact(newContactName, newContactNumber), contactIndex);
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

	public void printList() {
		if (contacts != null && !contacts.isEmpty()) {
			for (int i = 0; i < this.contacts.size(); i++) {
				System.out.println("Contanct name: " + contacts.get(i).getName() + "\nContact number: "
						+ contacts.get(i).getPhoneNumber());
				System.out.println("***************");
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
