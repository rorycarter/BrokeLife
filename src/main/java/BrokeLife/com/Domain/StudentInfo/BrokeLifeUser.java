package BrokeLife.com.Domain.StudentInfo;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Rory on 2017-08-06.
 */
public class BrokeLifeUser implements Serializable {



        private String screenID;
        private String password;
        private double budget;
        private Date dateJoined;



    public String getScreenID() {
            return screenID;
        }



    public String getPassword() {
            return password;
        }

    public double getBudget() {
        return budget;
    }

    public Date getDateJoined() {
        return dateJoined;
    }

    private BrokeLifeUser(Builder builder)
        {

            this.password=builder.password;
            this.screenID=builder.screenID;
            this.budget=builder.budget;
            this.dateJoined=builder.dateJoined;

        }

        public static class Builder
        {

            private String screenID;
            private String password;
            private double budget;
            private Date dateJoined;





            public Builder screenID(String value)
            {

                this.screenID=value;
                return this;



            }

            public Builder password(String value)
            {

                this.password=value;
                return this;
            }

            public Builder dateJoined(Date v)
            {

                this.dateJoined=v;
                return this;
            }

            public Builder budget(double val)
            {
                this.budget=val;
                return this;

            }
            public BrokeLifeUser build()
            {


                return new BrokeLifeUser(this);

            }
        }
        public boolean equals(Object o)
        {


            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BrokeLifeUser user = (BrokeLifeUser) o;

            return screenID == user.screenID;


        }

        public String hashcode()
        {

            return screenID;
        }
  }
