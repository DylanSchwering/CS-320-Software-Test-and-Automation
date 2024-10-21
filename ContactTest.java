package test;

import contacts.Contact;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {
	public String nineChar = "123456789";
	public String tenChar = "1234567890";
	public String elevenChar = "12345678901";
	public String thirtyOneChar = "1234567890123456789012345678901";
	
	@Test
	void testContact() {
		Contact Contact = new Contact(tenChar, tenChar, tenChar, tenChar, tenChar);
		assertTrue(Contact.getID().equals(tenChar));
		assertTrue(Contact.getfirstName().equals(tenChar));
		assertTrue(Contact.getlastName().equals(tenChar));
		assertTrue(Contact.getphone().equals(tenChar));
		assertTrue(Contact.getaddress().equals(tenChar));
	}
	@Test
	void testContactIDTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(elevenChar, tenChar, tenChar, tenChar, tenChar);
		});	}
	@Test
	void testContactIDIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, tenChar, tenChar, tenChar, tenChar);
		});	}
	@Test
	void testContactfirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(tenChar, elevenChar, tenChar, tenChar, tenChar);
		});	}
	@Test
	void testContactfirstNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(tenChar, null, tenChar, tenChar, tenChar);
		});	}
	@Test
	void testContactlastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(tenChar, tenChar, elevenChar, tenChar, tenChar);
		});	}
	@Test
	void testContactlastNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(tenChar, tenChar, null, tenChar, tenChar);
		});	}
	@Test
	void testContactphoneTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(tenChar, tenChar, tenChar, elevenChar, tenChar);
		});	}
	@Test
	void testContactphoneTooShort() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(tenChar, tenChar, tenChar, nineChar, tenChar);
		});	}
	@Test
	void testContactphoneIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(tenChar, tenChar, tenChar, null, tenChar);
		});	}
	@Test
	void testContactaddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(tenChar, tenChar, tenChar, tenChar, thirtyOneChar);
		});	}
	@Test
	void testContactaddressIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(tenChar, tenChar, tenChar, tenChar, null);
		});	}


}
