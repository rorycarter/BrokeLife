package TheDomain.Feedback;

import TheDomain.StudentInfo.User;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Rory on 2017-08-13.
 */
public class Comments {
    private User user;
    private String screenId;
    private String comment;
    private User[] comments;   //storing all comments in array
    private Date date;
    ArrayList<User> userList=new ArrayList<>();   //list of people that commented

    public User getScreenId() {
        return user;
    }

    public String getComment() {
        return comment;
    }

    public Date getDate() {
        return date;
    }

    public User[] getComments() {
        return comments;
    }

    public String getId() {
        return screenId;
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
        this.screenId=builder.screenId;
    }
    public static class Builder
    {
        private String comment;
        private Date date;
        private String screenId;



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
        public Builder screenID(String value)
        {
            this.screenId=value;
            return this;
        }

        public Comments build()
        {
            return new Comments(this);

        }
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Comments comment = (Comments) o;

        return comment.equals(comment.comment);
    }

    @Override
    public int hashCode() {
        return comment.hashCode();
    }
}

