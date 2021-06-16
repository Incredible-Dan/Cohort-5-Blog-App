package com.payroll.service.employee;

import com.payroll.data.model.Employee;
import com.payroll.web.exceptions.EmployeeObjectIsNullException;

import java.util.List;

public interface EmployeeService {

    Employee save(Employee employee) ;

    Employee findById(Integer id);

    List<Employee> findAll();

    void deleteById(Integer id);

}
