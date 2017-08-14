package Services;

import TheDomain.EmployeeInfo.Employee;

/**
 * Created by Rory on 2017-08-14.
 */
public interface EmployeeService {
    Employee create(Employee employee);
    Employee read(String screenId);
    Employee update(Employee employee);
    void delete(String screenId);
}
