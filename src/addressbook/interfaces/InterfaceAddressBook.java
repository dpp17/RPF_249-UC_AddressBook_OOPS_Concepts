package addressbook.interfaces;

import addressbook.model.Contacts;

public interface InterfaceAddressBook {

	void welcomeDisplay();
	int createContactDetails(Contacts contacts);
	void editByName(String firstName);
	void deleteByFirstName(String firstname);
}
