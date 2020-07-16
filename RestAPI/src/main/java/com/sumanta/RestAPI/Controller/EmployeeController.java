package com.sumanta.RestAPI.Controller;

import java.util.List;

import com.sumanta.RestAPI.Dao.Employee;
import com.sumanta.RestAPI.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



//mark class as Controller
@RestController
public class EmployeeController
{
    //autowire the BooksService class
    @Autowired
    EmployeeService employeeService;
    //creating a get mapping that retrieves all the books detail from the database
    @GetMapping("/EmployeeDetails")
    private List<Employee> getAllEmployee()
    {
        return employeeService.getAllEmployee();
    }
    //creating a get mapping that retrieves the detail of a specific book
    @GetMapping("/Employee/{empid}")
    private Employee getEmployeeById(@PathVariable("empid") int empid)
    {
        return employeeService.getEmployeeById(empid);
    }
    //creating a delete mapping that deletes a specified book
    @DeleteMapping("/Employee/{empid}")
    private void deleteEmployee(@PathVariable("empid") int empid)
    {
        employeeService.deleteEmployee(empid);
    }
    //creating post mapping that post the book detail in the database
    @PostMapping("/sumanta")
    private long saveEmployee(@RequestBody Employee employee)
    {
        employeeService.saveOrUpdate(employee);
        return employee.getId();
    }
    //creating put mapping that updates the book detail

}

