package BrokeLife.com.Domain.StudentInfo;

/**
 * Created by Rory on 2017-08-07.
 */
public class WeighIn {
    private double weightNow;
    private double desiredWeight;

    public double getDesiredWeight() {
        return desiredWeight;
    }

    public double getWeightNow() {
        return weightNow;
    }



    private  WeighIn(Builder build)
    {

        this.desiredWeight=build.desiredWeight;
        this.weightNow=build.weighNow;



    }
    public static class Builder
    {
        private double weighNow;
        private double desiredWeight;

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

        public WeighIn build()
        {

            return new WeighIn(this);

        }




    }
}
