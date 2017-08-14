package Services.Impl;

import Repositories.Impl.WeighInRepositoryImpl;
import Repositories.WeighInRepository;
import Services.WeighInService;
import TheDomain.StudentInfo.User;
import TheDomain.StudentInfo.WeighIn;

/**
 * Created by Rory on 2017-08-14.
 */
public class WeighInServiceImpl implements WeighInService {
    private static WeighInServiceImpl service=null;
    WeighInRepository services= WeighInRepositoryImpl.getInstance();


    public static WeighInServiceImpl getInstance()
    {
        if(service==null)
            service =new WeighInServiceImpl();
        return service;
    }


    public WeighIn create(WeighIn WeighIn)
    {
        return services.create(WeighIn);
    }

    public WeighIn read(String screenId)
    {

        return services.read(screenId);

    }

    public WeighIn update(WeighIn WeighIn)
    {

        return services.update(WeighIn);

    }
    public void delete(String screenId){
        services.delete(screenId);
    }


}
