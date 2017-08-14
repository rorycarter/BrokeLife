package Services.Impl;

import Services.UserService;
import TheDomain.StudentInfo.User;
import Repositories.UserRepository;
import Repositories.Impl.UserRepositoryImpl;

/**
 * Created by Rory on 2017-08-13.
 */
public class UserServiceImpl implements UserService {

    private static UserServiceImpl service=null;
    UserRepository services= UserRepositoryImpl.getInstance();


    public static UserServiceImpl getInstance()
    {
         if(service==null)
             service =new UserServiceImpl();
         return service;
    }


    public User create(User user)
    {
        return services.create(user);
    }

    public User read(String screenId)
    {

        return services.read(screenId);

    }

    public User update(User user)
    {

        return services.update(user);

    }
    public void delete(String screenId){
        services.delete(screenId);
    }


}
