package com.payroll.web.exceptions;

import com.payroll.service.employee.EmployeeService;

public class EmployeeObjectIsNullException extends Throwable{
    public EmployeeObjectIsNullException(){
        super();
    }

    public EmployeeObjectIsNullException(String message) {
        super(message);
    }

    public EmployeeObjectIsNullException(String message, Throwable cause) {
        super(message, cause);
    }
}


