package com.jspider.JSON.restProject1Response;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jspider.JSON.restProject1DTO.EmployeeDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmployeeResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2634638282061381264L;

	private int status_code;

	private String msg;

	private String description;

	private EmployeeDTO data;
}
