package Repositories.Impl;

import Repositories.BudgetRepository;
import TheDomain.Budget.Budget;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Rory on 2017-08-14.
 */
public class BudgetRepositoryImpl implements BudgetRepository{
    private static BudgetRepositoryImpl repository = null;

    private Map<String,Budget> budgetTable;

    private BudgetRepositoryImpl() {
        budgetTable = new HashMap<String, Budget>();
    }

    public static BudgetRepositoryImpl getInstance(){
        if(repository==null)
            repository = new BudgetRepositoryImpl();
        return repository;
    }

    public Budget create(Budget budget) {
        budgetTable.put(budget.getScreenId(),budget);
        Budget savedBudget = budgetTable.get(budget.getBudget());
        return savedBudget;
    }

    public Budget read(String screenId) {
        Budget budget = budgetTable.get(screenId);
        return budget;
    }

    public Budget update(Budget budget) {
        budgetTable.put(budget.getScreenId(),budget);
        Budget savedBudget= budgetTable.get(budget.getScreenId());
        return savedBudget;
    }

    public void delete(String screenId) {
        budgetTable.remove(screenId);

    }
}
