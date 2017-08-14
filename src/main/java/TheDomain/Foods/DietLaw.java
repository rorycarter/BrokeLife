package TheDomain.Foods;

/**
 * Created by Rory on 2017-08-12.
 */
public class DietLaw {
    private String halaal;
    private String kosher;


    public String getHalaal() {
        return halaal;
    }

    public String getKosher() {
        return kosher;
    }

    public DietLaw()
    {}

    private DietLaw(Builder build)
    {
        this.halaal=build.halaal;
        this.kosher=build.kosher;







    }
    public static class Builder
    {
        private String halaal;
        private String kosher;

        public Builder halaal(String value)
        {

            this.halaal=value;
            return this;


        }
        public Builder kosher(String value)
        {

            this.kosher=value;
            return this;


        }


        public DietLaw build()
        {


            return new DietLaw(this);
        }


    }

}
