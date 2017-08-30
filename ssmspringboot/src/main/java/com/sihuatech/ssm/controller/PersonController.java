package com.sihuatech.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sihuatech.ssm.model.Person;
import com.sihuatech.ssm.service.PersonService;

//证明是controller层并且返回json
@RestController
public class PersonController {
	
	@Autowired
	PersonService personService;
	
	@RequestMapping("/{id}")
	public Person findPersonById(@PathVariable Long id){
		Person person = personService.selectPersonById(id);
		return person;
	}
}
