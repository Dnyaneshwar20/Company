package com.jspider.JSON.restProject1Service;

import com.jspider.JSON.restProject1DTO.EmployeeDTO;

public interface EmployeeServiceInterface {

	EmployeeDTO insert(EmployeeDTO employee);

	EmployeeDTO search(int id);

}
