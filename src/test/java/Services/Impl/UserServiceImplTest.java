package Services.Impl;

import Factories.UserFactory;
import Repositories.Impl.UserRepositoryImpl;
import Repositories.UserRepository;
import Services.UserService;
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
public class UserServiceImplTest {
    User user;
    Map<String,String> userValues;
    UserService userService;
    Date date;

    @Before
    public void setUp() throws Exception {

        userValues=new HashMap<String,String>();
        userValues.put("screenId","Carter11");
        userValues.put("password","9876");
        user= UserFactory.getUser(userValues,date);
        userService= UserServiceImpl.getInstance();

    }

    @Test
    public void create() throws Exception {

        user=userService.create(user);
        assertEquals("Carter11",user.getScreenId());

    }

    @Test
    public void read() throws Exception {
        user=userService.read("Carter11");
        assertEquals("Carter",user.getPassword());

    }

    @Test
    public void update() throws Exception {
        user = userService.read("Carter11");
        User updateUser = new User.Builder()
                .screenId(userValues.get("Carter11"))
                .password(userValues.get("9876"))

                .build();
        userService.update(updateUser);
        user=userService.read("Carter11");
    }


    @Test
    public void delete() throws Exception {
        userService.delete("Carter11");
        user=userService.read("Carter11");
        assertNull(user);
    }


}