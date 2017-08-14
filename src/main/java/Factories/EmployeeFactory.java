package Factories;

import TheDomain.EmployeeInfo.Employee;

import java.util.Map;

/**
 * Created by Rory on 2017-08-14.
 */
public class EmployeeFactory {
    public static Employee getEmployee(Map<String,String> values)
    {

        Employee employee=new Employee.Builder()
                .employeeId("Carter11")
                .firstName(values.get("Rory"))
                .lastName(values.get("last name"))
                .password(values.get("password"))
                .jobDescription(values.get("job description"))
                .build();
        return employee;

    }
}
