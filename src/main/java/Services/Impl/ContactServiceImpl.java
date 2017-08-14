package Services.Impl;

import Repositories.ContactRepository;
import Repositories.Impl.ContactRepositoryImpl;
import Services.ContactService;
import TheDomain.Feedback.Contact;

/**
 * Created by Rory on 2017-08-14.
 */
public class ContactServiceImpl implements ContactService {
    private static ContactServiceImpl service=null;
    ContactRepository services= ContactRepositoryImpl.getInstance();


    public static ContactServiceImpl getInstance()
    {
        if(service==null)
            service =new ContactServiceImpl();
        return service;
    }


    public Contact create(Contact Contact)
    {
        return services.create(Contact);
    }

    public Contact read(String screenId)
    {

        return services.read(screenId);

    }

    public Contact update(Contact Contact)
    {

        return services.update(Contact);

    }
    public void delete(String screenId){
        services.delete(screenId);
    }


}
