package TheDomain.Foods;

/**
 * Created by Rory on 2017-08-07.
 */
public class Prices {
    private double foodPrices;


    public void setFoodPrices(double foodPrices) {
        this.foodPrices = foodPrices;
    }

    public double getFoodPrices() {
        return foodPrices;
    }

    public Prices(){

    }

    private Prices(Builder build)
    {
    this.foodPrices=build.foodPrices;


    }
public static class Builder
{
    private double foodPrices;


    public Builder Prices(double value)
    {
        this.foodPrices=value;
        return this;

    }

    public Prices build()
    {


        return new Prices(this);
    }
}


}
