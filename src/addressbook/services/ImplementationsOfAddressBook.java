package addressbook.services;

import addressbook.interfaces.InterfaceAddressBook;

public class ImplementationsOfAddressBook implements InterfaceAddressBook{

	public void welcomeDisplay() {
		System.err.println("===================================");
		System.out.println("  ::  Welcome To Address_Book  ::  ");
		System.err.println("==================================="+'\n');
		
	}

}
