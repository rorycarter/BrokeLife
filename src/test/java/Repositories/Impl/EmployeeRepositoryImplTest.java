package Repositories.Impl;

import Factories.EmployeeFactory;
import Repositories.EmployeeRepository;
import TheDomain.EmployeeInfo.Employee;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by Rory on 2017-08-14.
 */
public class EmployeeRepositoryImplTest {
    Employee employee;
    Map<String,String> employeeValues;
    EmployeeRepository employeeRepository;

    @Before
    public void setUp() throws Exception {
        employeeValues=new HashMap<String,String>();
        employeeValues.put("employeeId","Carter11");
        employeeValues.put("firstName","Rory");
        employeeValues.put("lastName","Carter");
        employeeValues.put("password","1234");
        employeeValues.put("job description","Developer");


        employee= EmployeeFactory.getEmployee(employeeValues);
        employeeRepository=EmployeeRepositoryImpl.getInstance();
    }

    @Test
    public void create() throws Exception {
        employee=employeeRepository.create(employee);
        assertEquals("Carter11",employee.getEmployeeId());
    }

    @Test
    public void read() throws Exception {

        employee=employeeRepository.read("Carter11");
        assertEquals("Rory", employee.getEmployeeId());



    }

    @Test
    public void update() throws Exception {

        employee=employeeRepository.read("Carter11");
        Employee updateEmployee=new Employee.Builder()
                .employeeId(employeeValues.get("employeeId"))
                .firstName(employeeValues.get("firstName"))
                .lastName(employeeValues.get("lastName"))
                .password(employeeValues.get("password"))
                .jobDescription(employeeValues.get("job description"))
                .build();

        employeeRepository.update(updateEmployee);
        employee=employeeRepository.read("Carter11");
        assertEquals("Rory",employee.getFirstName());


    }

    @Test
    public void delete() throws Exception {
        employeeRepository.delete("Carter11");
        Employee employee =employeeRepository.read("Carter11");
        assertNull(employee);
    }

}