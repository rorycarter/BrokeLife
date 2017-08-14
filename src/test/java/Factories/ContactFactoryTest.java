package Factories;

import TheDomain.Feedback.Contact;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by Rory on 2017-08-14.
 */
public class ContactFactoryTest {
    Contact contact;
    Map<String, String> contactValues;
    @Before
    public void setUp() throws Exception {
        contactValues=new HashMap<String,String>();

        contactValues.put("email","rorycarterit@gmail.com");
        contactValues.put("query","query");
        contactValues.put("cellNo","0813100042");

        contact=ContactFactory.getContact(contactValues);


    }

    @Test
    public void getContact() throws Exception {
        assertEquals(true,contact.equals(contact));
    }

}