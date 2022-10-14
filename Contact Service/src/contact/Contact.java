package contact;

public class Contact {
	
	// Variables to hold information
	private final String uniqueContactID;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	/**
	 * Constructor to create a Contact!
	 * Example:
	 * Contact(uniqueContactID, firstName, lastName, phone, address);
	 * 
	 * @param uniqueContactID - Unique Contact ID.
	 * @param firstName - First Name.
	 * @param lastName - Last Name.
	 * @param phone - Phone Number.
	 * @param address - Address.
	 */
	public Contact(String uniqueContactID, String firstName, String lastName, String phone, String address) {
		
		//make sure uniqueContactID conforms to set standards.
		if (uniqueContactID == null || uniqueContactID.length() > 10) {
			throw new IllegalArgumentException("Invalid Unique Identifier");
		}
		
		//make sure firstName conforms to set standards.
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		
		//make sure lastName conforms to set standards.
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		
		//make sure phone conforms to set standards.
		if (phone == null || phone.length() != 10) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
		
		//make sure address conforms to set standards.
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		
		// Set all passed variables to the local variables.
		this.uniqueContactID = uniqueContactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
	}
	
	/**
	 * Gets the Unique Contact ID.
	 * Example: *variable*.getUniqueContactID();
	 * 
	 * @return uniqueContactID
	 */
	public String getUniqueContactID() {
		return uniqueContactID;
	}

	/**
	 * Gets the First Name.
	 * Example: *variable*.getFirstName();
	 * 
	 * @return firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Gets the Last Name.
	 * Example: *variable*.getLastName();
	 * 
	 * @return lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Gets the Phone Number.
	 * Example: *variable*.getPhone();
	 * 
	 * @return phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * Gets the Address.
	 * Example: *variable*.getAddress();
	 * 
	 * @return address
	 */
	public String getAddress() {
		return address;
	}
	
	/**
	 * Checks to make sure passed argument conforms to naming standards, and then sets the new first name.
	 * Example: *variable*.setFirstName(newFirstName);
	 */
	public void setFirstName(String newFirstName) {
		if (newFirstName == null || newFirstName.length() > 10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		this.firstName = newFirstName;
	}
	
	/**
	 * Checks to make sure passed argument conforms to naming standards, and then sets the new last name.
	 * Example: *variable*.setLastName(newLastName);
	 */
	public void setLastName(String newLastName) {
		if (newLastName == null || newLastName.length() > 10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		this.lastName = newLastName;
	}
	
	/**
	 * Checks to make sure passed argument conforms to standards, and then sets the new phone number.
	 * Example: *variable*.setPhone(newPhone);
	 */
	public void setPhone(String newPhone) {
		if (newPhone == null || newPhone.length() != 10) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
		this.phone = newPhone;
	}
	
	/**
	 * Checks to make sure passed argument conforms to standards, and then sets the new address.
	 * Example: *variable*.setAddress(newAddress);
	 */
	public void setAddress(String newAddress) {
		if (newAddress == null || newAddress.length() > 30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		this.address = newAddress;
	}
	
	/**
	 * Generates a string of text for the contact. This is used by 'ContactService.java' for displaying each contact that is in a list.
	 */
	@Override
	public String toString() {
		return System.lineSeparator() + "Contact: " + firstName + " " +
	lastName + System.lineSeparator() + "Phone: " + phone + 
	System.lineSeparator() + "Address: " + address + System.lineSeparator();
	}
}
