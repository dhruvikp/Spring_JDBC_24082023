package com.simplilearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.simplilearn.model.Person;
import com.simplilearn.service.PersonService;

@Controller
public class PersonController {

	@Autowired
	PersonService personService;

	@GetMapping("/listPersons")
	public String listPersons(Model model) {
		
		List<Person> persons = personService.getPersons();
		
		model.addAttribute("personList", persons);
		
		return "listPersons";
	}

}
