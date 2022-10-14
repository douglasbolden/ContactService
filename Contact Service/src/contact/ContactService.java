package contact;

import java.util.*;

public class ContactService {
	/**
	 * Makes sure that the passed contact's Unique Contact ID is not currently
	 * in the contacts list. If it is, function throws an exception. If it isn't,
	 * the contact is added to the list.
	 * 
	 * @param contact - Contact to test against in the list of contacts.
	 * @param contacts - List of contacts.
	 */
	public static void addContact(Contact contact, List<Contact> contacts) {
		for (Contact current : contacts) {
			if (contact.getUniqueContactID().equals(current.getUniqueContactID())) {
				throw new IllegalArgumentException("Unique Identifier already in use.");
			}
		}
		contacts.add(contact);
	}
	
	/**
	 * Checks if contacts list contains passed contact. If it contains the passed
	 * contact, it deletes it, otherwise it throws an exception.
	 * 
	 * @param contact - Contact to check list for.
	 * @param contacts - List of contacts.
	 */
	public static void deleteContact(Contact contact, List<Contact> contacts) {
		if (contacts.contains(contact)) {
			contacts.remove(contact);
		}
		else {
			throw new IllegalArgumentException("Contact not in contacts list");
		}
	}
	
	/**
	 * Checks if contacts list contains passed contact. If it contains the passed
	 * contact, it updates it with passed parameters, otherwise it throws an exception.
	 * 
	 * @param contact - Contact to update.
	 * @param firstName - New First Name.
	 * @param lastName - New Last Name.
	 * @param phone - New Phone Number.
	 * @param address - New Address.
	 * @param contacts - List of contacts.
	 */
	public static void updateContact(Contact contact, String firstName,
			String lastName, String phone, String address, List<Contact> contacts) {
		if (contacts.contains(contact)) {
			contact.setFirstName(firstName);
			contact.setLastName(lastName);
			contact.setPhone(phone);
			contact.setAddress(address);
		}
		else {
			throw new IllegalArgumentException("Contact not in contacts list");
		}
	}
	
	
	/**
	 * Main method - Allows contacts list to be populated, and allows user to pass variables to various functions in the application.
	 * 
	 * @return contacts in contact list into the console formatted nicely.
	 */
	/*
	public static void main(String[] args) {
		List<Contact> contacts = new ArrayList<Contact>();
		Contact douglas = new Contact("1", "Douglas", "Bolden",
				"4233002190", "248 England Road");
		Contact kelly = new Contact("2", "Kelly", "artin",
				"4235551234", "153 Highway Road");
		Contact william = new Contact("3", "William", "Brooks",
				"4238675309", "1234 WhereILive Road");
		Contact misty = new Contact("4", "Misty", "Bolden",
				"4235554567", "248 England Road");
		Contact alyssa = new Contact("5", "Alyssa", "Bolden",
				"8655558798", "369 Crreoct Lane");
		
		addContact(douglas, contacts);
		addContact(kelly, contacts);
		addContact(william, contacts);
		addContact(misty, contacts);
		addContact(alyssa, contacts);
		
		deleteContact(douglas, contacts);
		deleteContact(william, contacts);
		
		updateContact(kelly, "Kelly", "Partin", "4235551234",
				"153 Highway Road", contacts);
		
		System.out.println(contacts);
	}
	*/
	
}
