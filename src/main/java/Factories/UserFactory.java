package Factories;

import TheDomain.StudentInfo.User;

import java.util.Date;
import java.util.Map;

/**
 * Created by Rory on 2017-08-13.
 */
public class UserFactory {
    public static User getUser(Map<String,String > values,Date date) {
        User user = new User.Builder()
                .screenId(values.get("screenId"))
                .password(values.get("password"))
                .dateJoined(date)
                .build();

        return user;
    }
}
