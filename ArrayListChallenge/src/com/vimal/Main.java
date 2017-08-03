package com.vimal;

import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner(System.in);

	private static MobilePhone mobilePhone = new MobilePhone("0091-729971309");

	public static void main(String[] args) {
		boolean terminate = false;

		mobilePhone.printOptions();

		int choice;

		while (!terminate) {

			System.out.println("Please enter your choice(1 to print options): ");
			choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 1:
				mobilePhone.printOptions();
				break;
			case 2:
				mobilePhone.printcontactList();
				break;
			case 3:
				addNewContact();
				break;
			case 4:
				updateExistingContact();
				break;
			case 5:
				removeContact();
				break;
			case 6:
				searchForContact();
				break;
			case 7:
				terminate = true;
				System.out.println("Terminating ............");
			default:
				System.out.println("Invalid choice, Please enter a valid choice from the list below");
				mobilePhone.printOptions();
				break;
			}

		}
	}

	private static void addNewContact() {

		System.out.println("Please enter the name of the new contact ot be added:");
		String name = scanner.nextLine();
		System.out.println("Please enter the phone number of the new contact ot be added:");
		String phoneNumber = scanner.nextLine();
		mobilePhone.addContact(name, phoneNumber);

	}

	private static void updateExistingContact() {

		System.out.println("Please enter the name of the contact to be updated:");
		String existingName = scanner.nextLine();
		System.out.println("Please enter the new name to be updated:");
		String newName = scanner.nextLine();
		System.out.println("Please enter the new number to be updated:");
		String newNumber = scanner.nextLine();
		mobilePhone.modifyContact(existingName, newName, newNumber);

	}

	private static void removeContact() {

		System.out.println("Please enter the name of the contact to be removed:");
		String name = scanner.nextLine();
		mobilePhone.removeContact(name);

	}

	private static void searchForContact() {

		System.out.println("Please enter the name of the contact to be queries:");
		String name = scanner.nextLine();
		mobilePhone.queryContact(name);

	}

}
