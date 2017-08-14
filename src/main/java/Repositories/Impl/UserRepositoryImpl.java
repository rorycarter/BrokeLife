package Repositories.Impl;

import Repositories.UserRepository;
import TheDomain.StudentInfo.User;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Rory on 2017-08-13.
 */
public class UserRepositoryImpl implements UserRepository {
    private static UserRepositoryImpl repository = null;

    private Map<String,User> userTable;

    private UserRepositoryImpl() {
        userTable = new HashMap<String, User>();
    }

    public static UserRepositoryImpl getInstance(){
        if(repository==null)
            repository = new UserRepositoryImpl();
        return repository;
    }

    public User create(User user) {
        userTable.put(user.getScreenId(),user);
        User savedUser = userTable.get(user.getScreenId());
        return savedUser;
    }

    public User read(String screenId) {
        User user = userTable.get(screenId);
        return user;
    }

    public User update(User user) {
        userTable.put(user.getScreenId(),user);
        User savedUser= userTable.get(user.getScreenId());
        return savedUser;
    }

    public void delete(String screenId) {
       userTable.remove(screenId);

    }
}




