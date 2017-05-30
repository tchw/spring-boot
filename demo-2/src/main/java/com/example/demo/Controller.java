package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import com.example.demo.Person;

@RestController
public class Controller {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@RequestMapping("/")
	public List<Person> read() {
		return (List<Person>) jdbcTemplate.query("select * from person", new BeanPropertyRowMapper(Person.class));
	}
}