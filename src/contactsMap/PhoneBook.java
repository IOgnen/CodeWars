package contactsMap;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {

    public Map<String, Set<Contact>> contactsByName;
    public Map<String, Contact> contactsByNumber;

    public PhoneBook(Map<String,Set<Contact>> contactsByName, Map<String, Contact> contactsByNumber) {
        this.contactsByName = contactsByName;
        this.contactsByNumber = contactsByNumber;
    }

    public void addContact(String name, String number) {

        Contact contact = new Contact(name, number);
        Set<Contact> contacts = new HashSet<>();
        contacts.add(contact);

    }

}
