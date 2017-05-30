package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.jdbc.core.JdbcTemplate;

@Component
public class Startup implements ApplicationListener<ApplicationReadyEvent> {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public void onApplicationEvent(final ApplicationReadyEvent event) {
		System.out.print("Hello");
		jdbcTemplate.execute("CREATE TABLE person ( id serial primary key, fname varchar, lname varchar, email varchar, city varchar, tel varchar )");
		jdbcTemplate.execute("INSERT INTO person ( fname, lname, email, city, tel) VALUES ('a','b','c','d','e')");
		jdbcTemplate.execute("INSERT INTO person ( fname, lname, email, city, tel) VALUES ('f','g','h','i','j')");
		return;
	}
}
