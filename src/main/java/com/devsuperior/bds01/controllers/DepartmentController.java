package com.devsuperior.bds01.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.bds01.dto.DepartmentDTO;
import com.devsuperior.bds01.services.DepartmentService;

//The Resources implements the REST Controller
@RestController   												// Configure this class goes to be a Rest Controller
@RequestMapping(value = "/departments")   						// Always on plural, route Rest resource
public class DepartmentController {

	@Autowired
	private DepartmentService service;
	
	@GetMapping    												// Configure this method goes to be a EndPoint (WebService) 
	public ResponseEntity<List<DepartmentDTO>> findAll() {		// ResponseEntity is a Generic, that encapsulate a answer HTTP
		List<DepartmentDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
