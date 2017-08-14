package TheDomain.StudentInfo;

/**
 * Created by Rory on 2017-08-07.
 */
public class WeighIn {
    private double weightNow;
    private double desiredWeight;
    private String screenId;

    public double getDesiredWeight() {
        return desiredWeight;
    }

    public double getWeightNow() {
        return weightNow;
    }

    public String getScreenId() {
        return screenId;
    }

    private  WeighIn(Builder build)
    {

        this.desiredWeight=build.desiredWeight;
        this.weightNow=build.weighNow;
        this.screenId=build.screenId;


    }
    public static class Builder
    {
        private double weighNow;
        private double desiredWeight;
        private String screenId;

        public Builder weighNow(double value)
        {

            this.weighNow=value;
            return this;

        }

        public Builder desiredWeight(double value)
        {

            this.desiredWeight=value;
            return this;
        }

        public Builder screenId (String value)
        {
            this.screenId=value;
            return this;


        }
        public WeighIn build()
        {

            return new WeighIn(this);

        }




    }
}
