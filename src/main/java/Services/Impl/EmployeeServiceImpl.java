package Services.Impl;

import Repositories.EmployeeRepository;
import Repositories.Impl.EmployeeRepositoryImpl;
import Services.EmployeeService;
import TheDomain.EmployeeInfo.Employee;

/**
 * Created by Rory on 2017-08-14.
 */
public class EmployeeServiceImpl implements EmployeeService {
    private static EmployeeServiceImpl service=null;
    EmployeeRepositoryImpl services = EmployeeRepositoryImpl.getInstance();


    public static EmployeeServiceImpl getInstance()
    {
        if(service==null)
            service =new EmployeeServiceImpl();
        return service;
    }


    public Employee create(Employee Employee)
    {
        return services.create(Employee);
    }

    public Employee read(String  employeeId)
    {

        return services.read(employeeId);

    }

    public Employee update(Employee Employee)
    {

        return services.update(Employee);

    }
    public void delete(String employeeId){
        services.delete(employeeId);
    }


}
