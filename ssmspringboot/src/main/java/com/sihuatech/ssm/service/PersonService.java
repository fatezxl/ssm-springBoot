package com.sihuatech.ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sihuatech.ssm.mapper.PersonMapper;
import com.sihuatech.ssm.model.Person;

@Service
public class PersonService {
	//依赖注入
    @Autowired
    PersonMapper personMapper;
    
    public Person selectPersonById(Long id){
    	Person user = personMapper.selectPersonById(id);
		return user;
    }
}
