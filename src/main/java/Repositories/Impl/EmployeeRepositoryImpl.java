package Repositories.Impl;

import Repositories.EmployeeRepository;
import TheDomain.EmployeeInfo.Employee;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Rory on 2017-08-14.
 */
public class EmployeeRepositoryImpl implements EmployeeRepository {
    private static EmployeeRepositoryImpl repository = null;

    private Map<String,Employee> employeeTable;

    private EmployeeRepositoryImpl() {
        employeeTable = new HashMap<String, Employee>();
    }

    public static EmployeeRepositoryImpl getInstance(){
        if(repository==null) {

            repository = new EmployeeRepositoryImpl();
        }
            return repository;
    }

    public Employee create(Employee employee) {
        employeeTable.put(employee.getEmployeeId(),employee);
        Employee savedEmployee = employeeTable.get(employee.getEmployeeId());
        return savedEmployee;
    }

    public Employee read(String employeeId) {
        Employee employee = employeeTable.get(employeeId);
        return employee;
    }

    public Employee update(Employee employee) {
        employeeTable.put(employee.getEmployeeId(),employee);
        Employee savedEmployee= employeeTable.get(employee.getEmployeeId());
        return savedEmployee;
    }

    public void delete(String employeeId) {
        employeeTable.remove(employeeId);

    }
}
