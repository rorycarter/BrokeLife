package Repositories;

import TheDomain.Budget.Budget;

/**
 * Created by Rory on 2017-08-14.
 */
public interface BudgetRepository {
    Budget create(Budget budget);
    Budget read(String screenId);
    Budget update(Budget budget);
    void delete(String screenId);
}
