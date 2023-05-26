package com.jspider.JSON.restProject1DAO;

import com.jspider.JSON.restProject1DTO.EmployeeDTO;

public interface EmployeeDAOInterface {

	EmployeeDTO insert(EmployeeDTO employee);

	EmployeeDTO search(int id);

}
