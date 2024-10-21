package contacts;

import java.util.HashMap;
import java.util.Map;

public class ContactService {

	private Map<String, Contact> contactMap = new HashMap<>();
	
	public boolean addContact(Contact contact) {
		if(contactMap.containsKey(contact.getID())) {
			return false;
		}
		contactMap.put(contact.getID(), contact);
		return true;
	}
	
    public boolean deleteContact(String contactID) {
        if (!contactMap.containsKey(contactID)) {
            return false; 
        }
        contactMap.remove(contactID);
        return true;
    }
	
        public boolean updateContact(String contactID, String firstName, String lastName, String phone, String address) {
            Contact contact = contactMap.get(contactID);
            if (contact == null) {
                return false;
            }
            contact.setFirstName(firstName);
            contact.setLastName(lastName);
            contact.setPhone(phone);
            contact.setAddress(address);
            return true;
        }
	
}
