package Repositories;

import TheDomain.StudentInfo.User;

/**
 * Created by Rory on 2017-08-13.
 */
public interface UserRepository {
    User create(User user);
    User read(String screenId);
    User update(User user);
    void delete(String screenId);




}
