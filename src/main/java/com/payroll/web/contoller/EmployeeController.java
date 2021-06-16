package com.payroll.web.contoller;

import com.payroll.data.model.Employee;
import com.payroll.service.employee.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("")
    public List<Employee> findAll(){
        return employeeService.findAll();
    }
    @PostMapping("")
    public Employee save(@RequestBody Employee employee){
        return employeeService.save(employee);
    }
    @GetMapping("/{id}")
    public Employee findById(@PathVariable("id") Integer id){
        return  employeeService.findById(id);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Integer id){
        employeeService.deleteById(id);
    }

}
