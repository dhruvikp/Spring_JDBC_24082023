package com.simplilearn.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.simplilearn.model.Person;


@Repository
public class PersonDAO {
	
	@Autowired
	JdbcTemplate template;
	
	
	public List<Person> getPersons() {
		
		return template.query("select * from persons;", new RowMapper<Person> () {

			@Override
			public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
				Person p = new Person();
				p.setId(rs.getInt(1));
				p.setFirstName(rs.getString(2));
				p.setLastName(rs.getString(3));
				return p;
			}
		});
	}
}
