package Services.Impl;

import Repositories.BudgetRepository;
import Repositories.Impl.BudgetRepositoryImpl;
import Services.BudgetService;
import TheDomain.Budget.Budget;

/**
 * Created by Rory on 2017-08-14.
 */
public class BudgetServiceImpl implements BudgetService {
    private static BudgetServiceImpl service=null;
    BudgetRepository services= BudgetRepositoryImpl.getInstance();


    public static BudgetServiceImpl getInstance()
    {
        if(service==null)
            service =new BudgetServiceImpl();
        return service;
    }


    public Budget create(Budget Budget)
    {
        return service.create(Budget);
    }

    public Budget read(String screenId)
    {

        return service.read(screenId);

    }

    public Budget update(Budget Budget)
    {

        return service.update(Budget);

    }
    public void delete(String screenId){
        service.delete(screenId);
    }


}
