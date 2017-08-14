package Factories;

import TheDomain.EmployeeInfo.Employee;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by Rory on 2017-08-14.
 */
public class EmployeeFactoryTest {
    Employee employee;
    Map<String, String> employeeValues;
    @Before
    public void setUp() throws Exception {
        employeeValues=new HashMap<String,String>();
        employeeValues.put("firstName", "Rory");
        employeeValues.put("lastName","Carter");
        employeeValues.put("password","9876");
        employeeValues.put("job description","Developer");
        employeeValues.put("employeeId","1234");

        employee=EmployeeFactory.getEmployee(employeeValues);
    }

    @Test
    public void getEmployee() throws Exception {
        assertEquals(true,employee.equals(employee));
    }

}