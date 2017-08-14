package BrokeLife.com.Domain.Budget;

import BrokeLife.com.Domain.Foods.Prices;

/**
 * Created by Rory on 2017-08-07.
 */
public class Budget implements iCalculateBudget  {
    private double budget;
    private Prices foodPrices;
    public void calcBudget(double newValue) {
        newValue=foodPrices.getFoodPrices() - budget;

    }

    public Prices getFoodPrices() {
        return foodPrices;
    }

    public double getBudget() {
        return budget;
    }


}
