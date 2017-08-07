package BrokeLife.com.Domain.StudentInfo;

/**
 * Created by Rory on 2017-08-07.
 */
public class Budget {
    private double budget;
    double foodPrices;
    public void calcBudget(double newValue) {
        newValue=foodPrices - budget;

    }
}
