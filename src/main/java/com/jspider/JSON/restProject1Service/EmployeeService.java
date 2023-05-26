package com.jspider.JSON.restProject1Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspider.JSON.restProject1DAO.EmployeeDAO;
import com.jspider.JSON.restProject1DTO.EmployeeDTO;


@Service
public class EmployeeService implements EmployeeServiceInterface {

	@Autowired
	private EmployeeDAO dao;

	@Override
	public EmployeeDTO insert(EmployeeDTO employee) {
		EmployeeDTO dto = dao.insert(employee);
		return dto;
	}

	@Override
	public EmployeeDTO search(int id) {
		EmployeeDTO employee = dao.search(id);
		return employee;
	}

}
