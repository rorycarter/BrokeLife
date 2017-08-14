package Repositories;

import TheDomain.Feedback.Contact;

/**
 * Created by Rory on 2017-08-14.
 */
public interface ContactRepository {
    Contact create(Contact contact);
    Contact read(String screenId);
    Contact update(Contact contact);
    void delete(String screenId);
}
