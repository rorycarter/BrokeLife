package BrokeLife.com.Domain.StudentInfo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Rory on 2017-08-13.
 */
public class User implements Serializable{
    private String screenId;
    private String password;
    private double budget;
    //private Date dateJoined;

    //ArrayList<Allergies>allergyList=new ArrayList<>();

    public String getScreenId() {
        return screenId;
    }



    public String getPassword() {
        return password;
    }

    public double getBudget() {
        return budget;
    }

   /* public Date getDateJoined() {
        return dateJoined;
    }*/

    private User(Builder builder)
    {

        this.password=builder.password;
        this.screenId=builder.screenID;
        this.budget=builder.budget;
        //this.dateJoined=builder.dateJoined;

    }

    public static class Builder
    {

        private String screenID;
        private String password;
        private double budget;
        //private Date dateJoined;





        public Builder screenId(String value)
        {

            this.screenID=value;
            return this;



        }

        public Builder password(String value)
        {

            this.password=value;
            return this;
        }

      /*  public Builder dateJoined(Date v)
        {

            this.dateJoined=v;
            return this;
        }
*/
        public Builder budget(double val)
        {
            this.budget=val;
            return this;

        }
        public User build()
        {


            return new User(this);

        }
    }
    public boolean equals(Object o)
    {


        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return screenId == user.screenId;


    }

    public String hashcode()
    {

        return screenId;
    }
}


