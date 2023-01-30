package addressbook.services;

import addressbook.interfaces.InterfaceAddressBook;
import addressbook.model.Contacts;

public class ImplementationsOfAddressBook implements InterfaceAddressBook{

	
	Contacts[] storeContactDelails = new Contacts[15];//array
	
	public void welcomeDisplay() {
		System.err.println("===================================");
		System.out.println("  ::  Welcome To Address_Book  ::  ");
		System.err.println("==================================="+'\n');
		
	}

	public int createContactDetails(Contacts contacts) {
		System.out.println(" List of All the Contscts ");
		int index = getEmptyIndexToStore();
		storeContactDelails[index] = contacts;
		return index;
	}
	
	private int getEmptyIndexToStore() {
		for(int i = 0; i <storeContactDelails.length; i++) {
				if(storeContactDelails[i] == null) {
				return i;
			}
		}
		return 0;
	}
}
