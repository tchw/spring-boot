package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Foo;

@RestController
public class Controller_ {
	@RequestMapping("/")
	public Foo greeting() {
		return new Foo(0, "b");
	}
}
