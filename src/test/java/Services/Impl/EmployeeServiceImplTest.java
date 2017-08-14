package Services.Impl;

import Factories.EmployeeFactory;
import Repositories.EmployeeRepository;
import Repositories.Impl.EmployeeRepositoryImpl;
import Services.EmployeeService;
import TheDomain.EmployeeInfo.Employee;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by Rory on 2017-08-14.
 */
public class EmployeeServiceImplTest {
    Employee employee;
    Map<String,String> employeeValues;
    EmployeeService employeeService;

    @Before
    public void setUp() throws Exception {
        employeeValues=new HashMap<String,String>();
        employeeValues.put("employeeId","Carter11");
        employeeValues.put("firstName","Rory");
        employeeValues.put("lastName","Carter");
        employeeValues.put("password","1234");
        employeeValues.put("job description","Developer");


        employee= EmployeeFactory.getEmployee(employeeValues);
        employeeService= EmployeeServiceImpl.getInstance();
    }

    @Test
    public void create() throws Exception {
        employee=employeeService.create(employee);
        assertEquals("Carter11",employee.getEmployeeId());
    }

    @Test
    public void read() throws Exception {

        employee=employeeService.read("Carter11");
        assertEquals("Rory", employee.getEmployeeId());



    }

    @Test
    public void update() throws Exception {

        employee=employeeService.read("Carter11");
        Employee updateEmployee=new Employee.Builder()
                .employeeId(employeeValues.get("employeeId"))
                .firstName(employeeValues.get("firstName"))
                .lastName(employeeValues.get("lastName"))
                .password(employeeValues.get("password"))
                .jobDescription(employeeValues.get("job description"))
                .build();

        employeeService.update(updateEmployee);
        employee=employeeService.read("Carter11");
        assertEquals("Rory",employee.getFirstName());


    }

    @Test
    public void delete() throws Exception {
        employeeService.delete("Carter11");
        Employee employee =employeeService.read("Carter11");
        assertNull(employee);
    }


}