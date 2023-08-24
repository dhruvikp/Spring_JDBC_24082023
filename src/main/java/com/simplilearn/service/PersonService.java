package com.simplilearn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.dao.PersonDAO;
import com.simplilearn.model.Person;

@Service
public class PersonService {

	@Autowired
	PersonDAO personDao;
	
	public List<Person> getPersons() {
		return personDao.getPersons();
	}
	
}
