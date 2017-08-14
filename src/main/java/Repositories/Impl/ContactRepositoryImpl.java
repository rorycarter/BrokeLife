package Repositories.Impl;

import Repositories.ContactRepository;
import TheDomain.Feedback.Contact;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Rory on 2017-08-14.
 */
public class ContactRepositoryImpl implements ContactRepository{
    private static ContactRepositoryImpl repository = null;

    private Map<String,Contact> contactTable;

    private ContactRepositoryImpl() {
        contactTable = new HashMap<String, Contact>();
    }

    public static ContactRepositoryImpl getInstance(){
        if(repository==null)
            repository = new ContactRepositoryImpl();
        return repository;
    }

    public Contact create(Contact contact) {
        contactTable.put(contact.getEmail(),contact);
        Contact savedContact = contactTable.get(contact.getEmail());
        return savedContact;
    }

    public Contact read(String screenId) {
        Contact contact = contactTable.get(screenId);
        return contact;
    }

    public Contact update(Contact contact) {
        contactTable.put(contact.getScreenId(),contact);
        Contact savedContact= contactTable.get(contact.getScreenId());
        return savedContact;
    }

    public void delete(String screenId) {
        contactTable.remove(screenId);

    }
}
