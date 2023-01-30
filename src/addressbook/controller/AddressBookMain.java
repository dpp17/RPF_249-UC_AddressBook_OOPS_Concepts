package addressbook.controller;

import addressbook.interfaces.InterfaceAddressBook;
import addressbook.services.ImplementationsOfAddressBook;

public class AddressBookMain {

	public static void main(String[] args) {
		InterfaceAddressBook inBook = new ImplementationsOfAddressBook();
		
		inBook.welcomeDisplay();

	}

}
