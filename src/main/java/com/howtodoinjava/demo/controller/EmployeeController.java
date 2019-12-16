package com.howtodoinjava.demo.controller;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.howtodoinjava.demo.model.Employee;

@RestController
public class EmployeeController {
	
	@RequestMapping("/getemp")
    public List<Employee> getEmployees() 
    {
		List<Employee> employeesList = new ArrayList<Employee>();
		employeesList.add(new Employee(2 , "Arash" , "kahbasi" ,"aka@gmail.com"));
		employeesList.add(new Employee(1,"Peyman","abbasi","peymanabbasi.sardar@gmail.com"));
		return  employeesList;
    }

}
