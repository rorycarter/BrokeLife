package BrokeLife.com.Domain.Feedback;

import BrokeLife.com.Domain.StudentInfo.User;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Rory on 2017-08-13.
 */
public class Comments {
    private String comment;
    private User[] comments;   //storing all comments in array
    private Date date;
    ArrayList<User> userList=new ArrayList<>();   //list of people that commented


    public String getComment() {
        return comment;
    }

    public Date getDate() {
        return date;
    }

    public User[] getComments() {
        return comments;
    }

    public ArrayList<User> getUserList() {
        return userList;
    }

    private Comments()
    {



    }

    public Comments(Builder builder)
    {

        this.comment=builder.comment;
        this.date=builder.date;
    }
    public static class Builder
    {
        private String comment;
        private Date date;



        public Builder comment(String value)
        {

            this.comment=value;
            return this;

        }


        public Builder date(Date value)
        {


            this.date=value;
            return this;
        }

        public Comments build()
        {
            return new Comments(this);

        }
    }
}
