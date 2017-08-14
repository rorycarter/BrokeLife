package TheDomain.Budget;

/**
 * Created by Rory on 2017-08-07.
 */
public class Budget implements iCalculateBudget  {
    private double budget;
    private String screenId;
    private Prices foodPrices;
    public void calcBudget(double newValue) {
        newValue=budget-foodPrices.getFoodPrices() ;

    }

    public Prices getFoodPrices() {
        return foodPrices;
    }

    public String getScreenId() {
        return screenId;
    }

    public double getBudget() {
        return budget;
    }


    private Budget(Builder builder)
    {
        this.budget=builder.budget;
        this.foodPrices=builder.foodPrices;
        this.screenId=builder.screenId;
    }
    public static class Builder
    {

        private double budget;
        private Prices foodPrices;
        private String screenId;

        public Builder budget(double value)
        {
            this.budget=value;
            return this;


        }
        public Builder foodPrices(Prices value)
        {

            this.foodPrices=value;
            return this;
        }
        public Builder screenId(String value)
        {

            this.screenId=value;
            return this;

        }
        public Budget builder()
        {
            return new Budget(this);

        }


    }
}
