package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import contact.Contact;

class ContactTest {
	
	/**
	 * Tests the Contact to make sure it is in working order using JUnit.
	 */
	@Test
	void testContact() {
		Contact contact = new Contact("0000000001", "Douglas", "Bolden",
				"4233002190", "248 England Road");
		assertTrue(contact.getUniqueContactID().equals("0000000001"));
		assertTrue(contact.getFirstName().equals("Douglas"));
		assertTrue(contact.getLastName().equals("Bolden"));
		assertTrue(contact.getPhone().equals("4233002190"));
		assertTrue(contact.getAddress().equals("248 England Road"));
	}
	
	/**
	 * Tests the Unique Contact ID variable to make sure it is in working order using JUnit.
	 */
	@Test
	void testUniqueContactIDLength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Douglas", "Bolden",
					"4233002190", "248 England Road");
		});
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1This is 11", "Douglas", "Bolden",
					"4233002190", "248 England Road");
		});
	}
	
	/**
	 * Tests the First Name variable to make sure it is in working order using JUnit.
	 */
	@Test
	void testFirstNameLength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0000000001", null, "Bolden",
					"4233002190", "248 England Road");
		});
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0000000001", "1This is 11", "Bolden",
					"4233002190", "248 England Road");
		});
	}
	
	/**
	 * Tests the Last Name variable to make sure it is in working order using JUnit.
	 */
	@Test
	void testLastNameLength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0000000001", "Douglas", null,
					"4233002190", "248 England Road");
		});
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0000000001", "Douglas", "1This is 11",
					"4233002190", "248 England Road");
		});
	}
	
	/**
	 * Tests the Phone variable to make sure it is in working order using JUnit.
	 */
	@Test
	void testPhoneLength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0000000001", "Douglas", "Bolden",
					null, "248 England Road");
		});
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0000000001", "Douglas", "Bolden",
					"This is 9", "248 England Road");
		});
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0000000001", "Douglas", "Bolden",
					"1This is 11", "248 England Road");
		});
	}
	
	/**
	 * Tests the Address variable to make sure it is in working order using JUnit.
	 */
	@Test
	void testAddressLength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0000000001", "Douglas", "Bolden",
					"4233002190", null);
		});
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0000000001", "Douglas", "Bolden",
					"4233002190", "This has got to be at least thirty characters!");
		});
	}
	
	/**
	 * Tests the setter variables to make sure they are in working order using JUnit.
	 */
	@Test
	void testContactSetters() {
		Contact contact = new Contact("1", "1", "1", "1111111111", "1");
		contact.setFirstName("Douglas");
		contact.setLastName("Bolden");
		contact.setPhone("4233002190");
		contact.setAddress("248 England Road");
		
		assertTrue(contact.getFirstName().equals("Douglas"));
		assertTrue(contact.getLastName().equals("Bolden"));
		assertTrue(contact.getPhone().equals("4233002190"));
		assertTrue(contact.getAddress().equals("248 England Road"));
	}
	
	/**
	 * Tests the new First Name variable to make sure it is in working order using JUnit.
	 */
	@Test
	void testNewFirstNameLength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("0000000001", "Douglas", "Bolden",
					"4233002190", "248 England Road");
			contact.setFirstName(null);
		});
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("0000000001", "Douglas", "Bolden",
					"4233002190", "248 England Road");
			contact.setFirstName("1This is 11");
		});
	}
	
	/**
	 * Tests the new Last Name variable to make sure it is in working order using JUnit.
	 */
	@Test
	void testNewLastNameLength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("0000000001", "Douglas", "Bolden",
					"4233002190", "248 England Road");
			contact.setLastName(null);
		});
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("0000000001", "Douglas", "Bolden",
					"4233002190", "248 England Road");
			contact.setLastName("1This is 11");
		});
	}
	
	/**
	 * Tests the new Phone variable to make sure it is in working order using JUnit.
	 */
	@Test
	void testNewPhoneLength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("0000000001", "Douglas", "Bolden",
					"4233002190", "248 England Road");
			contact.setPhone(null);
		});
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("0000000001", "Douglas", "Bolden",
					"4233002190", "248 England Road");
			contact.setPhone("11111111111");
		});
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("0000000001", "Douglas", "Bolden",
					"4233002190", "248 England Road");
			contact.setPhone("111111111");
		});
	}

	/**
	 * Tests the new Address variable to make sure it is in working order using JUnit.
	 */
	@Test
	void testNewAddressLength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("0000000001", "Douglas", "Bolden",
					"4233002190", "248 England Road");
			contact.setAddress(null);
		});
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("0000000001", "Douglas", "Bolden",
					"4233002190", "248 England Road");
			contact.setAddress("This has got to be at least thirty characters!");
		});
	}
	
	/**
	 * Tests the toString() function to make sure it is displaying correctly using JUnit.
	 */
	@Test
	void toStringTest() {
		Contact contact = new Contact("0000000001", "Douglas", "Bolden",
				"4233002190", "248 England Road");
		
		String test = System.lineSeparator() + "Contact: " + contact.getFirstName() + " " +
		contact.getLastName() + System.lineSeparator() + "Phone: " + contact.getPhone() + 
		System.lineSeparator() + "Address: " + contact.getAddress() + System.lineSeparator();
		
		assertTrue(test.equals(contact.toString()));
	}
}
