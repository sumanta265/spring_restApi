package com.sumanta.RestAPI.Service;

import com.sumanta.RestAPI.Dao.Employee;
import com.sumanta.RestAPI.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    public List<Employee> getAllEmployee() {

        List<Employee> emp= new ArrayList<Employee>();
        for (Employee emp1 : employeeRepository.findAll()) {
            emp.add(emp1);
        }
        return emp;

    }

    public Employee getEmployeeById(int empid) {

        return employeeRepository.findById(empid).get();

    }

    public void deleteEmployee(int empid) {

        employeeRepository.deleteById(empid);
    }

    public void saveOrUpdate(Employee employee) {

        employeeRepository.save(employee);

    }



}
