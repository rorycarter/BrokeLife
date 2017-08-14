package Factories;

import TheDomain.Feedback.Contact;

import java.util.Map;

/**
 * Created by Rory on 2017-08-13.
 */
public class ContactFactory {
    public static Contact getContact(Map<String,String>values)
    {

        Contact contact=new Contact.Builder()
                .cellNo(values.get("cellNo"))
                .email(values.get("email"))
                .query(values.get("query"))
                .build();
        return contact;

    }


}
