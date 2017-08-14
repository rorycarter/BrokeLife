package Repositories.Impl;

import Factories.UserFactory;
import Repositories.UserRepository;
import TheDomain.StudentInfo.User;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by Rory on 2017-08-14.
 */
public class UserRepositoryImplTest {
    User user;
    Map<String,String> userValues;
    UserRepository userRepository;
    Date date;

    @Before
    public void setUp() throws Exception {

    userValues=new HashMap<String,String>();
    userValues.put("screenId","Carter11");
    userValues.put("password","9876");
    user= UserFactory.getUser(userValues,date);
    userRepository=UserRepositoryImpl.getInstance();

    }

    @Test
    public void create() throws Exception {

        user=userRepository.create(user);
        assertEquals("Carter11",user.getScreenId());

    }

    @Test
    public void read() throws Exception {
        user=userRepository.read("Carter11");
        assertEquals("Carter",user.getPassword());

    }

    @Test
    public void update() throws Exception {
        user = userRepository.read("Carter11");
        User updateUser = new User.Builder()
                .screenId(userValues.get("Carter11"))
                .password(userValues.get("9876"))

                .build();
        userRepository.update(updateUser);
        user=userRepository.read("Carter11");
    }


    @Test
    public void delete() throws Exception {
        userRepository.delete("Carter11");
        user=userRepository.read("Carter11");
        assertNull(user);
    }

}