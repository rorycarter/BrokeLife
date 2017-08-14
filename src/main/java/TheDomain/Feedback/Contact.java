package BrokeLife.com.Domain.Feedback;

/**
 * Created by Rory on 2017-08-07.
 */
public class Contact
{

    private int cellNo;
    private String email;
    private String query;

    public Contact()
    {}


    private Contact(Builder builder)
    {

        this.cellNo=builder.cellNo;
        this.email=builder.email;
        this.query=builder.query;

    }
    public static class Builder
    {
        private int cellNo;
        private String email;
        private String query;


        public Builder cellNo(int value)
        {

            this.cellNo=value;
            return this;
        }
        public Builder email(String value)
        {

            this.email=value;
            return this;

        }
        public Builder query(String value)
        {
            this.query=value;
            return this;
        }

        public Contact build()
        {


            return new Contact(this);

        }

    }




}
