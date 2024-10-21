package contacts;

public class Contact {
	String ID;
	String firstName;
	String lastName;
	String phone;
	String address;
	
	public Contact(String ID, String firstName, String lastName, String phone, String address) {
		if (ID == null || ID.length() > 10) {
			throw new IllegalArgumentException("Invalid id");
		}
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid firstName");
		}
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid lastName");
		}
		if (phone == null || phone.length() > 10 || phone.length() < 10) {
			throw new IllegalArgumentException("Invalid phone");
		}
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid address");
		}
		this.ID = ID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
	}
	public String getID() {
		return ID;
	}
	public String getfirstName() {
		return firstName;
	}
	public String getlastName() {
		return lastName;
	}
	public String getphone() {
		return phone;
	}
	public String getaddress() {
		return address;
	}
	
    public void setFirstName(String firstName) {
        if (firstName != null && firstName.length() <= 10) {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        if (lastName != null && lastName.length() <= 10) {
            this.lastName = lastName;
        }
    }

    public void setPhone(String phone) {
        if (phone != null && phone.length() == 10) {
            this.phone = phone;
        }
    }

    public void setAddress(String address) {
        if (address != null && address.length() <= 30) {
            this.address = address;
        }
    }
}
