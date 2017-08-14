package Services;

import TheDomain.StudentInfo.User;
import Repositories.UserRepository;
import Repositories.Impl.UserRepositoryImpl;

/**
 * Created by Rory on 2017-08-13.
 */
public class UserServiceImpl implements UserService{

    private static UserServiceImpl service=null;
    UserRepository repository= UserRepositoryImpl.getInstance();


    public static UserServiceImpl getInstance()
    {
         if(service==null)
             service =new UserServiceImpl();
         return service;
    }


    public User create(User user)
    {
        return repository.create(user);
    }

    public User read(String id)
    {

        return repository.read(id);

    }

    public User update(User user)
    {

        return repository.update(user);

    }
    public void delete(String id){
        repository.delete(id);
    }


}
