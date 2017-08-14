package Factories;

import TheDomain.Feedback.Comments;
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
public class UserFactoryTest {

    User user;
    Date date = new Date();
    Comments comments;
    Map<String, String> userValues;
    @Before
    public void setUp() throws Exception {
        userValues = new HashMap<String, String>();
        userValues.put("screenId", "111");
        userValues.put("password", "19920455");

        user = UserFactory.getUser(userValues, date);



    }

    @Test
    public void getUser() throws Exception {
        assertEquals(true,user.equals(user));
    }

}