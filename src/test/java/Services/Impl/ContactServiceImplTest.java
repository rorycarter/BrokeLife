package Services.Impl;

import Factories.ContactFactory;
import Repositories.ContactRepository;
import Services.ContactService;
import TheDomain.Feedback.Contact;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by Rory on 2017-08-14.
 */
public class ContactServiceImplTest {
    Contact contact;
    Map<String,String> contactValues;
    ContactService contactService;

    @Before
    public void setUp() throws Exception {


        contactValues=new HashMap<String,String>();
        contactValues.put("email","rorycarterit@gmail.com");
        contactValues.put("query","rorycarterit@gmail.com");
        contactValues.put("cellNo","0813100042");
        contactValues.put("screenId","Carter11");
        contact= ContactFactory.getContact(contactValues);
    }

    @Test
    public void create() throws Exception {
        Contact contact=ContactFactory.getContact(contactValues);
        contactService.create(contact);
        assertEquals("Carter11", contact.getScreenId());
    }

    @Test
    public void read() throws Exception {

        Contact contact=contactService.read("Carter11");
        assertEquals("email", contact.getEmail());
    }

    @Test
    public void update() throws Exception {
        Contact contact = contactService.read("Carter11");
        Contact updateContact = new Contact.Builder()

                .screenId(contactValues.get("Carter11"))
                .cellNo(contactValues.get("cellphone"))
                .query(contactValues.get("query"))
                .email(contactValues.get("rorycarterit@gmail.com"))

                .build();
        contactService.update(updateContact);
        contact = contactService.read("1");
        assertEquals("rorycarterit@gmail.com",contact.getEmail());
    }

    @Test
    public void delete() throws Exception {
        contactService.delete("Carter11");
        Contact contact=contactService.read("Carter11");
        assertNull(contact);
    }


}