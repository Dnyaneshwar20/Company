package com.jspider.JSON.restProject1Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jspider.JSON.restProject1DTO.EmployeeDTO;
import com.jspider.JSON.restProject1Response.EmployeeResponse;
import com.jspider.JSON.restProject1Service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@GetMapping(path = "/hello", produces = { MediaType.APPLICATION_JSON_VALUE })
	public EmployeeResponse hello() {
		EmployeeResponse response = new EmployeeResponse();
		response.setStatus_code(200);
		response.setMsg("OK");
		return response;
	}

	@PostMapping(path = "/insert", produces = { MediaType.APPLICATION_JSON_VALUE }, consumes = {
			MediaType.APPLICATION_JSON_VALUE })
	public EmployeeResponse insert(@RequestBody EmployeeDTO employee) {
		EmployeeResponse response = new EmployeeResponse();
		EmployeeDTO dto = service.insert(employee);
		if (dto != null) {
			response.setStatus_code(200);
			response.setMsg("INSERTED");
			response.setData(dto);
			return response;
		}
		response.setStatus_code(500);
		response.setMsg("FAILURE");
		return response;
	}

	@GetMapping(path = "/search{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public EmployeeResponse search(@PathVariable int id) {
		EmployeeDTO employee = service.search(id);
		EmployeeResponse response = new EmployeeResponse();
		if (employee != null) {
			response.setStatus_code(200);
			response.setMsg("FOUND");
			response.setData(employee);
			return response;
		}
		response.setStatus_code(500);
		response.setMsg("NOT FOUND");
		return response;
	}

}

