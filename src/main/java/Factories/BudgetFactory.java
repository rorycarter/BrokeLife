package Factories;

import TheDomain.Budget.Budget;
import TheDomain.Budget.Prices;

import java.util.Map;

/**
 * Created by Rory on 2017-08-14.
 */
public class BudgetFactory {
    public static Budget getBudget(Map<String,Double> values,Prices foodPrices)
    {

        Budget budget=new Budget.Builder()
                .budget(values.get(20.00))
                .foodPrices(foodPrices)
                .builder();
        return budget;

    }
}
