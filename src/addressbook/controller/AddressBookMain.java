package addressbook.controller;
import java.util.Scanner;

import addressbook.interfaces.InterfaceAddressBook;
import addressbook.model.Contacts;
import addressbook.services.ImplementationsOfAddressBook;

public class AddressBookMain {
	
	private static Scanner getDetailInput = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		InterfaceAddressBook inBook = new ImplementationsOfAddressBook();
		
		inBook.welcomeDisplay();
		System.out.println(" 1. Add New Contact ");
		
		Contacts contacts = getContacts();
		System.out.println("Added Contact Details :: "+'\n'+contacts);
		
		
		

	}
	
	private static Contacts getContacts() {
		Contacts contacts = new Contacts();
		
		System.out.println(" Enter FirstName:");
		contacts.setFirstName(getDetailInput.next());
		
		System.out.println(" Enter LastName:");
		contacts.setLastName(getDetailInput.next());
		
		System.out.println(" Enter Address:");
		contacts.setAddress(getDetailInput.next());
		
		System.out.println(" Enter City:");
		contacts.setCity(getDetailInput.next());
		
		System.out.println(" Enter State:");
		contacts.setState(getDetailInput.next());
		
		System.out.println(" Enter Email ID:");
		contacts.setEmail(getDetailInput.next());
		
		System.out.println(" Enter Zip:");
		contacts.setZip(getDetailInput.nextInt());
		
		System.out.println(" Enter Phone_Number:");
		contacts.setPhoneNumber(getDetailInput.nextLong());
		
		System.out.println(" Enter Aadhar_Number:");
		contacts.setAadharNumber(getDetailInput.nextLong());
		
		return contacts;
	}
}
