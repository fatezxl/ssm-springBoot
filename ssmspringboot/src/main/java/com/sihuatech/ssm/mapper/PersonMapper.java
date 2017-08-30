package com.sihuatech.ssm.mapper;

import org.springframework.stereotype.Repository;

import com.sihuatech.ssm.model.Person;

@Repository
public interface PersonMapper {
	Person selectPersonById(Long id);
}
