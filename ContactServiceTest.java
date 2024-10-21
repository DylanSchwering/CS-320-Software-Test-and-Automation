package test;

import contacts.Contact;
import contacts.ContactService;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {
	public String nineChar = "123456789";
	public String tenChar = "1234567890";
	public String elevenChar = "12345678901";
	public String thirtyOneChar = "1234567890123456789012345678901";
	
    private ContactService contactService;

    @Test
    void testAddContact() {
        ContactService contactService = new ContactService();
        Contact contact = new Contact(tenChar, tenChar, tenChar, tenChar, tenChar);
        assertTrue(contactService.addContact(contact));
    }

    @Test
    void testAddDuplicateContact() {
        ContactService contactService = new ContactService();
        Contact contact = new Contact(tenChar, tenChar, tenChar, tenChar, tenChar);
        contactService.addContact(contact);
        assertFalse(contactService.addContact(contact)); // Duplicate ID should return false
    }

    @Test
    void testDeleteContact() {
        ContactService contactService = new ContactService();
        Contact contact = new Contact(tenChar, tenChar, tenChar, tenChar, tenChar);
        contactService.addContact(contact);
        assertTrue(contactService.deleteContact(tenChar));
        assertFalse(contactService.deleteContact(tenChar)); // Contact no longer exists
    }

    @Test
    void testUpdateContact() {
        ContactService contactService = new ContactService();
        Contact contact = new Contact(tenChar, tenChar, tenChar, tenChar, tenChar);
        contactService.addContact(contact);
        assertTrue(contactService.updateContact(tenChar, tenChar, tenChar, tenChar, tenChar));

        // Verifying updates directly
        assertEquals(tenChar, contact.getfirstName());
        assertEquals(tenChar, contact.getlastName());
        assertEquals(tenChar, contact.getphone());
        assertEquals(tenChar, contact.getaddress());
    }

    @Test
    void testUpdateNonExistentContact() {
        ContactService contactService = new ContactService();
        assertFalse(contactService.updateContact("99999", tenChar, tenChar, tenChar, tenChar));
    }
}
