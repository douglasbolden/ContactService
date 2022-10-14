package test;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import contact.Contact;

class ContactServiceTest {
	
	/**
	 * Tests the addition of contacts to the contact list.
	 */
	@Test
	void testContactAddition() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			List<Contact> contacts = new ArrayList<Contact>();
			Contact contact1 = new Contact("0000000001", "Douglas", "Bolden",
					"4233002190", "248 England Road");
			Contact contact2 = new Contact("0000000002", "Douglas", "Bolden",
					"4233002190", "248 England Road");
			Contact contact3 = new Contact("0000000001", "Douglas", "Bolden",
					"4233002190", "248 England Road");
			contact.ContactService.addContact(contact1, contacts);
			contact.ContactService.addContact(contact2, contacts);
			contact.ContactService.addContact(contact3, contacts);
	    });
	}
	
	/**
	 * Tests the deletion of contacts in the contact list.
	 */
	@Test
	void testContactDeletion() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			List<Contact> contacts = new ArrayList<Contact>();
			Contact contact1 = new Contact("0000000001", "Douglas", "Bolden",
					"4233002190", "248 England Road");
			Contact contact2 = new Contact("0000000002", "Douglas", "Bolden",
					"4233002190", "248 England Road");
			contacts.add(contact1);
			contacts.add(contact2);
			contact.ContactService.deleteContact(contact1, contacts);
			contact.ContactService.deleteContact(contact1, contacts);
			contact.ContactService.deleteContact(contact2, contacts);
		});
	}
	
	/**
	 * Tests the updates of a contact in the contact list.
	 */
	@Test
	void testContactUpdates() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			List<Contact> contacts = new ArrayList<Contact>();
			Contact contact1 = new Contact("0000000001", "Doug", "Bolden",
					"4233002190", "248 England Road");
			Contact contact2 = new Contact("0000000002", "Doug", "Bolden",
					"4233002190", "248 England Road");
			contacts.add(contact1);
			contact.ContactService.updateContact(contact1, "Douglas", "Bolden",
					"4233002190", "248 England Road", contacts);
			contact.ContactService.updateContact(contact2, "Douglas", "Bolden",
					"4233002190", "248 England Road", contacts);	
		});	
	}
}
